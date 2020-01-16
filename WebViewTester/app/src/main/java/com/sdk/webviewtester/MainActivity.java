package com.sdk.webviewtester;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.sdk.fibo.WebviewHolder;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    boolean visibility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visibility = false;
        webView = (WebView) findViewById(R.id.fibo);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webView.loadUrl("https://www.fibotalk.com/");
        webView.setBackgroundColor(Color.TRANSPARENT);
//        webView.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
        webView.setVisibility(View.INVISIBLE);
    }

    public void setTrue(View view) {
        if(!visibility) {
            webView.setVisibility(View.VISIBLE);
            visibility = true;
        } else {
            webView.setVisibility(View.INVISIBLE);
            visibility = false;
        }
    }

    //    @Override
//    public void onFragmentInteraction(Uri uri) {
//
//    }
}
