// 하단 네비게이션 바


package com.example.helloworld;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuNavigation extends AppCompatActivity {
    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    Benefits benefits = new Benefits();
    MedicalCheck medicalCheck = new MedicalCheck();
    Weather weather = new Weather();
    Alarms alarms = new Alarms();
    Roundtheme roundtheme = new Roundtheme();
    EmergencyCall emergencyCall = new EmergencyCall();
    Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_navigation);

        bottomNavigationView = findViewById(R.id.bottomnavi);
        frameLayout = findViewById(R.id.framelayout);

        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        frameLayout = findViewById(R.id.framelayout);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framelayout,weather);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            changeFragment(item.getItemId());
            return true;
        });

        //네비게이션 버튼 최초 초기값
        bottomNavigationView.setSelectedItemId(R.id.bottomnavi_three);

    }

    //ToolBar 메뉴 생성
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate (R.menu.toolbar_menuitem, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //ToolBar 메뉴 선택 이벤트
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.item_mydata:
                Intent intent = new Intent(MenuNavigation.this,MyData.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected (item);
        }
    }

    @SuppressLint("NonConstantResourceId")
    public void changeFragment(int title_id) {
        fragmentTransaction = fragmentManager.beginTransaction();

        switch (title_id) {
            case R.id.bottomnavi_one:
                fragmentTransaction.replace(R.id.framelayout, weather);
                if(getSupportActionBar() != null) {
                    getSupportActionBar().setTitle("날씨");
                }
                fragmentTransaction.commit();
                break;
            case R.id.bottomnavi_two:
                fragmentTransaction.replace(R.id.framelayout, medicalCheck);
                if(getSupportActionBar() != null) {
                    getSupportActionBar().setTitle("일일 건강 진단");
                }
                fragmentTransaction.commit();
                break;
            case R.id.bottomnavi_three:
                fragmentTransaction.replace(R.id.framelayout, emergencyCall);
                if(getSupportActionBar() != null) {
                    getSupportActionBar().setTitle("긴급호출");
                }
                fragmentTransaction.commit();
                break;
            case R.id.bottomnavi_four:
                fragmentTransaction.replace(R.id.framelayout, benefits);
                if(getSupportActionBar() != null) {
                    getSupportActionBar().setTitle("복지 혜택");
                }
                fragmentTransaction.commit();
                break;
            case R.id.bottomnavi_five:
                fragmentTransaction.replace(R.id.framelayout, roundtheme);
                if(getSupportActionBar() != null) {
                    getSupportActionBar().setTitle("복용 약 알림");
                }
                fragmentTransaction.commit();
                break;
            default:
                break;
        }
    }
}
