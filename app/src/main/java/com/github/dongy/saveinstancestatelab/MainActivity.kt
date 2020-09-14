package com.github.dongy.saveinstancestatelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0;

        count_text.text = "$count"


        add_button.setOnClickListener {
            count++
            count_text.text = "$count"
        }

        sub_button.setOnClickListener {
            count--
            count_text.text = "$count"
        }
    }
}