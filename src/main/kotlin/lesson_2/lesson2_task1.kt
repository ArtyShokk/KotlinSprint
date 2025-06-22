package org.example.lesson_2

fun main() {
    val studentNumber: Int = 4
    val arithmeticMean: Double = (3 + 4 + 3 + 5) / studentNumber.toDouble()

    println("Средний балл: %s".format("%.2f".format(arithmeticMean)))
}