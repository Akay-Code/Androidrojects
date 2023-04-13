package com.example.my_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pass_content.*

class PassContent : AppCompatActivity() {

    //creating a companion object
    companion object{
        const val KEY = "com.example.my_app"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_content)

        btnPassData.setOnClickListener{
            val data_to_pass = ip1.text.toString() + " " + ip2.text.toString() ;

            intent = Intent(this , receiveData::class.java)
            intent.putExtra(KEY , data_to_pass)
            startActivity(intent)
        }
    }
}