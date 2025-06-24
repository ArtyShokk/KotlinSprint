package org.example.lesson_2

fun main() {
    val departureTimeMinutes = 9 * 60 + 39
    val travelTimeMinutes = 457

    val arrivalTimeMinutes = departureTimeMinutes + travelTimeMinutes

    val arrivalHour = (arrivalTimeMinutes / 60) % 24
    val arrivalMinute = arrivalTimeMinutes % 60

    println("Поезд прибудет в ${"%02d".format(arrivalHour)}:${"%02d".format(arrivalMinute)}")
}