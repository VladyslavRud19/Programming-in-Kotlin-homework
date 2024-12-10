import java.io.File
import java.util.concurrent.Callable

interface Application : Runnable {
    fun waitToFinish() {}

    companion object {
        fun create(resultsFile: String, tasks: List<Callable<Any>>): Application {
            return object : Application {
                override fun run() {
                    val results = tasks.mapIndexed { index, task ->
                        try {
                            "Task $index: ${task.call()}"
                        } catch (e: Exception) {
                            "Task $index failed: ${e.message}"
                        }
                    }
                    File(resultsFile).writeText(results.joinToString("\n"))
                }

                override fun waitToFinish() {
                    // Логіка завершення
                }
            }
        }
    }
}
