fun main(args: Array<String>) {
    var firstName = "Will"
    var lastName = "Smith"
    // traditional way of concatenating strings
    println("Hey "+firstName+lastName+", How are you?")
    // string interpolation
    println("Hey $firstName $lastName, How are you?")
    var int1= 10
    var int2= 100
    println("Operator: * Result: ${int1*int2}")
}