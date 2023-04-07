package com.example.my_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val cameraButton = findViewById<CardView>(R.id.openCame)
        val webButton = findViewById<CardView>(R.id.openWebsite)
        val callButton = findViewById<CardView>(R.id.openCalling)

        cameraButton.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        webButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/Akay-Code")
            startActivity(intent)
        }
        callButton.setOnClickListener{

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "8178460227" )
            startActivity(intent)
        }
    }
}