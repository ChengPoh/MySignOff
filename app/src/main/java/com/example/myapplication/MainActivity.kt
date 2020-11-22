 package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lockBut: ImageButton = findViewById(R.id.LockBut)
        val camBut: ImageButton = findViewById(R.id.CameraBut)
        val CamButFrag: Button = findViewById(R.id.CamButFrag)
        val camfragvar = camfrag()
        val lockfragvar = lockfrag()
        val vidfragvar = vidfrag()

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
                CamButFrag.setOnClickListener() {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.GenFragment, vidfragvar)
                        commit()
                    }
                }
            }
        }
    }
}

