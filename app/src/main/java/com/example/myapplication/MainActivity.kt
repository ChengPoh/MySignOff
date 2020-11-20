package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lockBut: ImageButton = findViewById(R.id.LockBut)
        val camBut: ImageButton = findViewById(R.id.CameraBut)
        val camfragvar = camfrag()
        val lockfragvar = lockfrag()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.GenFragment, camfragvar)
            commit()
        }

        lockBut.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.GenFragment, lockfragvar)
                commit()
            }
            camBut.setOnClickListener() {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.GenFragment, camfragvar)
                    commit()
                }
                /*findViewById<Button>(R.id.CamButFrag).setOnClickListener {
                    val intent = Intent(this, Video::class.java)
                    startActivity(intent)*/
                }
            }
        }
    }
