package com.legbehindneck.opencc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import opencc.OpenCC;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text);

        CharSequence origText = text.getText();
        OpenCC openCC = new OpenCC();
        text.setText(origText + " => " + openCC.convert(origText.toString()));
    }
}