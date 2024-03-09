package com.amit_verma.sample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amit_verma.dependent2_library.Dependent2Class

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Dependent2Class.create()
    }
}