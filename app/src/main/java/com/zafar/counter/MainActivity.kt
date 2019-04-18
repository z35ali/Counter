package com.zafar.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    fun reset(view : View){
        count = 0
        textView.setText(""+count)

    }

    fun plusOne(view : View){
        count++
        textView.setText(""+count)

    }

    fun minusOne(view : View){
        count--
        textView.setText(""+count)

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        textView.setText(""+count)

    }
}
