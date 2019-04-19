package com.zafar.counter

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0
    val PREFS_FILENAME = "com.zafar.counter.prefs"
    val COUNT_PREF = "counter_val"

    var prefs: SharedPreferences? = null

    fun reset(view: View) {
        count = 0
        textView.setText("" + count)

        // Put count in SharedPrefs
        val editor = prefs!!.edit()
        editor.putInt(COUNT_PREF, count)
        editor.apply()
    }

    fun plusOne(view: View) {
        count++
        textView.setText("" + count)

        // Put count in SharedPrefs
        val editor = prefs!!.edit()
        editor.putInt(COUNT_PREF, count)
        editor.apply()
    }

    fun minusOne(view: View) {
        count--
        textView.setText("" + count)

        // Put count in SharedPrefs
        val editor = prefs!!.edit()
        editor.putInt(COUNT_PREF, count)
        editor.apply()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get count from SharedPrefs
        prefs = this.getSharedPreferences(PREFS_FILENAME, 0)
        count = prefs!!.getInt(COUNT_PREF, count)

        var textView = findViewById<TextView>(R.id.textView)
        textView.setText("" + count)

    }
}
