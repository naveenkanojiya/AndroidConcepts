package com.concepts.androidstudio

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.androidstudio.databinding.ActivityWebViewBinding


class WebView : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_web_view)


//    webView.webViewClient = object : WebViewClient() {
//        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//            view?.loadUrl(url)
//            return true
//        }
//    }
//
//    webView.loadUrl("https://www.google.co.in/")


        supportActionBar?.hide()
        binding.web.loadUrl("https://www.google.co.in/")
        @SuppressLint("SetJavaScriptEnabled")
        binding.web.settings.javaScriptEnabled=true
        binding.web.webViewClient = WebViewClient()




    }
}