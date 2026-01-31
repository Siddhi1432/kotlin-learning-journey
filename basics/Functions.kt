fun greetUser(name : String){
    println("Hello, $name!")
}

fun add(num1: Int, num2: Int): Int{
    return num1+num2
}

fun isEven(num : Int): Boolean{
    return num % 2 == 0
}

fun main(){
    greetUser("Siddhi")

    var sum = add(2,3)
    println(sum)

    var num = 4
    println("is $num even? ${isEven(num)}")
}