package org.example.lesson_3


fun main() {
    var fromPosition = "E2"
    var toPosition = "E4"
    var moveNumber = 1

    val firstMoveString = "$fromPosition-$toPosition;$moveNumber"
    println(firstMoveString)

    fromPosition = "D2"
    toPosition = "D3"
    moveNumber++

    val nextMoveString = "$fromPosition-$toPosition;$moveNumber"
    println(nextMoveString)
}
