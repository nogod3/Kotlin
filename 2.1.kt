package org.example

fun main() {
    print("Введите количество простых чисел: ")
    val countLimit = readLine()?.toIntOrNull() ?: return

    var count = 0
    var currentNumber = 2

    while (count < countLimit) {
        if (isPrime(currentNumber)) {
            count++
            println("${count}-ое простое число: $currentNumber")
        }
        currentNumber++
    }
}

// Функция для проверки, является ли число простым
fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    for (i in 3..Math.sqrt(num.toDouble()).toInt() step 2) {
        if (num % i == 0) return false
    }
    return true
}
