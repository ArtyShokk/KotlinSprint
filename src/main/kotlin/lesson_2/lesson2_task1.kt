package org.example.lesson_2

fun main() {
    val ivanPetrov: Int = 3
    val nikitaSergov: Int = 4
    val sergeyKim: Int = 3
    val sergeyDurakov: Int = 5

    val studentNumber: Int = 4

    val arithmeticMean: Double = (ivanPetrov + nikitaSergov + sergeyKim + sergeyDurakov) / studentNumber.toDouble()
    println("Средний балл: %.2f".format(arithmeticMean))
}