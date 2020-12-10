 package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_ACTION_BAR)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val camBut: ImageButton = findViewById(R.id.CameraBut)
        val lockfragvar = lockfrag()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.GenFragment, lockfragvar)
            commit()
        }
        camBut.setOnClickListener {
                val intent = Intent(this, Video::class.java)
                startActivity(intent)
            }
    }
 }



