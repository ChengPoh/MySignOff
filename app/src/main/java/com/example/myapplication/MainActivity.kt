 package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


 class MainActivity : AppCompatActivity() {
     //https://api.telegram.org/bot1400912526:AAEpZVZmSt44AxOLaYenYmQfyIchKTQOl-E/getMe
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_ACTION_BAR)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

         val camBut: ImageButton = findViewById(R.id.CameraBut)
         val lockfragvar = lockfrag()

         /*
         val L1IPAdd: String = URL("https://script.google.com/macros/s/AKfycbyjRIRl2ca_pnfz8XgccjDlaRPUNz6KY_WcyPZAROsy9EZkD35F/exec?command=GetIPAddress").readText()
         val getIP = "https://script.google.com/macros/s/AKfycbyjRIRl2ca_pnfz8XgccjDlaRPUNz6KY_WcyPZAROsy9EZkD35F/exec?command=GetIPAddress"
         val getStatus = "https://script.google.com/macros/s/AKfycbyjRIRl2ca_pnfz8XgccjDlaRPUNz6KY_WcyPZAROsy9EZkD35F/exec?command=GetStatus"
         */

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



