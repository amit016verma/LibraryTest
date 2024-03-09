package com.amit_verma.librarytest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amit_verma.dependent1_library.Dependent1Class

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Dependent1Class.create()
    }
}