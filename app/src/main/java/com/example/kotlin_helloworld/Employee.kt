package com.example.kotlin_helloworld

/**
 * Created by Kishor Bikram Oli on 11-Mar-18.
 */
class Employee {
    var name: String? = null
    var age: Int? = null

    fun setEmployee(empName: String, empAge: Int) {
        name = empName
        age = empAge
    }
}