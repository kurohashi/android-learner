package com.sdk.webviewtester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.sdk.fibo.WebviewHolder;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        webView.loadUrl("http://unireply.com/andy.html");
        webView.setBackgroundColor(Color.TRANSPARENT);
//        webView.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
        webView.setVisibility(View.INVISIBLE);
        webView.addJavascriptInterface(this, "FibodroidAPI");
    }

    public void setTrue(View view) {
        webView.setVisibility(View.VISIBLE);
        webView.loadUrl("javascript:__ft__chatOpen__()");
    }

    public void openDemo(View view) {
        webView.loadUrl("javascript:fibo.open({'name': 'demo', 'type': 'modal', 'id': '000'})");
    }

    @JavascriptInterface
    public void hide() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                webView.setVisibility(View.INVISIBLE);
            }
        });
    }
}
