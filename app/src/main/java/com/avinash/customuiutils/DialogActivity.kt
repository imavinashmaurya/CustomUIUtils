package com.avinash.customuiutils

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dialog.*

class DialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
        setupUI()
    }

    private fun setupUI() {
        //Dialog with Title, Des, event and both action button
        btDialog?.setOnClickListener {
            CustomAlertDialog(
                this,
                getString(R.string.demo_title),
                getString(R.string.demo_des),
                true,
                object : CustomAlertDialog.AlertDialogButtonClicked {
                    override fun buttonClicked(positive: Boolean) {
                        showToast(positive)
                    }

                })
        }

        // Dialog with Title, Des, event and single action button
        btDialog2?.setOnClickListener {
            CustomAlertDialog(
                this,
                getString(R.string.demo_title),
                getString(R.string.demo_des),
                false,
                object : CustomAlertDialog.AlertDialogButtonClicked {
                    override fun buttonClicked(positive: Boolean) {
                        showToast(positive)
                    }

                }
            )
        }

       // Dialog with Title, Des, without event and single action button
        btDialog3?.setOnClickListener {
            CustomAlertDialog(
                this,
                getString(R.string.demo_title),
                getString(R.string.demo_des),
                false,
                null
            )
        }

        //Dialog with Title, event and both action button
        btDialog4?.setOnClickListener {
            CustomAlertDialog(
                this,
                getString(R.string.demo_title),
                true,
                object : CustomAlertDialog.AlertDialogButtonClicked {
                    override fun buttonClicked(positive: Boolean) {
                        showToast(positive)
                    }

                }
            )
        }

        //Dialog with Title, event and single action button
        btDialog5?.setOnClickListener {
            CustomAlertDialog(
                this,
                getString(R.string.demo_des),
                false,
                object : CustomAlertDialog.AlertDialogButtonClicked {
                    override fun buttonClicked(positive: Boolean) {
                        showToast(positive)
                    }
                }
            )
        }

        //Dialog with Custom background
        btDialog6?.setOnClickListener {
            CustomAlertDialog(
                this,
                getString(R.string.demo_title),
                getString(R.string.demo_des),
                false,
                object : CustomAlertDialog.AlertDialogButtonClicked {
                    override fun buttonClicked(positive: Boolean) {
                        showToast(positive)
                    }
                }
            ).changeBackgroundColor(R.color.black).changeTitleColor(R.color.white).changeDesColor(R.color.white)
        }
    }

    private fun showToast(positive: Boolean) {
        if (positive) {
            Toast.makeText(
                this@DialogActivity,
                "Positive action clicked",
                Toast.LENGTH_LONG
            ).show()
        } else {
            Toast.makeText(
                this@DialogActivity,
                "Negative action clicked",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}