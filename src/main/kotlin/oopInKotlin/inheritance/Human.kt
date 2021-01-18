package oopInKotlin.inheritance

class Human(humanName:String) : Animal(humanName) {
    override var message: String = "Hello world from Human"
    override fun walk(): String {
        return "Walking in 2 legs"
    }
    fun speak(){
        println("My Man, I'm speaking")
    }
}