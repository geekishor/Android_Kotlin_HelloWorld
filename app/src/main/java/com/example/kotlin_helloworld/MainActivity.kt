package com.example.kotlin_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         * If else
         */

        var a = 5
        var b = 7

        if (a == b) {
            println("A and B are equal")
        } else {
            println("A and B are not equal")
        }


        /**
         * New feature
         */

        var result: Int = 0

        result = if (a < b) {
            a
        } else {
            b
        }

        println(result)

        /**
         * Switch case as When in Kotlin
         */

        when (a) {
            1 -> println("a is equal to 1")
            2 -> println("a is equal to 2")
            3 -> println("a is equal to 3")
            4 -> println("a is equal to 4")
            5 -> println("a is equal to 5")
            else -> println("not found")             //same like default in Java
        }


        /**
         * when as expression
         */

        var result1: String = ""
        result1 = when (a) {
            1 -> "a is equal to 1"
            2 -> "a is equal to 2"
            3 -> "a is equal to 3"
            4 -> "a is equal to 4"
            5 -> "a is equal to 5"
            else -> "not found"            //same like default in Java
        }

        println(result1)

    }
}
