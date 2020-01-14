package com.sdk.loader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.hello);
        com.sdk.learner1.MainActivity m = new com.sdk.learner1.MainActivity();
        textView.setText(m.getText());
//        Intent intent = new Intent(getApplicationContext(), com.sdk.learner1.MainActivity.class);
//        intent.putExtra("com.sdk.learner1.MESSAGE", m.getText());
//        startActivity(intent);
    }
}
