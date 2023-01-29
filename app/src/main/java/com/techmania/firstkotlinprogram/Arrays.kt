package com.techmania.firstkotlinprogram

fun main(args: Array<String>) {
    var age=arrayOf(1,2,3)
    println("First element of array = "+age[0])
    println("Second element of array = "+age.get(1))
    println("Third element of array = "+age[2])

    println("-------------------------------------")

    var cars=arrayOf("Mercedes","BMW","Opel")
    println("First element of array = "+cars[0])
    println("Second element of array = "+cars.get(1))
    println("Third element of array = "+cars[2])

    cars.set(2,"Ford")
    println("---------------------------------------")

    println("First element of array = "+cars[0])
    println("Second element of array = "+cars.get(1))
    println("Third element of array = "+cars[2])

    println("Size of cars array = "+cars.size)

    var carsAndAge= arrayOf("Mercedes",5,"Opel",10)

    println("----------------------------------------")

    println("First element of array = "+carsAndAge[0])
    println("Second element of array = "+carsAndAge.get(1))
    println("Third element of array = "+carsAndAge[2])
    println("Fourth element of array = "+carsAndAge[3])

    //carsAndAge.set(4,20)

}