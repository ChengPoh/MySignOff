package com.example.myapplication

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class Video : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webview = WebView(this)
        setContentView(webview)
        webview.loadUrl("https://8.8.8.8")
    }
}