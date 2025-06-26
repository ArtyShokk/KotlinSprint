package org.example.lesson_2

fun main() {
    val minutesInHour = 60
    val hours = 9
    val minutes = 39
    val departureTimeMinutes = hours * minutesInHour + minutes
    val travelTimeMinutes = 457

    val arrivalTimeMinutes = departureTimeMinutes + travelTimeMinutes

    val arrivalHour = (arrivalTimeMinutes / minutesInHour) % 24
    val arrivalMinute = arrivalTimeMinutes % minutesInHour

    println("Поезд прибудет в %02d:%02d".format(arrivalHour, arrivalMinute))
}