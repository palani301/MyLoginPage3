package com.example.palani.myloginpage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Palani on 02-04-2017.
 */

public class Activity2 extends MainActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in=getIntent();
        String a1=in.getStringExtra("name");
        textView=(TextView)findViewById(R.id.t1);
         textView.setText("Welcome "+a1);

    }

}
