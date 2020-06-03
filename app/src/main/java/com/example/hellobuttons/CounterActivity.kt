package com.example.hellobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        // Get the Intent that started this activity and extract the value

        // option 1
        val bundle: Bundle? = intent.extras      // built in?
        val count = bundle?.getInt(COUNTER_VALUE)

        // option 2
        //val count = intent.getIntExtra(COUNTER_VALUE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView2).apply {
            text = count.toString()
        }
    }
}
