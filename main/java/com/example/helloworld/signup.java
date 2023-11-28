package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {
    Button checkID, checkPW,datePicker,signup_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        checkID = (Button) findViewById(R.id.checkID);
        checkPW = (Button) findViewById(R.id.checkPW);
        datePicker = (Button) findViewById(R.id.datePicker);
        signup_submit = (Button) findViewById(R.id.signup_submit);
        checkID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "사용가능한 아이디입니다.", Toast.LENGTH_LONG).show();
            }
        });
        checkPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"일치합니다.",Toast.LENGTH_LONG).show();
            }
        });
        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"날짜가 입력 되었습니다.",Toast.LENGTH_LONG).show();
            }
        });
        signup_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);
            }
        });
    }
}