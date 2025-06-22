package org.example.lesson_2

fun main() {
    // баллы по английскому языку
    val IvanPetrov: Int = 3
    val NikitaSergov: Int = 4
    val SergeyKim: Int = 3
    val SergeyDurakov: Int = 5

    val studentNumber: Int = 4

    val arithmeticMean: Double = (IvanPetrov + NikitaSergov + SergeyKim + SergeyDurakov) / studentNumber.toDouble()
    println("Средний балл: %.2f".format(arithmeticMean))
}