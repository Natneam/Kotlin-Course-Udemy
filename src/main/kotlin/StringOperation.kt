fun main(){
//    stringEqualityOperation("Kebede", "Yilma")
//    stringCompareToOperation("Kebede", "kebede")
//    stringReplaceOperation("Hey, How are you?", "Hey", "Hi")
//    stringSplitOperation("Hello world how are you", " ")
//    stringGetOperation("Hey you!!", 4)
//    stringPlusOperation("abracadabra", "mumbojumbo")
    stringDropAndDropLastOperation("Abracadabra", 6)
}



fun stringEqualityOperation(a:String, b:String){
    // we can check equality of two strings using == operator
    if (a==b){
        println("String a: $a equals b: $b")
    }else{
        println("String a: $a not equals b: $b")
    }
}

fun stringCompareToOperation(a:String, b:String){
    // we can check equality using compare two method
    var value = a.compareTo(b, true)
    if (value == 0){
        println("String a: $a equals b: $b")
    }else if (value < 0){
        println("String $a comes first in lexical order")
    }else{
        println("String $b comes first, in lexical order")
    }
}

fun stringReplaceOperation(original:String, oldVal:String, newVal:String){
    // we can take a string and replace a sequence of character and return it without modifying the original string
    val replaced = original.replace(oldVal, newVal)
    println(replaced);
}

fun stringSplitOperation(original: String, delimiter:String){
//    splitting string with delimiter
    val splitString = original.split(" ");
    println("Original String: $original")
    println("Split list of String: $splitString");
    for (s:String in splitString){
        println(s)
    }

}

fun stringGetOperation(original: String, index:Int){
//    indexing string
    println("Character at index $index is ${original.get(index)}")
}

fun stringPlusOperation(original: String, newAddedString: String){
//    concatenating string using plus operator
    val concatenatedString:String = original.plus(newAddedString)
    println("$original concatenated with $newAddedString is $concatenatedString")
}

fun stringDropAndDropLastOperation(original: String, dropNum:Int){
    // drop method returns new string after removing the first n elements
    // dropLast method returns new string after removing the last n elements
    val value = original.drop(dropNum)
    val valueLastRemoved = original.dropLast(dropNum)

    println("Original String <$original> after removing the first $dropNum characters is $value")
    println("Original String <$original> after removing the last $dropNum characters is $valueLastRemoved")
}