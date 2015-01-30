package com.example.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Android extends Activity {

    private TextView message;
    private ImageView droid;
    private View.OnClickListener droidTapListener;
    private int counter = 0;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.android.R.layout.main);
        
        initalizeApp();
    }

    private void initalizeApp() {
        message = (TextView) findViewById(com.example.android.R.id.textView);
        droid = (ImageView) findViewById(com.example.android.R.id.imageView);

        droidTapListener = new View.OnClickListener() {
            public void onClick(View view) {
                touchDroid();
            }
        };
        droid.setOnClickListener(droidTapListener);
    }

    private void touchDroid() {
        counter++;
        String temp = getStringForDisplay(counter);
        message.setText(String.format("You said Hello: %s", temp));
    }

    private String getStringForDisplay(int count) {
        String temp;
        switch (count) {
            case 1:
                temp = "once";
                break;
            case 2:
                temp = "twice";
                break;
            default:
                temp = String.format("%d times", count);
        }
        return temp;
    }

}
