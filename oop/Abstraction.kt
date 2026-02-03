abstract class Shape{
    abstract fun area():Double
}

class Rectangle(private val length:Double, private val width:Double):Shape() {
    override fun area():Double{
        return length * width
    }
}

interface Drawable{
    fun draw()
}

class Circle(private val radius:Double):Shape(),Drawable {
    override fun area(): Double{
        return Math.PI * radius * radius
    }

    override fun draw(){
        println("Drawing circle")
    }
}

class Triangle(private val base:Double, private val height:Double) :Shape(){
    override fun area():Double{
        return 0.5 * base * height
    }
}

 fun main() {
    val rect :Rectangle = Rectangle(2.5, 2.5)
    println("Reactangle area: ${rect.area()}")

    val cir:Circle = Circle(2.5)
    println("Circle area: ${cir.area()}")
    cir.draw()

    val triangle: Triangle = Triangle(2.5, 2.5)
    println("Triangle area: ${triangle.area()}")
}