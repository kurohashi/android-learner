package com.sdk.webviewtester;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fibo.sdk.sampleweb.Fibo;
import fibo.sdk.sampleweb.FiboAPI;

public class MainActivity extends AppCompatActivity {

    Fibo fibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        webView = (WebView) findViewById(R.id.fibo);
//        webView.setWebViewClient(new WebViewClient());
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setDomStorageEnabled(true);
//        webSettings.setLoadWithOverviewMode(true);
//        webSettings.setUseWideViewPort(true);
//        webSettings.setBuiltInZoomControls(true);
//        webSettings.setDisplayZoomControls(false);
//        webSettings.setSupportZoom(true);
//        webSettings.setAllowContentAccess(true);
//        webSettings.setDefaultTextEncodingName("utf-8");
//        webView.loadUrl("http://unireply.com/andy.html");
//        webView.setBackgroundColor(Color.TRANSPARENT);
////        webView.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
//        webView.setVisibility(View.INVISIBLE);
//        webView.addJavascriptInterface(this, "FibodroidAPI");

//        GestureDetector gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
//            @Override
//            public boolean onSingleTapUp(MotionEvent motionEvent) {
//                Log.d("try clicking", motionEvent.toString());
//                return true;
//            }
//        });


//        webView.setOnTouchListener(this);
        fibo = new Fibo((FiboAPI) findViewById(R.id.fibo));
//        fibo.addJavascriptInterface(this, "FibodroidAPI");
    }

    public void setTrue(View view) {
        fibo.setTrue(view);
    }

    public void openDemo(View view) {
        fibo.openDemo(view);
    }

//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
//        Toast.makeText(getApplicationContext(),"Event Occurred", Toast.LENGTH_SHORT).show();
//        return false;
//    }
}
