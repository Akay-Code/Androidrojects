package com.example.my_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor", "WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        *** TO MAKE TOAST MSG WHEN BUTTON ARE PRESSED ***

        val buttonUpload = findViewById<Button>(R.id.btnUp)
        val buttonDownload = findViewById<Button>(R.id.btnDown)
        val mainLayout = findViewById<LinearLayout>(R.id.mainLayout)

        buttonUpload.setOnClickListener{
            mainLayout.setBackgroundColor(R.color.black)
            Toast.makeText(applicationContext , "Uploading..." , Toast.LENGTH_SHORT).show()


        }
        buttonDownload.setOnClickListener{
            Toast.makeText(applicationContext, "Downloading...", Toast.LENGTH_SHORT).show()
            mainLayout.setBackgroundColor(R.color.white)
        }

        val nextscreen = findViewById<Button>(R.id.newScreenBtn)

        nextscreen.setOnClickListener{
            //open a new activity
            intent = Intent(applicationContext ,MainActivity2::class.java)
            startActivity(intent)

        }

        val runWebsite = findViewById<Button>(R.id.runWeb)

        runWebsite.setOnClickListener{
            intent = Intent(applicationContext , MainActivity3::class.java)
            startActivity(intent)
        }

    }
}