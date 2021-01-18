package oopInKotlin

fun main(){
    for (i in 'A'..'Z'){
        Alphabet.letters.add(i)
    }

    for (j in Alphabet.letters){
        print("$j ")
    }
    println()

    var smartPhone = object:Computer(){
        override fun Ok(){
            print("Home Key presses")
        }
    }

}

// this class automatically implements the singleton pattern
object Alphabet{
    var letters = arrayListOf<Char>()
}

open class Computer{
    open fun Ok(){
        println("Super key pressed")
    }
    fun stop(){
        println("Stopping...")
    }
}