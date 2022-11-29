package com.ferhatozcelik.webnavite

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.widget.Toast
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

@SuppressLint("SetJavaScriptEnabled")
class AndroidWebViewBridgeHelper(private var html: String, private var webView: WebView) {

    init {
        webView.settings.javaScriptEnabled = true
    }

    fun setClickEvent(elementTag: String, elementId: String, webClickInterface:WebClickInterface) {

        val document: Document = Jsoup.parse(html)
        for (e in document.getElementsByTag(elementTag)) {
            if (e.attr("id").replace("\\\"", "") == elementId) {
                e.attr("onclick", "AndroidWebViewBridge.onClicked()")
            }
        }

        html = document.html()

        val androidJSInterface = object : Any() {
            @JavascriptInterface
            fun onClicked() {
                webClickInterface.onWebClick()
            }
        }

        webView.addJavascriptInterface(androidJSInterface, "AndroidWebViewBridge")

    }

    fun getHTML(): String {
        return html
    }

}