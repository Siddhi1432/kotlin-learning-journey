fun main(){
    print("Enter marks: ")
    val marks = readLine()?.toIntOrNull()

    when(marks){
        in 90..100 -> print("A")
        in 75..89 -> print("B")
        in 50..74 -> print("C")
        else -> print("Fail")
    }


}