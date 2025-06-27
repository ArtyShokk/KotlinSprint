package org.example.lesson_3

fun main() {
    print("Введите число: ")
    val number = readln().toInt()

    val table = """
        |${number}x1=${number*1}
        |${number}x2=${number*2}
        |${number}x3=${number*3}
        |${number}x4=${number*4}
        |${number}x5=${number*5}
        |${number}x6=${number*6}
        |${number}x7=${number*7}
        |${number}x8=${number*8}
        |${number}x9=${number*9}
    """.trimMargin()

    println(table)
}