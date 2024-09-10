package org.example

fun main() {
    var totalSum = 0
    var numberCount = 0
    var userInput: String?

    do {
        print("Введите число: ")
        userInput = readlnOrNull()

        userInput?.toIntOrNull()?.let { number ->
            if (number != 0) {
                totalSum += number
                numberCount++
            }
        }
    } while (userInput?.toIntOrNull() != 0)

    println("Количество чисел: $numberCount")
    println("Сумма чисел: $totalSum")
    
    if (numberCount > 0) {
        val averageValue = totalSum.toDouble() / numberCount
        println("Среднее значение: $averageValue")
    } else {
        println("Невозможно вычислить среднее, так как числа не были введены.")
    }
}
