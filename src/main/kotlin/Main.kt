fun main(){
    val add=sumArray(arrayOf(90,2,4,5,6))
    println(add)

    val com = commonElements(arrayOf(90,89,56,40), arrayOf(60,89,90,88))
    println(com.contentToString())

    val maxi= maximum(arrayOf(40,3,56,23,90,88))
    println(maxi)


    val rever = reverseArray(arrayOf(89,45,23,10,67))
    println(rever.contentToString())

    val evens= evenOnly(arrayOf(56,98,77,54,33))
    println(evens.contentToString())

    var vowel = startVowel(arrayOf("Anna","Betty","Grace","Elena","india"))
    println(vowel.contentToString())



}
//Write a Kotlin function that takes an array of integers as input and returns the sum of all the elements in the array.
fun sumArray(a:Array<Int>):Int{
    var sum=0
    for (a in a){
        sum+=a
    }
    return sum

}
//Write a Kotlin function that takes two arrays of integers as input and returns a
//new array that contains the elements that are common to both input arrays.
fun commonElements(x:Array<Int>,y:Array<Int>):IntArray{
    var  common= emptyArray<Int>()
    for (element in x){
        if(element in y && element !in common){
            common+=element

        }
    }
return common.toIntArray()
}
//Write a Kotlin function that takes an array of integers as input and returns the maximum element in the array.
fun maximum(num:Array<Int>):Int?{
    if (num.size<=1){
        return null
    }
    else{

       return num.max()
    }

}
//Write a Kotlin function that takes an array of integers as input and returns a new array that contains the same elements as the input array, but in reverse order.
fun reverseArray(n:Array<Int>):Array<Int>{
    return n.reversedArray()
}
//Write a Kotlin function that takes an array of integers as input and returns a new array that contains only the even elements of the input array.
fun evenOnly(numbs:Array<Int>):Array<Int>{
    var even = emptyArray<Int>()
    for (n in numbs){
        if (n%2 ==0){
            even+= n
        }
    }
    return even
}

//Write a Kotlin function that takes an array of strings as input and returns a new array that contains only the strings that start with a vowel.
fun startVowel(names:Array<String>):Array<String>{
    var vowels = arrayOf<Char>('a','e','i','0','u','A','E','I','O','U')
    var newArray = emptyArray<String>()
    for (n in names){
        if (n[0] in vowels){
            newArray+=n
        }
    }
return newArray
}
//Write a Kotlin function that takes an array of integers as input and returns the second largest element in the array.






