class Person(var name: String, var age: Int)

fun main() {

    // let – null safety & transformations
    var name: String? = "Sid"
    name?.let {
        println("Name length: ${it.length}")
    }

    // apply – object configuration
    val person = Person("Unknown", 0).apply {
        name = "Sid"
        age = 22
    }
    println("Person after apply: ${person.name}, ${person.age}")

    // also – side effects (logging, debugging)
    person.also {
        println("Created person: ${it.name}")
    }

    // run – operate on object & return result
    val intro = person.run {
        "My name is $name and I am $age years old"
    }
    println(intro)

    // with – group operations
    with(person) {
        println("With -> Name: $name")
        println("With -> Age: $age")
    }

    val car = Car("Thar").apply{
        brand = "Tata"
    } 
    println("Car after apply : ${car.brand}")

    car.also{
        println("Car's Brand : ${it.brand}")
    }
}

class Car(var brand : String)
