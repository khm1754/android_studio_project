//복지혜택 내용들

package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BenefitsDetail extends AppCompatActivity {
    String detailNumber = "";
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        detailNumber = intent.getStringExtra("detailNumber");

        //리스트목록 터치 한 결과 기준으로 보여질 화면 정해준다.
        switch (detailNumber) {
            case "1":
                setContentView(R.layout.benefits_detail);
                break;
            case "2":
                setContentView(R.layout.benefits_detail2);
                break;
            case "3":
                setContentView(R.layout.benefits_detail3);
                break;
            case "4":
                setContentView(R.layout.benefits_detail4);
                break;
        }

        //툴바 연결
        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);      // 툴바에 뒤로가기 버튼 만들기
            getSupportActionBar().setTitle(intent.getStringExtra("title"));     //툴바 타이틀 지정
        }
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
}
