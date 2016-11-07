package com.ethanco.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvInfo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnTest = findViewById(R.id.btn_test) as Button
        tvInfo = findViewById(R.id.tv_info) as TextView

        btnTest.setOnClickListener { Toast.makeText(this@MainActivity, "Hello~", Toast.LENGTH_SHORT) }
    }
}
