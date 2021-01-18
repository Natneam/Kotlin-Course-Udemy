package oopInKotlin

fun main(){
//    we can call enums using Value eg. Colors.BLACK
    println(Colors.BLACK)
//    we can access value of an enum using value name Colors.RED.ValueName
    println(Colors.BLACK.colorValue)
//    We can know the zero indexed index of an enum in a class using ordinal attribute eg. Colors.RED.ordinal
    println(Colors.BLACK.ordinal)
//    we can know the value of an interface using name keyword
    println(Colors.BLACK.name)
// we can loop through enum values using for loop with values function
    for (color in Colors.values()) print("$color ")
    println()
    println(Colors.valueOf("BLACK").colorValue)
    Colors.RED.printColorValue() // we can define our own function in enums as well nut we
    // have to define it or make abstract first in top level enum class
    demonstrate(Colors.GREEN) // we can use when switch statement in enums as well

//    we can implement interface on enum class
    println(Colors.RED.testFunc())
    Colors.RED.testString
//    we can nest enum classes
    println(Colors.subColors.ORANGE)
}

enum class Colors(var colorValue:String):TestInterface{
    RED("#FF0000"){
                  override fun printColorValue(){
                      println("I'm RED and My color value is: ${super.colorValue}")
                  }
        override var testString:String = "Made by Mr x"
        override fun testFunc(){
            println("Greetings from test Function in Red")
        }
                  },
    BLUE("#0000FF"){
        override var testString:String = "Made by Mr x"
        override fun testFunc(){
            println("Greetings from test Function in BLUE")
        }
                   },
    GREEN("#00FF00"){
        override var testString:String = "Made by Mr x"
        override fun testFunc(){
            println("Greetings from test Function in GREEN")
        }
                    },
    WHITE("#FFFFFF"){
        override var testString:String = "Made by Mr x"
        override fun testFunc(){
            println("Greetings from test Function in White")
        }
                    },
    BLACK("#000000"){
        override var testString:String = "Made by Mr x"
        override fun testFunc(){
            println("Greetings from test Function in Black")
        }
    };

    enum class subColors{
        PURPLE,
        ORANGE
    }
    ;

    open fun printColorValue(){}
}

fun demonstrate(color:Colors){
    when(color){
        Colors.RED -> println("I'm RED")
        Colors.GREEN -> println("I'm GREEN")
        Colors.WHITE -> println("I'm WHITE")
    }
}
interface TestInterface{
    var testString:String
    fun testFunc()
}