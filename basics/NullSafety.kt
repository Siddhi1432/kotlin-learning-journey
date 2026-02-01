fun main(){
    var name : String? = "Siddhi"
    println(name?.length)

    name = null
    println(name?.length)

    var length = name?.length ?:0
    println("Length is: $length")

    println("Enter name")
    var username = readLine()

    if(username.isNullOrBlank()){
        println("Name not provided")
    } else {
        println("Length : ${username.length}")
    }
}