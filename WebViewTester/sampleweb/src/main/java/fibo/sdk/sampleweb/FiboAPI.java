package fibo.sdk.sampleweb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FiboAPI extends WebView {

    WebSettings webSettings;
    Handler mHandler;
    Context mainContext;

    public FiboAPI(Context c) {
        super(c);
        mainContext = c;
        this.init(c);
    }

    public FiboAPI(Context c, AttributeSet as) {
        super(c, as);
        mainContext = c;
        this.init(c);
    }

    private void init(Context context) {
        this.setWebViewClient(new WebViewClient());
        webSettings = this.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        this.loadUrl("http://unireply.com/andy.html");
        this.setBackgroundColor(Color.TRANSPARENT);
//        webView.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
        this.setVisibility(View.INVISIBLE);
//        mHandler = new Handler(Looper.getMainLooper());
        mHandler = new Handler(context.getMainLooper());
//        this.addJavascriptInterface(context, "FibodroidAPI");
    }

    public void setTrue(View view) {
        this.setVisibility(View.VISIBLE);
        this.loadUrl("javascript:__ft__chatOpen__()");
    }

    public void openDemo(View view) {
        this.setVisibility(View.VISIBLE);
        this.loadUrl("javascript:fibo.open({'name': 'demo', 'type': 'modal', 'id': '000'})");
    }

//    @JavascriptInterface
//    public void hide() {
//        final WebView self = this;
//        ((Activity)mainContext).runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                self.setVisibility(View.INVISIBLE);
//            }
//        });
//        mHandler.post(new Runnable() {
//            @Override
//            public void run() {
//                self.setVisibility(View.INVISIBLE);
//            }
//        });
//        this.setVisibility(View.INVISIBLE);
//    }
    public void hide() {
        this.setVisibility(View.INVISIBLE);
    }
}
