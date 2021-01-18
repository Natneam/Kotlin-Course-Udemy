package oopInKotlin

data class Student(val firstName:String, val lastName:String, val IdNum:Int)

fun main(){
    var student1 = Student("Bekele", "Gerima", 43)
    var student2 = Student("Jhon", "Poker", 23)
//    if we use data class we can print the data (not memory location) using normal print function on the object
    println(student1)
//    we can make isEqual operation on tow data class which will compare the data value
    println(student1 == student2)

//    we can mutate our data class value even if the are immutable (with val keyword) by using copy
//    student1.IdNum = 56 doesn't work because IdNum is value
    var student3 = student1.copy(IdNum = 10)
    println(student3.IdNum)
//    we can also access enum values using componentN function
    println(student1.component2())

}