package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_receive_data.*

class receiveData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_data)

        val values_recived = intent.getStringExtra(PassContent.KEY )

        textReceived.text = values_recived.toString()
    }
}