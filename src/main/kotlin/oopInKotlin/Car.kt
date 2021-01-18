package oopInKotlin

class Car{
    var model:String = ""
    var company:String = ""
}

fun main(){
    // creating object
    var c:Car = Car();
    c.model = "Tesla X"
    c.company = "Tesla"

    println("The car model is ${c.model} from ${c.company} company")
}