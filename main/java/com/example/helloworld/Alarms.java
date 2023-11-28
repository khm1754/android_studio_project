// 복용약 알람

package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class Alarms extends AppCompatActivity {
    Button btnStart;
    NumberPicker setHour1, setMin1;
    Toolbar toolbar;
    View view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarms_main);
        btnStart = (Button) findViewById(R.id.btnStart);
        setHour1 = (NumberPicker) findViewById(R.id.setHour1);
        setMin1 = (NumberPicker) findViewById(R.id.setMin1);


        //툴바 연결
        Intent intent = getIntent();
        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);      // 툴바에 뒤로가기 버튼 만들기
            getSupportActionBar().setTitle(intent.getStringExtra("title"));     //툴바 타이틀 지정
        }

        setHour1.setMaxValue(24);
        setHour1.setValue(1);
        setHour1.setMinValue(1);
        setMin1.setMaxValue(59);
        setMin1.setValue(0);
        setMin1.setMinValue(0);

        setHour1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

            }
        });
        //등록화면 눌렀을 때
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()) {
            case android.R.id.home: //툴바 뒤로가기버튼 눌렸을 때 동작
                finish();
                return true;
            default:
                return super.onOptionsItemSelected (item);
        }
    }

    /**

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.alarms_main,container,false);

        btnStart = (Button) view.findViewById(R.id.btnStart);
        setHour1 = (NumberPicker) view.findViewById(R.id.setHour1);
        setMin1 = (NumberPicker) view.findViewById(R.id.setMin1);

        setHour1.setMaxValue(24);
        setHour1.setValue(1);
        setHour1.setMinValue(1);
        setMin1.setMaxValue(59);
        setMin1.setValue(0);
        setMin1.setMinValue(0);

        setHour1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

            }
        });
        //등록화면 눌렀을 때
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        return view;
    }
    */

}
