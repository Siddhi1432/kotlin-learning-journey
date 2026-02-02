class Person(var name:String,var age: Int){
    init{
        if(age > 18){
            println("Person object creates: $name")
        }
    }

    fun introduce() {
        println("Hi my name is $name & I am $age years old")
    }
}

fun main() {
    val person1 = Person("Siddhi", 21)
    person1.introduce()

    val person2 = Person("Samu", 17)
    person2.introduce()
}