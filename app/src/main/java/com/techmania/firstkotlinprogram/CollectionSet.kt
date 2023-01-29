package com.techmania.firstkotlinprogram

fun main(args: Array<String>) {
    var myArrayList=arrayListOf<Any>("Kotlin",2,2.5,'K',true,"Kotlin")
    println(myArrayList.size)
    println(myArrayList.last())
    println("--------------------------------------")
    var mySetArray=setOf<Any>("Kotlin",2,2.5,'K',true,"Kotlin")
    println(mySetArray.size)
    println(mySetArray.last())
}