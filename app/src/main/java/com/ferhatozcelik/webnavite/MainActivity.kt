package com.ferhatozcelik.webnavite

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ferhatozcelik.webnavite.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    // Json Listt
    private var paramOne:String = "buttontest" //Button Id
    private var paramProId:String = "proId" // Ürün ID
    private var paramHtml:String = Cons.HTML //Full Html

    @SuppressLint("JavascriptInterface", "SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.apply {
            val androidHelper =  AndroidWebViewBridgeHelper(Cons.HTML, webView)

            //TODO tag remove ? HTML uniq mi
            androidHelper.setClickEvent("a", paramOne, object : WebClickInterface {
                override fun onWebClick() {
                    Toast.makeText(applicationContext, "Purchased: $paramProId", Toast.LENGTH_SHORT).show()
                }
            })

            webView.loadDataWithBaseURL(null, androidHelper.getHTML(),"text/html", "UTF-8", null)

        }
    }

}
