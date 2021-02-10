 package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.URL
import java.net.URLConnection


 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_ACTION_BAR)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val camBut: ImageButton = findViewById(R.id.CameraBut)
        val LockButton: Button = findViewById(R.id.lockButFrag)
        val IPVal2: String = intent.getStringExtra("IPValT").toString()
        val ipcomm: String = IPVal2
        val ipcomm2: String = ipcomm + "/toggle"
        var i = 1
        LockButton.setOnClickListener {
            if (i == 1) {
                Toast.makeText(this@MainActivity, "My SignOff Locked!", Toast.LENGTH_LONG).show()
                GlobalScope.launch {
                    val connection: URLConnection = URL("Https://" + ipcomm2).openConnection()
                    connection.connect()
                }
                i = 0
            }
            else if (i == 0) {
                Toast.makeText(this@MainActivity, "My SignOff Unlocked!", Toast.LENGTH_LONG).show()
                GlobalScope.launch {
                    val connection2: URLConnection = URL("Https://" + ipcomm2).openConnection()
                    connection2.connect()
                }
                i = 1
            }
        }
        camBut.setOnClickListener {
            val intent = Intent(this, Video::class.java)
            intent.putExtra("IPValT2", IPVal2)
            startActivity(intent)
        }
        /* supportFragmentManager.beginTransaction().apply {
            replace(R.id.GenFragment, lockfragvar)
            commit()
        } */

    }
 }



