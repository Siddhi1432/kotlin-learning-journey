class Person {
    var name : String = " "
    var age : Int = 0

    fun intro(){
        println("Hi my name is $name & I am $age years old")
    }
}

fun main() {
    var p = Person()
    p.name = "Siddhi"
    p.age = 21
    p.intro()

    val p1 = Person()
    p1.name = "Samu"
    p1.age = 18
    p1.intro()
}