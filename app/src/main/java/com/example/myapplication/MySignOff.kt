 package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_my_sign_off.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

 class MySignOff : AppCompatActivity() {

     var IPVal: String = ""

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_sign_off)
        Toast.makeText(this@MySignOff,"Loading...", Toast.LENGTH_LONG).show()

        GlobalScope.launch {
            val doc: Document = Jsoup.connect("https://script.google.com/macros/s/AKfycbwt1Xbo2u05gZPTPaIi4BB83zv9L_F__eHghFOa4C6-z8PFopVoEqxdzA/exec/exec?command=GetCamIPAddress").get()
            val ipadd: String = doc.toString()
            val index = ipadd.indexOf("CAM IP :")
            if (index == -1) throw IllegalStateException("Start not found")
            val start = index + 8
            val end = ipadd.indexOf("END")
            if (end == -1) throw IllegalStateException("End not found")
            val result = ipadd.substring(start, end)

            runOnUiThread {
                editTextNumber.setText(result)
                IPVal = result
                }
            }

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("IPValT", IPVal)
            startActivity(intent)
        }
    }
}

