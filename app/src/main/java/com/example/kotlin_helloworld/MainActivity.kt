package com.example.kotlin_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         * Strings
         */

        var name: String = "Kishor"

        /**
         * String template
         */
        if (name.equals("kishor")) {
            println("They are equal")
        } else {
            println("They are not equal")
        }
        //Output: They are not equal. Since it is case sensitive.

        //If you want to compare without taking case sensitive into consideration then we can pass
        // "true" as parameter

        if (name.equals("kishor", true)) {
            println("They are equal")
        } else {
            println("They are not equal")
        }

        //Output: They are equal. Since it is not case sensitive this time.

        /**
         * String to Integer
         */

        //We can convert  String into integer

        var a: String = "4"

        print(a.toInt());

        //Output: 4


        /**
         *Substring
         */

        //We can get the substring of string

        var myName: String = "Kishor Bikram Oli"
        //We can print the first name using substring method
        println(myName.substring(0..5))

        //Output: Kishor


        //String template
        //In Java, we can print name like below:
        println("My name is " + name)  //Java

        //But in Kotlin, we can use String template like:
        println("My name is $name") //Kotlin


        //Contains
        //In Kotlin, if we want to check if some character is in the string, then we can use contains methods like below.
        /**
         * Contains method
         */

        var a1: String = "Hello"
        var a2: String = "World"

        if (a1.contains('l')) {
            println("true")
        } else {
            println("false")
        }

        //Replace
        //In Kotlin, replace method replaces the old char with the new char like below:

        /**
         * replace method
         */

        var b1: String = "apple"
        println(b1.replace("pp", "tt"))

        //Output: attle


        //ReplaceAfter

        //In Kotlin, replaceAfter method replaces part of the string after the given character with the new given string.

        /**
         * replaceAfter method
         */

        var b2: String = "elephant"
        println(b2.replaceAfter('p', "rr", b2))

        //Output: eleprr

        //Here, there is ‘hant’ after ‘p’ and it is replaced by ‘rr’, so it becomes ‘eleprr’





        /**
         * replaceAfterLast method
         */
        // In Kotlin, replaceAfterLast method replaces part of the string after the occurrence of last given character with the new given string.

        var b3: String = "androidkotlin "
        println(b3.replaceAfterLast('o', "yyyy"))


        //Output: androidkoyyyy

        //Here, there is ‘tlin after last ‘o’ and it is replaced by ‘yyyy’, so it becomes ‘androidkoyyyy’


        //In Kotlin, replaceBefore method replaces part of the string before the given character with the new given string.



        /**
         * replaceBefore method
         */

        var c1: String = "elephant"
        println(c1.replaceBefore('p', "rrr"))

        //Output: rrrphant

        //Here, there is ‘ele’ before ‘p’ and it is replaced by given ‘rrr’, so it becomes ‘rrrphant’


        //In Kotlin, replaceBeforeLast method replaces part of the string before the occurrence of last given character with the new given string.

        /**
         * replaceAfterLast method
         */

        var c2: String = "androidkotlin "
        println(c2.replaceBeforeLast('o', "yyyy"))

        //Output: andryyyyotlin

        //Here, there is ‘oidk’ before last ‘o’ and it is replaced by ‘yyyy’, so it becomes ‘yyyyotlin’


        /**
         * reversed method
         */

        var d1: String = "android"

        println(d1.reversed())

        //Output: diordna


        /**
         * startsWith method
         */

        var d2: String = "android"

        if(d2.startsWith("an")){
            println("true")
        }else{
            println("false")
        }

        //Output: true


        /**
         * endsWith method
         */

        var d3: String = "android"

        if(d3.endsWith("id")){
            println("true")
        }else{
            println("false")
        }

        //Output: true





    }
}
