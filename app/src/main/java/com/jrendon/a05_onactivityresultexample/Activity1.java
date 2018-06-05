package com.jrendon.a05_onactivityresultexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity1 extends Activity {

    private Button myTrigger = null;

    // The Id of our request
    public final static int Spy = 5;

    // The Id of the string that holds the result of the intent
    public final static String Intent_Result_Activity_1 = "hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        myTrigger = findViewById(R.id.trigger);

        myTrigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity = new Intent(Activity1.this, Activity2.class);

                // We associate the id to our intent
                startActivityForResult(secondActivity, Spy);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == Spy) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                // We display the button that was chosen
                Toast.makeText(this, "You've chosen Intent " +
                        data.getStringExtra(Intent_Result_Activity_1), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
