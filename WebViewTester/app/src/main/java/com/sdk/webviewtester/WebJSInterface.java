package com.sdk.webviewtester;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebJSInterface {
    Context mContext;
    MainActivity mainActivity;

    /** Instantiate the interface and set the context */
    WebJSInterface(Context c, MainActivity m) {
        mContext = c;
        mainActivity = m;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void hide() {
        mainActivity.hide();
    }
}
