package com.sdk.webviewtester;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import fibo.sdk.sampleweb.Fibo;
import fibo.sdk.sampleweb.FiboAPI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Fibo fibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fibo = new Fibo((FiboAPI) findViewById(R.id.fibo));
    }

    public void setTrue(View view) {
        fibo.setTrue();
    }

    public void openDemo(View view) {
    }

    @Override
    public void onClick(View v) {
        fibo.setEvent("andy_click");
    }
}
