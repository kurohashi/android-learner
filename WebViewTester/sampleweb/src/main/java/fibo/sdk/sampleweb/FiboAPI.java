package fibo.sdk.sampleweb;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FiboAPI extends WebView {

    WebSettings webSettings;

    public FiboAPI(Context c) {
        super(c);
        this.init();
    }

    public FiboAPI(Context c, AttributeSet as) {
        super(c, as);
        this.init();
    }

    private void init() {
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
    }

    public void setTrue() {
        this.setVisibility(View.VISIBLE);
        this.loadUrl("javascript:__ft__chatOpen__()");
    }

    public void openDemo() {
        this.setVisibility(View.VISIBLE);
        this.loadUrl("javascript:fibo.open({'name': 'demo', 'type': 'modal', 'id': '000'})");
    }

    public void hide() {
        this.setVisibility(View.INVISIBLE);
    }
}
