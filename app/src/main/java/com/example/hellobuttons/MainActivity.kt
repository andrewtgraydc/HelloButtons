package com.example.hellobuttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

// It's a good practice to define keys for intent extras with your app's package name as a prefix.
// This ensures that the keys are unique, in case your app interacts with other apps.
const val COUNTER_VALUE = "com.example.myfirstapp.counterValue"

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // increment local count variable on button press
    fun increment(view: View) {
        counter++

        Log.i("increment1", "counter: $counter")

        val counterLabel = findViewById<TextView>(R.id.textView).apply {
            Log.i("increment2", "counter: $counter")

            setText(counter.toString())
        }
    }

    // take counter and pass to new activity
    fun showCounterActivity(view: View) {
        Log.i("show1", "button pressed")

        // pass
        val intent = Intent(this, CounterActivity::class.java).apply {
            putExtra(COUNTER_VALUE, counter)
        }
        startActivity(intent)
    }
}
