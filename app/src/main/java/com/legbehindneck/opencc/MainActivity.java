package com.legbehindneck.opencc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import opencc.OpenCC;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "OpenCC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text);

        CharSequence origText = text.getText();
        OpenCC openCC = new OpenCC();
        text.setText(origText + " => " + openCC.convert(origText.toString()));
//        Log.d(TAG, "onCreate: " + Converter.convert("42"));
    }
}