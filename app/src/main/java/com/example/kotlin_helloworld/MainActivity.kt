package com.example.kotlin_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Ranges
         */

        var range = 1..10  //this means 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        for (i in range) {
            println(i)
        }

        //Output: 1 2 3 4 5 6 7 8 9 10


        /**
         * downTo
         */

        var a = 10 downTo 1  //this means 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

        for (i in a) {
            println(i)
        }
        //Output: 10 9 8 7 6 5 4 3 2 1


        /**
         * downTo with step
         */

        var b = 10 downTo 1 step 2 //add range with interval 2. this means 10, 8, 6, 4, 2, 1

        for (i in b) {
            println(i)
        }
        //Output: 10 8 6 4 2 1


        /**
         * downTo with reversed
         */

        var c = 10 downTo 1  //this means 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

        for (i in c.reversed()) {
            println(i)
        }
        //Output: 1 2 3 4 5 6 7 8 9 10

    }
}
