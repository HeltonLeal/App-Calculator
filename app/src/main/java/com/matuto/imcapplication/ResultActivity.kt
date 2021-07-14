package com.matuto.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


abstract class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setListeners()


    }

    fun setListeners() {

    }


}