package com.levegames.backoffice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview.webViewClient = WebViewClient()
        webview.settings.javaScriptEnabled = true

        webview.loadUrl("http://10.0.0.104:8080/Backoffice/Login")
    }
}