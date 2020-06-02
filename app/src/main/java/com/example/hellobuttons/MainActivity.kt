package com.example.hellobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun increment(view: View) {
        // increment local count variable
        counter++

        Log.i("increment1", "counter: $counter")

        val counterLabel = findViewById<TextView>(R.id.textView).apply {
            Log.i("increment2", "counter: $counter")

            setText(counter.toString())
        }
    }
}
