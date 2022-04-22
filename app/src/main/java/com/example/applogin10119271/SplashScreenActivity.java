package com.example.applogin10119271;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SplashScreenActivity extends AppCompatActivity {

    private Button btnSplash;

    //Tanggal pengerjaan: 22-04-2022
    //NIM : 10119271
    //Nama : Ikra Esa A'raaf Mahardika
    //Kelas : IF 7
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        btnSplash = findViewById(R.id.btn_splash);

        btnSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}