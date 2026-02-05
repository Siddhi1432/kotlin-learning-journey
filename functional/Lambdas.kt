fun operateOnNumbers(a : Int, b:Int, operation:(Int,Int) -> Int):Int{
    return operation(a,b)
}

fun main() {
    val sum = operateOnNumbers(10, 20) { x,y -> x+y }
    val multiply = operateOnNumbers(10, 20) { x,y -> x*y }

    println("Sum: $sum")
    println("Multiply: $multiply")

    val numbers = listOf(1,2,3,4,5)
    val sqauredNumbers = numbers.map{it * it}
    println("Square: $sqauredNumbers")

    val even = numbers.filter{it % 2 == 0}
    println("Even numbers: ")
    even.forEach{
        println(it)
    }
}