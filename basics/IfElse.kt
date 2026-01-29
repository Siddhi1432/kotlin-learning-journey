fun main(){
    println("Enter Age:")
    val age = readLine()?.toInt()

    if(age != null){
        if(age >= 18) {
            println("Eligible")
        } else if(age < 0){
            println("Age Can not be negative")
        }
        else{
            println("Not Eligible")
        } 
    } else println("Invalid Age")
}