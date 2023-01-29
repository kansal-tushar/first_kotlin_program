package com.techmania.firstkotlinprogram

fun main(args: Array<String>) {
    var a:String="Hello Kotlin"
    var b:String="Language"
    println(a)
    println(a+" "+b)

    var age:Int=25
    println("Your age is = "+age)

    var x:String="Kotlin"
    var i:Int=x.length
    println("Length of Kotlin = "+i)
    var B:Boolean=x.equals("Java")
    println(B)
    println(x.isEmpty())
    println(x.plus("language"))
    println("**************************")
    println(x.lowercase())
    println("***************************")
    println(x.uppercase())
    println("***************************")
    var t:String="   Android   "
    println(x+t)
    println(x+t.trim())


}