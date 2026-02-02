open class Animal{
    open fun sound(){
        println("Animal makes sound")
    }
}

class Dog : Animal(){
    override fun sound(){
        println("Dog Barks")
    }
}

class Cat : Animal(){
    override fun sound(){
        println("Cat meows")
    }
}

fun main() {
    val d : Dog = Dog()
    d.sound()

    val c : Cat = Cat()
    c.sound()
}