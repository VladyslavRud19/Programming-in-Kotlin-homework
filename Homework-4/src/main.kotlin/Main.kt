import java.util.concurrent.Callable

fun main() {
    val tasks: List<Callable<Any>> = listOf(
        Callable { 42 },
        Callable { "Hello, Kotlin!" }
    )

    val app = Application.create("results.txt", tasks)
    app.run()
    app.waitToFinish()
}
