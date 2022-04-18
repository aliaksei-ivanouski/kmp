package com.ivanouski.mpp.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivanouski.mpp.Greeting
import android.widget.TextView

fun greet(
    context: Any? = null
): String {
    return Greeting().greeting(context)
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet(this.applicationContext)
    }
}
