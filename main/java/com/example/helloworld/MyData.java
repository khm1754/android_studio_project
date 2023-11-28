//내 정보

package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
public class MyData extends AppCompatActivity {
    Toolbar toolbar;
    Button edit;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mydata_main);

        toolbar =  findViewById(R.id.toolbar);
        edit = (Button) findViewById(R.id.edit);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);      // 툴바에 뒤로가기 버튼 만들기
            getSupportActionBar().setTitle("내 정보");     //툴바 타이틀 지정
        }
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),editmyinfo.class);
                startActivity(intent);
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


}

