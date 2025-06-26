package org.example.lesson_2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    val hours = 9
    val minutes = 39
    val departureTimeMinutes = hours * MINUTES_IN_HOUR + minutes
    val travelTimeMinutes = 457

    val arrivalTimeMinutes = departureTimeMinutes + travelTimeMinutes

    val arrivalHour = (arrivalTimeMinutes / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinute = arrivalTimeMinutes % MINUTES_IN_HOUR

    println("Поезд прибудет в %02d:%02d".format(arrivalHour, arrivalMinute))
}