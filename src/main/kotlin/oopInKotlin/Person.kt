package oopInKotlin
// writing constructor (primary)
class Person (firstName:String, var age:Int) {
    var firstName:String = ""
    var lastName:String = ""
    var address:String = "Nowhere"
    var message:String = "Hello everyone my Name is : $firstName and I am $age"
//    to do some thing when initialized we can do
    init{
        println("${firstName[0]}")
    println("Greetings from the first constructor")
    }

//    for secondary constructor we use
    constructor(firstName:String, lastName:String, age:Int, address:String) :this(firstName, age){
        this.address = address
        this.lastName = lastName
        println("Greetings from the second constructor")
    }

//    we can also overload constructors as well
    constructor(firstName: String) : this(firstName, 0){
        println("Greetings from the 3rd constructor")
    }

}

fun main(){
    /* var person1:Person = Person("Sam", 24)
    println("Name: ${person1.firstName} \nAge: ${person1.age} \nHis Message: ${person1.message}") */
//    var person2:Person = Person("Elon", "Musk", 41, "USA")
//    println("=============================================")
//    println("Name: ${person2.firstName} ${person2.lastName} \nAge: ${person2.age} \nAddress: ${person2.address}")
//    var person3:Person = Person("Bill Gets")
//    println("Name: ${person3.firstName} ${person3.lastName} \nAge: ${person3.age} \nAddress: ${person3.address}")

}