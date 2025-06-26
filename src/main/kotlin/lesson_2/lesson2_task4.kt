package org.example.lesson_2

fun main() {
    val crystals: Int = 7
    val ironOre: Int = 11
    val buffPercentage: Int = 20
    val percent: Int = 100

    val bonusCrystals: Int = (crystals * buffPercentage / percent).toInt()
    println("Бонусные кристаллы: $bonusCrystals")
    val bonusIronOre: Int = (ironOre * buffPercentage / percent).toInt()
    println("Бонусная железная руда: $bonusIronOre")
}