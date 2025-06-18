package org.example.lesson_1

fun main() {
    val secondsFull: Short = 6480
    val hours: Int = (secondsFull / 60) / 60
    val minutes: Int = (secondsFull / 60) % 60
    val seconds: Int = secondsFull % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}