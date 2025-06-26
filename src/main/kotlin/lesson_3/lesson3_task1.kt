package org.example.lesson_3

fun main() {
    val goodMorning: String = "Доброе утро"
    val goodAfternoon: String = "Добрый день"
    val goodNight: String = "Добрый вечер"

    val name: String = "Артём"

    var greetings: String = "${goodMorning}, ${name}!"
    println(greetings)
    greetings = "${goodNight}, ${name}!"
    println(greetings)

}