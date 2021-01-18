package oopInKotlin.modifiers
// public private protected internal
// by default every class, property and method have public modifier
// protected modifier can only be used in inner elements in class (on methods, and properties) and it is
// accessible in side the class and in inherited classes
open class Person(name:String) {
    var name:String = ""
    private var gender:Char = 'M'
    internal var a:String = "I'm Internal"
    protected var b:String = "I'm Protected"
    fun speak(){
        println("Speaking")
    }
}

internal class Child(name:String):Person(name){ // internal access modifier only
                                                // allow us to access the class,fun, property at modular
                                                // level no beyond, module is top level
                                                // folder in project folder with
                                                // no package and contains
    var message = "I'm Child"
    // I can not access gender because it is private even if this class inherits Person class
    var test = "hey, $a" // I can access because it is protected
}

fun test(){
    println("Testing out there")
}