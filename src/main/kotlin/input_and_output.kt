import java.util.Scanner

fun main(){
    var scanner = Scanner(System.`in`)
    println("================Adding Machine================")
    print("Enter first number: ")
    var num1:Int = scanner.nextInt()
    print("Enter second number: ")
    var num2:Int = scanner.nextInt()
    
    println("SUM is : ${num1+num2}")

    print("Enter your name: ")
    var name:String = readLine().toString()
    println("Your name is $name")
}