package oopInKotlin

interface Animal{
    var type:String
    var name:String
    fun sayName(){
        println("Hello Everyone My name is $name")
    }
    fun sayType()
}

interface Ghost{
    var type:String
    fun sayName(){
        println("Hello Every One I'm Ghost")
    }
}

class Human:Animal, Ghost{
    override var type = "Human"
    override var name = "Jack"
    override fun sayType() {
        println("Hi I'm $name")
    }

    override fun sayName() {
        if (type == "Animal") {
            super<Animal>.sayName()
        }else if (type == "Human"){
                super<Animal>.sayName()
        }else{
            super<Ghost>.sayName()
        }
    }
}

fun main(){
    var h = Human()
    h.sayType()
    h.sayName()

}