package org.jub.kotlin.hometask4

// Приклади задач
val intTasks = listOf(
    { 1 + 1 },
    { 2 * 2 }
)

val stringTasks = listOf(
    { "Hello, " + "world!" },
    { "Kotlin".uppercase() }
)

val enumTasks = listOf(
    { Color.BLUE },
    { Color.RED }
)

val dataClassTasks = listOf(
    { CountryPopulation("Ukraine", 42000000) },
    { CountryPopulation("Poland", 38000000) }
)

val tasks = intTasks + stringTasks + enumTasks + dataClassTasks

// Приклади використання enum та data class
enum class Color {
    BLACK,
    BLUE,
    CYAN,
    DARK_GRAY,
    GRAY,
    GREEN,
    LIGHT_GRAY,
    MAGENTA,
    ORANGE,
    PINK,
    RED,
    WHITE,
    YELLOW,
    ;
}

data class CountryPopulation(val country: String, val population: Int)
