package org.example.lesson_1

fun main() {
    val yearOfFlight: Int = 1961
    var hour: UByte = 9U
    var minute: UByte = 7U

    println(yearOfFlight)
    println(hour)
    println(minute)

    hour = 10U
    minute = 55U

    println("Время посадки $hour:$minute")
}