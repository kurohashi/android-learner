package com.sdk.touchlistentest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private ViewGroup mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context mContext = getApplicationContext();
        TextView mDummyView = (TextView) findViewById(R.id.textView);
//        LinearLayout mDummyView = new LinearLayout(mContext);

        mLinearLayout = (ViewGroup) findViewById(R.id.linear_layout);

//        LayoutParams params = new LayoutParams(1, LayoutParams.MATCH_PARENT);
//        mDummyView.setLayoutParams(params);
        mDummyView.setOnTouchListener(this);
        LayoutParams params = new LayoutParams(
                1, /* width */
                1, /* height */
                LayoutParams.TYPE_PHONE,
                LayoutParams.FLAG_NOT_FOCUSABLE |
                        LayoutParams.FLAG_NOT_TOUCH_MODAL |
                        LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
                PixelFormat.TRANSPARENT
        );
        params.gravity = Gravity.LEFT | Gravity.TOP;
//        mLinearLayout.addView(mDummyView, params);
        mLinearLayout.updateViewLayout(mDummyView, params);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.d("Touching","Touch event: " + event.toString());

        Toast.makeText(getApplicationContext(),"Event Occurred", Toast.LENGTH_SHORT).show();

        return false;
    }
}
