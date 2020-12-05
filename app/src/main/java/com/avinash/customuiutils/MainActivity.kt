package com.avinash.customuiutils

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUI()
    }

    private fun setUI(){
        btDialog?.setOnClickListener {
          startActivity(Intent(this,DialogActivity::class.java))
        }

        btToast?.setOnClickListener {
            startActivity(Intent(this,ToastActivity::class.java))
        }
    }
}