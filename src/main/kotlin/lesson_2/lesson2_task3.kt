package org.example.lesson_2

fun main() {
    val minutes = 60
    val departureTimeMinutes = 9 * minutes + 39
    val travelTimeMinutes = 457

    val arrivalTimeMinutes = departureTimeMinutes + travelTimeMinutes

    val arrivalHour = (arrivalTimeMinutes / minutes) % 24
    val arrivalMinute = arrivalTimeMinutes % minutes

    println("Поезд прибудет в %02d:%02d".format(arrivalHour, arrivalMinute))
}