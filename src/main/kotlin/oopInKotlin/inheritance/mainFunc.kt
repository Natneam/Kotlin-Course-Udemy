package oopInKotlin.inheritance

fun main(){
// lets Create an animal in here
    var animal:Animal = Animal("Demo Animal")
    println("Animal\nName: ${animal.name} \n${animal.name} is : ${animal.eat()} " +
            "while ${animal.walk()} \nMessage:${animal.message}")
    println("=============================================")
    // lets create human class in here
    var nick: Human = Human("Nickolas")
    println("Human\nName: ${nick.name} \n${nick.name} is : ${nick.eat()} " +
            "while ${nick.walk()} \nMessage: ${nick.message}")
    println("=============================================")
    var max:Dog = Dog("Max")
    println("Dog\nName:${max.name} \n${max.name} is : ${max.eat()}" +
            " while ${max.walk()} \nMessage: ${max.message}")
}