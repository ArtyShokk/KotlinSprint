package org.example.lesson_1

fun main() {
    val secMin: Int = 60
    val secondsFull: Short = 6480
    val hours: Int = (secondsFull / secMin) / secMin
    val minutes: Int = (secondsFull / secMin) % secMin
    val seconds: Int = secondsFull % secMin

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}