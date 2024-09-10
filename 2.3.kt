package org.example

fun main() {
    val numbers = arrayOf(3, 7, 2, 8, 1, 5)

    val (productFor, minFor, maxFor) = calculateFor(numbers)
    println("Используя for (произведение, минимальное, максимальное): $productFor, $minFor, $maxFor")

    val (productWhile, minWhile, maxWhile) = calculateWhile(numbers)
    println("Используя while (произведение, минимальное, максимальное): $productWhile, $minWhile, $maxWhile")

    val productReduce = numbers.reduce { acc, num -> acc * num }
    val minReduce = numbers.minOrNull()
    val maxReduce = numbers.maxOrNull()
    println("Используя reduce (произведение, минимальное, максимальное): $productReduce, $minReduce, $maxReduce")

    val (productForEach, minForEach, maxForEach) = calculateForEach(numbers)
    println("Используя forEach (произведение, минимальное, максимальное): $productForEach, $minForEach, $maxForEach")
}

fun calculateFor(array: Array<Int>): Triple<Int, Int, Int> {
    var product = 1
    var min = array[0]
    var max = array[0]
    for (number in array) {
        product *= number
        if (number < min) min = number
        if (number > max) max = number
    }
    return Triple(product, min, max)
}

fun calculateWhile(array: Array<Int>): Triple<Int, Int, Int> {
    var index = 0
    var product = 1
    var min = array[0]
    var max = array[0]
    while (index < array.size) {
        product *= array[index]
        if (array[index] < min) min = array[index]
        if (array[index] > max) max = array[index]
        ++index
    }
    return Triple(product, min, max)
}

fun calculateForEach(array: Array<Int>): Triple<Int, Int, Int> {
    var product = 1
    var min = array[0]
    var max = array[0]
    array.forEach {
        product *= it
        if (it < min) min = it
        if (it > max) max = it
    }
    return Triple(product, min, max)
}
