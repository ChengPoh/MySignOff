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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_sign_off)


        GlobalScope.launch {
            runOnUiThread{
                    Toast.makeText(this@MySignOff,"Loading...", Toast.LENGTH_LONG).show()
            }
            val doc: Document = Jsoup.connect("https://script.google.com/macros/s/AKfycbwt1Xbo2u05gZPTPaIi4BB83zv9L_F__eHghFOa4C6-z8PFopVoEqxdzA/exec/exec?command=GetCamIPAddress").get()
            val ipadd: String = doc.toString()
            val index = ipadd.indexOf("CAM IP :")
            if (index == -1) throw IllegalStateException("Start not found")
            val start = index + 8
            val end = ipadd.indexOf("END")
            if (end == -1) throw IllegalStateException("End not found")
            val result = ipadd.substring(start, end)

            val doc2: Document = Jsoup.connect("https://script.google.com/macros/s/AKfycbwt1Xbo2u05gZPTPaIi4BB83zv9L_F__eHghFOa4C6-z8PFopVoEqxdzA/exec/exec?command=GetLock1IPAddress").get()
            val ipadd2: String = doc2.toString()
            val index2 = ipadd2.indexOf("L1 IP :")
            if (index2 == -1) throw IllegalStateException("Start not found")
            val start2 = index + 7
            val end2 = ipadd2.indexOf("END")
            if (end2 == -1) throw IllegalStateException("End not found")
            val result2 = ipadd2.substring(start2, end2)

            val doc3: Document = Jsoup.connect("https://script.google.com/macros/s/AKfycbwt1Xbo2u05gZPTPaIi4BB83zv9L_F__eHghFOa4C6-z8PFopVoEqxdzA/exec/exec?command=GetLock2IPAddress").get()
            val ipadd3: String = doc3.toString()
            val index3 = ipadd3.indexOf("L2 IP :")
            if (index3 == -1) throw IllegalStateException("Start not found")
            val start3 = index + 7
            val end3 = ipadd3.indexOf("END")
            if (end3 == -1) throw IllegalStateException("End not found")
            val result3 = ipadd3.substring(start3, end3)

            runOnUiThread {
                editTextNumber.setText(result)
                editTextNumber2.setText(result2)
                editTextNumber3.setText(result3)
                }
            }

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

