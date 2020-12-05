package com.avinash.customuiutils

import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager

fun getStringText(context: Context?, id:Int):String{
    return context?.getString(id) ?: ""
}

fun getScreenWidth(context: Context): Pair<Int, Int> {
    val metrics = DisplayMetrics()
    val windowManager = context
        .getSystemService(Context.WINDOW_SERVICE) as WindowManager
    windowManager.defaultDisplay.getMetrics(metrics)

    val height: Int = metrics.heightPixels
    val width: Int = metrics.widthPixels
    return Pair(height, width)
}