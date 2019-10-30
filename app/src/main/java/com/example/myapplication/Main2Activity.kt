package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var c = 0
        var b = 0
        var a = 0
        var d = 0


    }


    fun on (v : View) {
        var a = input1.text.toString().toInt()
        var b = input2.text.toString().toInt()
        var c = input3.text.toString().toInt()
        var d : Int = a * c * b
        output.setText(d.toString())
    }


}
