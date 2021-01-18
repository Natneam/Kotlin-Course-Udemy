package oopInKotlin.inheritance

class Dog(dogName:String) : Animal(dogName) {
    override var message: String = "Hello world from Dog"
    fun bark(){
        println("Wow")
    }
}