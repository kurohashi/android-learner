package com.sdk.loader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.hello);
        com.sdk.learner1.MainActivity m = new com.sdk.learner1.MainActivity();
        textView.setText(m.getText());
        WebView webView = (WebView) findViewById(R.id.fibo);
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
        webView.loadUrl("http://unireply.com/website/");
    }
}
