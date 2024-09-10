package org.example

class Point(var x: Int, var y: Int) {
    override fun toString(): String {
        return "Текущие координаты: ($x, $y)"
    }
}

enum class Command {
    UP, DOWN, LEFT, RIGHT
}

class Turtle {
    fun move(point: Point, command: Command) {
        when (command) {
            Command.UP -> {
                point.y++
                println("Перемещение вверх: увеличено Y на 1")
            }
            Command.DOWN -> {
                point.y--
                println("Перемещение вниз: уменьшено Y на 1")
            }
            Command.LEFT -> {
                point.x--
                println("Перемещение влево: уменьшено X на 1")
            }
            Command.RIGHT -> {
                point.x++
                println("Перемещение вправо: увеличено X на 1")
            }
        }
        println(point)
    }
}

fun main() {
    val initialPoint = Point(0, 0)
    val turtle = Turtle()

    println("Начальная точка: $initialPoint")

    turtle.move(initialPoint, Command.UP)
    turtle.move(initialPoint, Command.RIGHT)
    turtle.move(initialPoint, Command.DOWN)
    turtle.move(initialPoint, Command.LEFT)
}
