package org.example
import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    val length: Double
        get() = computeLength()

    private fun computeLength(): Double {
        return sqrt(x * x + y * y + z * z)
    }

    fun dotProduct(another: Vector): Double {
        return computeDotProduct(another)
    }

    private fun computeDotProduct(another: Vector): Double {
        return x * another.x + y * another.y + z * another.z
    }
}

fun main() {
    val vector1 = Vector(1.0, 2.0, 3.0)
    val vector2 = Vector(3.0, 2.0, 1.0)

    println("Длина вектора vector1: ${vector1.length}")
    println("Скалярное произведение векторов: ${vector1.dotProduct(vector2)}")
}
