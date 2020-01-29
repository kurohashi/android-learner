package com.sdk.webviewtester;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import fibo.sdk.sampleweb.Fibo;
import fibo.sdk.sampleweb.FiboAPI;

public class MainActivity extends AppCompatActivity {

    Fibo fibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fibo = new Fibo((FiboAPI) findViewById(R.id.fibo));
        View v = findViewById(R.id.view);
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e("touched...", event.toString());
                Toast.makeText(getApplicationContext(),"Hello Touch",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    public void setTrue(View view) {
        fibo.setTrue();
    }

    public void openDemo(View view) {
        fibo.openDemo();
    }
}
