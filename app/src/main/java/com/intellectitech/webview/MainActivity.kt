package com.intellectitech.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val webView : WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "intellectsoft"
        val webView =findViewById<WebView>(R.id.webview)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https:www.intellectsoft.net")
        val webSettings=webView.settings
        webSettings.javaScriptEnabled = true
    }
    override fun onBackpressed(){
        if(webView?.canGoBack()==true)
        {
            webView.goBack()
        }
        else
        {
            super.onBackPressed()
        }
    }
}