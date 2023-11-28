// 복지혜택 메인화면 로직

package com.example.helloworld;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Benefits extends Fragment {
    View view;
    TextView textView1,textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.benefits_main,container,false);

        textView1 = (TextView) view.findViewById(R.id.textView1);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        textView3 = (TextView) view.findViewById(R.id.textView3);
        textView4 = (TextView) view.findViewById(R.id.textView4);
        textView5 = (TextView) view.findViewById(R.id.textView5);
        textView6 = (TextView) view.findViewById(R.id.textView6);
        textView7 = (TextView) view.findViewById(R.id.textView7);
        textView8 = (TextView) view.findViewById(R.id.textView8);
        textView9 = (TextView) view.findViewById(R.id.textView9);
        textView10 = (TextView) view.findViewById(R.id.textView10);
        textView11 = (TextView) view.findViewById(R.id.textView11);

        textView1.setText("의료 지원 정책");
        textView1.setTextSize(20);
        textView2.setText("노인 여행 돌봄 서비스");
        textView2.setTextSize(20);
        textView3.setText("노인 틀니 지원");
        textView3.setTextSize(20);
        textView4.setText("노인 이동수단 지원");
        textView4.setTextSize(20);
        textView5.setText("노인 기초연금");
        textView5.setTextSize(20);
        textView6.setText("노인 교통비지원");
        textView6.setTextSize(20);
        textView7.setText("노인 통신비지원");
        textView7.setTextSize(20);
        textView8.setText("노인 일자리 사업");
        textView8.setTextSize(20);
        textView9.setText("노인 장기 요양 보험");
        textView9.setTextSize(20);
        textView10.setText("노인 돌봄 서비스");
        textView10.setTextSize(20);
        textView11.setText("복지기관위치");
        textView11.setTextSize(20);

        textView1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),BenefitsDetail.class);
            intent.putExtra("detailNumber","1");
            intent.putExtra("title",textView1.getText());
            startActivity(intent);
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),BenefitsDetail.class);
                intent.putExtra("detailNumber","2");
                intent.putExtra("title",textView2.getText());
                startActivity(intent);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),BenefitsDetail.class);
                intent.putExtra("detailNumber","3");
                intent.putExtra("title",textView3.getText());
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),BenefitsDetail.class);
                intent.putExtra("detailNumber","4");
                intent.putExtra("title",textView4.getText());
                startActivity(intent);
            }
        });
        
        return view;


    }
}
