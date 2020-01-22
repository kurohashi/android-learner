package fibo.sdk.sampleweb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

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

    public void setTrue(View view) {
        this.view.setTrue(view);
    }

    public void openDemo(View view) {
        this.view.openDemo(view);
    }
}
