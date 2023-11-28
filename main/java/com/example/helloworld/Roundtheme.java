package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Roundtheme extends Fragment {
    Button btn_set ;
    View view;
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.roundtheme, container, false);
        btn_set = (Button) view.findViewById(R.id.btn_set);

        btn_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Alarms.class);
                intent.putExtra("title","복용약 알림");
                startActivity(intent);
            }
        });

        return view;
    };
}
