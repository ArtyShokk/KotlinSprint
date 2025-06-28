package org.example.lesson_3

fun main() {
    val inputData = "D2-D4;0"

    val parts = inputData.split("-", ";")

    val fromPosition = parts[0]
    val toPosition = parts[1]
    val moveNumber = parts[2].toInt()

    println("Откуда: $fromPosition")
    println("Куда: $toPosition")
    println("Номер хода: $moveNumber")
}