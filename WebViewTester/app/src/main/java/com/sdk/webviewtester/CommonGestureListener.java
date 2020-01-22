package com.sdk.webviewtester;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class CommonGestureListener extends GestureDetector.SimpleOnGestureListener {

    private static String TAG_COMMON_GESTURE_DETECTOR = "COMMON_GESTURE_DETECTOR";

    public View srcView = null;

    public View getSrcView() {
        return srcView;
    }

    public void setSrcView(View srcView) {
        this.srcView = srcView;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {

        Log.d(TAG_COMMON_GESTURE_DETECTOR, buildMessage("onDown()"));
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

        Log.d(TAG_COMMON_GESTURE_DETECTOR, buildMessage("onShowPress()"));
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        Log.d(TAG_COMMON_GESTURE_DETECTOR, buildMessage("onSingleTapUp()"));
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d(TAG_COMMON_GESTURE_DETECTOR, buildMessage("onScroll()"));
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        Log.d(TAG_COMMON_GESTURE_DETECTOR, buildMessage("onLongPress()"));
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d(TAG_COMMON_GESTURE_DETECTOR, buildMessage("onFling()"));
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Log.d(TAG_COMMON_GESTURE_DETECTOR, buildMessage("onSingleTapConfirmed()"));
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        Log.d(TAG_COMMON_GESTURE_DETECTOR, buildMessage("onDoubleTap()"));
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        Log.d(TAG_COMMON_GESTURE_DETECTOR, buildMessage("onDoubleTapEvent()"));
        return true;
    }

    private String buildMessage(String message)
    {
        StringBuffer retBuf = new StringBuffer();
        if(srcView instanceof ImageView)
        {
            retBuf.append("Image view gesture : ");
        }
        retBuf.append(message);
        return retBuf.toString();
    }
}
