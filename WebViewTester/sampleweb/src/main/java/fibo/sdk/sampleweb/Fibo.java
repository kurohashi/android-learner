package fibo.sdk.sampleweb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import org.json.JSONObject;

public class Fibo extends AppCompatActivity {

    private FiboAPI view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public Fibo(FiboAPI view) {
        this.view = view;
        view.addJavascriptInterface(this, "FibodroidAPI");
    }

    @JavascriptInterface
    public void hide() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                view.hide();
            }
        });
    }

    public void setTrue() {
        this.view.setTrue();
    }

    public void openDemo() {
        this.view.openDemo();
    }

    public void setEvent(String name, String val, String params) {
        this.view.setEvent(name, val, params);
    }

    public void setEvent(String name, String val) {
        this.view.setEvent(name, val, "");
    }

    public void setEvent(String name) {
        this.view.setEvent(name, "", "");
    }
}
