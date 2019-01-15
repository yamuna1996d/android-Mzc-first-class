package com.mzc.administrator.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
EditText name,admission,phone,email,username,passw,confirmpass;
    String n,a,m,e,u,p,c;
    Button cass,cpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=(EditText)findViewById(R.id.name);
        admission=(EditText)findViewById(R.id.add);
        phone=(EditText)findViewById(R.id.num);
        email=(EditText)findViewById(R.id.email);
        username=(EditText)findViewById(R.id.use);
        passw=(EditText)findViewById(R.id.password);
        confirmpass=(EditText)findViewById(R.id.con);
        cass=(Button)findViewById(R.id.reg);
        cpass=(Button)findViewById(R.id.alr);
        cass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=name.getText().toString();
                a=admission.getText().toString();
                m=phone.getText().toString();
                e=email.getText().toString();
                u=username.getText().toString();
                p=passw.getText().toString();
                c=confirmpass.getText().toString();

               if(p.equals(c)){
                   Toast.makeText(getApplicationContext(),n,Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(),a,Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(),m,Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(),e,Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(),u,Toast.LENGTH_LONG).show();
               }
                else{
                   Toast.makeText(getApplicationContext(),"Password and Confirm password doesn't match",Toast.LENGTH_SHORT).show();
               }
            }
        });
        cpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(getApplicationContext(),login.class);
                startActivity(e);
            }
        });
    }
}
