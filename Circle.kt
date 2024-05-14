package school21

import kotlin.math.pow
import kotlin.math.sqrt

class Circle(private val x: Double, private val y: Double, private val r: Double) {

    fun defineIntersection(other: Circle) : String {
        if (this == other) println("Circles are coincide")
        val result = sqrt((other.x - this.x).pow(2) + (other.y - this.y).pow(2))
        val sumRadius = this.r + other.r
        val resultString = when {
            result < sumRadius -> "the circles intersect"
            result == sumRadius -> "the circles touch each other"
            result <= other.r - this.r -> "the circle 1 is inside circle 2"
            result <= this.r - other.r -> "the circle 2 is inside circle 1"
            else -> {"the circles do not intersect"}
        }
        return resultString
    }

}