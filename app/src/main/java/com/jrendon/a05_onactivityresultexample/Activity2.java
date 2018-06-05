package com.jrendon.a05_onactivityresultexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends Activity {

    private Button mButton1 = null;
    private Button mButton2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        mButton1 = findViewById(R.id.button1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent();
                result.putExtra(Activity1.Intent_Result_Activity_1, "#1");
                setResult(RESULT_OK, result);
                finish();
            }
        });

        mButton2 = findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent();
                result.putExtra(Activity1.Intent_Result_Activity_1, "#2");
                setResult(RESULT_OK, result);
                finish();
            }
        });
    }
}
