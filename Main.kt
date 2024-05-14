package school21

fun main() {
    val circle1: Circle = initCircle(1)
    val circle2: Circle = initCircle(2)
    val result: String = circle1.defineIntersection(circle2)
    println("Result: $result")
}

    fun setValue(): Double {
        while (true) {
            try {
                val rez: Double = readln().toDouble()
                return rez
            } catch (e: Exception) {
                println("Couldn't parse a number. Please, try again")
            }
        }
    }

   fun initCircle(numberCircle: Int) : Circle {
       println("Input x$numberCircle: ")
       val x = setValue()
       println("Input y$numberCircle: ")
       val y = setValue()
       println("Input r$numberCircle: ")
       val r = setValue()
       return Circle(x, y, r)
   }