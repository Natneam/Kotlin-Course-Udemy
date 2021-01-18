package oopInKotlin.inheritance

open class Animal(name:String){
    var name:String = ""
    open var message:String = "Hello World from Animal"
    init{ this.name = name}

    open fun walk():String{
        return "Walking in 4 legs"
    }
    fun eat():String{
        return  "Eating"
    }
}