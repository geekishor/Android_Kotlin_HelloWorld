package com.example.kotlin_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var employee = Employee();
        employee.setEmployee( empAge = 23, empName = "Kishor")
        txtEmpName.setText("Employee Name = ${employee.name}")
        txtEmpAge.setText("Employee Age = ${employee.age}")
        
    }
}
