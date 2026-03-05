fun main(){
    try {
        print("Enter First Number : ")
        val number = readLine()?.toInt() ?:0
        println("Number = $number")

        print("Enter Second Number : ")
        val number1 = readLine()?.toInt() ?:0

        println("Division = ${number/number1}")
    }
    catch(e : NumberFormatException) {
        println("Invalid Number")
    }
    catch(e : ArithmeticException){
        println("Divide by zero is not possible")
    }
    finally{
        println("Program finished")
    }
}