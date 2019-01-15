package com.mzc.administrator.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText ed,ed1;
    Button b;
    String Uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed=(EditText)findViewById(R.id.user);
        ed1=(EditText)findViewById(R.id.pass);
        b=(Button)findViewById(R.id.login);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Cliked",Toast.LENGTH_LONG).show();
                Uname=ed.getText().toString();
                pass=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),Uname,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();
            }
        });
    }
}
