  package com.example.bai1webb;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView chuvi,dientich;
    EditText rong,dai;
    Button tinh,chuyen;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        chuvi = findViewById(R.id.chuvi);
        dientich = findViewById(R.id.dientich);
        rong = findViewById(R.id.rong);
        dai = findViewById(R.id.dai);
        tinh = findViewById(R.id.tinh);
        chuyen = findViewById(R.id.chuyen);

        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HinhChuNhat hinhChuNhat = new HinhChuNhat();
                hinhChuNhat.setDai(Integer.parseInt(dai.getText().toString()));
                hinhChuNhat.setRong(Integer.parseInt(rong.getText().toString()));
                chuvi.setText("Chu vi: " + hinhChuNhat.chuvi());
                dientich.setText("Diện tích: " + hinhChuNhat.dientich());
            }
        });
        chuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}