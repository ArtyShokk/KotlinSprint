package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val initialDepositAmount: Int = 70_000
    val depositInterestRate: Double = 16.7
    val depositTerm: Int = 20

    val finalAmount: Double = initialDepositAmount * (1 + depositInterestRate / 100).pow(depositTerm.toDouble())

    println("Размер вклада через 20 лет составит: ${String.format("%.3f", finalAmount)}")

}