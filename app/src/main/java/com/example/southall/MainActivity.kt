package com.example.southall

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
   private lateinit var webView2:WebView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView2=findViewById(R.id.webView)
        webView2.webViewClient = WebViewClient()
        webView2.loadUrl("https://www.southalltravel.co.uk/")
        webView2.settings.javaScriptEnabled = true
        webView2.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if (webView2.canGoBack())
            webView2.goBack()
        // if your webview cannot go back
        // it will exit the application
        else
            super.onBackPressed()
    }


}