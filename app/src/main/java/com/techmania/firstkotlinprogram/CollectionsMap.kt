package com.techmania.firstkotlinprogram

fun main(args: Array<String>) {
    //immutable
    println("----------immutable map of--------------")
    var age=mapOf<String,Int>("david" to 20,"ronaldo" to 25)
    println("Age of David : "+age["david"])
    println("Age of Ronaldo : "+age["ronaldo"])
    //mutable
    var mutableAge=mutableMapOf<String,Int>("david" to 20,"ronaldo" to 25)
    mutableAge.put("buffon",30)
    println("-------------mutable map of---------------")
    println("Age of David : "+mutableAge["david"])
    println("Age of Ronaldo : "+mutableAge["ronaldo"])
    println("Age of Buffon : "+mutableAge["buffon"])
}