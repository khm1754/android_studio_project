package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

public class MedicalCheck extends Fragment {
    View view;
    Button Check;
    ImageButton t1, t2, t3, t4, t5, t6, t7, t8, t9;
    CheckBox tt1, tt2, tt3, tt4, tt5, tt6, tt7, tt8, tt9;
    int num;
    String phoneNo = "01000000000";
    Spinner spinner1, spinner2;
    ArrayList<String> arrayList, arrayList2;
    ArrayAdapter<String> arrayAdapter, arrayAdapter2;
    FrameLayout frameLayout;
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;

    EmergencyCall emergencyCall = new EmergencyCall();

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.medicalcheck_main, container, false);

        Check = (Button) view.findViewById(R.id.Check);
        t1 = (ImageButton) view.findViewById(R.id.t1);
        t2 = (ImageButton) view.findViewById(R.id.t2);
        t3 = (ImageButton) view.findViewById(R.id.t3);
        t4 = (ImageButton) view.findViewById(R.id.t4);
        t5 = (ImageButton) view.findViewById(R.id.t5);
        t6 = (ImageButton) view.findViewById(R.id.t6);
        t7 = (ImageButton) view.findViewById(R.id.t7);
        t8 = (ImageButton) view.findViewById(R.id.t8);
        t9 = (ImageButton) view.findViewById(R.id.t9);
        tt1 = (CheckBox) view.findViewById(R.id.tt1);
        tt2 = (CheckBox) view.findViewById(R.id.tt2);
        tt3 = (CheckBox) view.findViewById(R.id.tt3);
        tt4 = (CheckBox) view.findViewById(R.id.tt4);
        tt5 = (CheckBox) view.findViewById(R.id.tt5);
        tt6 = (CheckBox) view.findViewById(R.id.tt6);
        tt7 = (CheckBox) view.findViewById(R.id.tt7);
        tt8 = (CheckBox) view.findViewById(R.id.tt8);
        tt9 = (CheckBox) view.findViewById(R.id.tt9);
        spinner1 = (Spinner) view.findViewById(R.id.spinner1);
        spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("10");
        arrayList.add("11");
        arrayList.add("12");
        arrayAdapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_dropdown_item, arrayList);
        spinner1.setAdapter(arrayAdapter);
        arrayList2 = new ArrayList<>();
        arrayList2.add("1");
        arrayList2.add("2");
        arrayList2.add("3");
        arrayList2.add("4");
        arrayList2.add("5");
        arrayList2.add("6");
        arrayList2.add("7");
        arrayList2.add("8");
        arrayList2.add("9");
        arrayList2.add("10");
        arrayList2.add("11");
        arrayList2.add("12");
        arrayList2.add("13");
        arrayList2.add("14");
        arrayList2.add("15");
        arrayList2.add("16");
        arrayList2.add("17");
        arrayList2.add("18");
        arrayList2.add("19");
        arrayList2.add("20");
        arrayList2.add("21");
        arrayList2.add("22");
        arrayList2.add("23");
        arrayList2.add("24");
        arrayList2.add("25");
        arrayList2.add("26");
        arrayList2.add("27");
        arrayList2.add("28");
        arrayList2.add("29");
        arrayList2.add("30");
        arrayList2.add("31");
        arrayList2.add("32");
        arrayList2.add("33");
        arrayList2.add("34");
        arrayList2.add("35");
        arrayList2.add("36");
        arrayList2.add("37");
        arrayList2.add("38");
        arrayList2.add("39");
        arrayList2.add("40");
        arrayList2.add("41");
        arrayList2.add("42");
        arrayList2.add("43");
        arrayList2.add("44");
        arrayList2.add("45");
        arrayList2.add("46");
        arrayList2.add("47");
        arrayList2.add("48");
        arrayList2.add("49");
        arrayList2.add("50");
        arrayList2.add("51");
        arrayList2.add("52");
        arrayList2.add("53");
        arrayList2.add("54");
        arrayList2.add("55");
        arrayList2.add("56");
        arrayList2.add("57");
        arrayList2.add("58");
        arrayList2.add("59");
        arrayList2.add("60");
        arrayAdapter2 = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_dropdown_item, arrayList2);
        spinner2.setAdapter(arrayAdapter2);


        Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num >= 3) {
                    try {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(phoneNo, null,
                                "병원 가보시는걸 추천해드립니다.", null, null);
                        Toast.makeText(getContext(), "전송 완료!", Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(getContext(), "전송 실패",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                }


            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt1.setChecked(true);
                num += 1;
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt2.setChecked(true);
                num += 1;
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt3.setChecked(true);
                num += 1;
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt4.setChecked(true);
                num += 1;
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt5.setChecked(true);
                num += 1;
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt6.setChecked(true);
                num += 1;
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt7.setChecked(true);
                num += 1;
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt8.setChecked(true);
                num += 1;
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt9.setChecked(true);
                num += 1;
            }
        });
        return view;
    }
}