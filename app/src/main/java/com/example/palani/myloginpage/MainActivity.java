package com.example.palani.myloginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
    Button b1;
     String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 s1=e1.getText().toString();
                String s2=e2.getText().toString();

                if(s1.equals("admin") && s2.equals("admin"))
                {
                    Intent i = new Intent(getApplicationContext(),Activity2.class);
                    i.putExtra("name", s1);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid Userid/Password", Toast.LENGTH_LONG).show();
                }

            }
        });

    }}
