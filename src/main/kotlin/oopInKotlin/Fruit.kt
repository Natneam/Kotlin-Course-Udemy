package oopInKotlin

import java.awt.Color

abstract class Fruit(name:String) {
    var name = name
    open var color: Color = Color.GREEN
    abstract var size:Int
    fun show(){
        println("Name: $name color: $color")
    }
    abstract fun treeType()
}

class Apple(name:String, sizeInCmSquared:Int, color: Color?=null,) : Fruit(name){
    override var color: Color = color ?: super.color
    override var size: Int = sizeInCmSquared
    override fun treeType() {
        println("Apple Tree")
    }
}

fun main(){
    var a:Apple = Apple("Apple",20, Color.RED)
    println("Apple\nName: ${a.name}\nColor: ${a.color}\nSize: ${a.size} cm^2")
}