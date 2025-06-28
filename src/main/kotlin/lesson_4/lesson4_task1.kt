package org.example.lesson_4


const val TOTAL_TABLES: Int = 13

fun main() {
    val bookedToday: Int = 13
    val bookedTomorrow: Int = 9

    println("Доступность столиков на сегодня: ${bookedToday < TOTAL_TABLES}\nДоступность столиков на завтра: ${bookedTomorrow < TOTAL_TABLES}")
}