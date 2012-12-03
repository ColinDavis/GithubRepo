package com.example.lltester;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LLTester extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lltester);
        View linearLayout =  findViewById(R.id.info);
        //LinearLayout layout = (LinearLayout) findViewById(R.id.info);


        TextView valueTV = new TextView(this);
        valueTV.setText("hallo hallo");
        valueTV.setId(5);
        valueTV.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));

        ((LinearLayout) linearLayout).addView(valueTV);
    }
}