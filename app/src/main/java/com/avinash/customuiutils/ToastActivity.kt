package com.avinash.customuiutils

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_toast.*

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)
        setUI()
    }

    private fun setUI(){
        btToast?.setOnClickListener {
            CustomToast().setupLongToast(this@ToastActivity,getString(R.string.demo_des))
        }
        btToast1?.setOnClickListener {
            CustomToast().setupShortToast(this@ToastActivity,getString(R.string.demo_des))
        }

        btToast2?.setOnClickListener {
            CustomToast().setupCustomToast(this@ToastActivity,getString(R.string.demo_des))
        }

        btToast3?.setOnClickListener {
            CustomToast().setupErrorToast(this@ToastActivity,"Something went wrong.")
        }

        btToast4?.setOnClickListener {
            CustomToast().setupToastWithImage(this@ToastActivity,R.drawable.ic_error,"This is a custom toast").setBackgroundColor(R.color.red).setTextColor(R.color.white)
        }
    }
}