package com.mind.jitpackdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mind.jitpacklibrary.JitPackActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCallLib.setOnClickListener {
            startActivity(Intent(this, JitPackActivity::class.java))
        }
    }
}
