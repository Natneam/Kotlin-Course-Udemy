package oopInKotlin.modifiers

fun main(){
    var p:Person = Person("Jhon") // because the class is public
    println("Name attribute in person class is ${p.name}") // because name attribute in Person class is public
//    println("Gender attribute in person class is ${p.gender}") // this won't work because gender is have
                                                                // private access modifier
}