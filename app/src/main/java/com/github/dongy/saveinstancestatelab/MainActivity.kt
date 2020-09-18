package com.github.dongy.saveinstancestatelab

import android.app.Activity
import android.app.Application
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        val TAG: String = MainActivity::class.java.simpleName
    }

    private var count = 0

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: ")

        count_text.text = "$count"


        add_button.setOnClickListener {
            count++
            count_text.text = "$count"
        }

        sub_button.setOnClickListener {
            count--
            count_text.text = "$count"
        }

        registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks{
            override fun onActivityPaused(p0: Activity) {
                Log.d(TAG, "onActivityPaused: ")
            }

            override fun onActivityStarted(p0: Activity) {
                Log.d(TAG, "onActivityStarted: ")
            }

            override fun onActivityDestroyed(p0: Activity) {
                Log.d(TAG, "onActivityDestroyed: ")
            }

            override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
                Log.d(TAG, "onActivitySaveInstanceState: ")
            }

            override fun onActivityStopped(p0: Activity) {
                Log.d(TAG, "onActivityStopped: ")
            }

            override fun onActivityCreated(p0: Activity, p1: Bundle?) {
                Log.d(TAG, "onActivityCreated: ")
            }

            override fun onActivityResumed(p0: Activity) {
                Log.d(TAG, "onActivityResumed: ")
            }
        })
    }


}