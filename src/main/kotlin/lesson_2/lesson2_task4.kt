package org.example.lesson_2

fun main() {
    val crystals: Int = 7
    val ironOre: Int = 11
    val buffPercentage: Int = 20

    val bonusCrystals: Int = (crystals * buffPercentage / 100).toInt()
    println("Бонусные кристаллы: $bonusCrystals")
    val bonusIronOre: Int = (ironOre * buffPercentage / 100).toInt()
    println("Бонусная железная руда: $bonusIronOre")
}