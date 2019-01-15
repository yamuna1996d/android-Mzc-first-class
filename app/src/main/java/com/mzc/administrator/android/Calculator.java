package com.mzc.administrator.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
EditText ed1,ed2;
    Button b;
    String w,e,result;
    int one,two,three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ed1=(EditText)findViewById(R.id.number1);
        ed2=(EditText)findViewById(R.id.second);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w=ed1.getText().toString();
                e=ed2.getText().toString();
                one=Integer.parseInt(w);
                two=Integer.parseInt(e);
                three=one+two;
                result=String.valueOf(three);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
