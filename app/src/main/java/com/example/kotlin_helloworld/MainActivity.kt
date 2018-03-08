package com.example.kotlin_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         * Variables
         */

        var name: String;
        var name1: String = "Kishor";  //Initialize

        println("My name  is " + name1);

        /**
         * Constants
         */

        val constVariable: Int = 2
        //constVariable = 7 //Gives error, we cannot reassign new value to constant variable


        var name2 = "Abcdef"
        val constVariable2 = 2


        /**
         * Arrays
         */
        var arr = arrayOf("Apple", "Mango", 2, 4.6) //array of different data types

        var arr1: Array<String> = arrayOf("Apple", "Mango", "Orange")  //array of string data type

        var arr2: Array<Int> = arrayOf(1, 2, 3, 4, 5) //array of integer data type


        /**
         * Major Data Types
         */

        val a: Int = 5
        val b: Float = 5.00f
        val c: Double = 5.00
        val d: Long = 5000000000
        val e: Short = 50
        val f: Byte = 1

        println("Integer " + a);
        println("Float " + b);
        println("Double " + c);
        println("Long " + d);
        println("Short " + d);
        println("Byte " + f);


        /**
         * Characters
         */
        val address: Char
        address = 'K'
        println(address)
        println("$address")  //we can also print like this


        /**
         *Boolean
         */
        val isPresent: Boolean
        isPresent = false
        println(isPresent)
        println("$isPresent")  //we can also print like this

        /**
         *Strings
         */
        val myName: String
        myName = "My name is Kishor"
        println(myName)
        println("$myName")  //we can also print like this

        /**
         * Collections
         */
        val fruits = listOf("Apple", "Banana", "Grapes")

        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)

        val info = mapOf(
                Pair("name", "kishor"),
                Pair("age", "24"))


        println("First fruit = " + fruits.first())  //Outputs Apple
        println("Last fruit = " + fruits.last())   //Outputs Grapes

        println("List of even numbers = " +
                numbers.filter { it % 2 == 0 })   // Outputs [2, 4, 6, 8]

        println("List of odd numbers =  " +
                numbers.filter { it % 2 == 1 }) //Outputs [1, 3, 5, 7]

        println("Name = " + info["name"])  //Outputs kishor
        println("Age = " + info["age"]) //Outputs 24
    }
}
