package com.yuvandev.holoducation.sains.teknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;

public class TrasnportasiActivity extends AppCompatActivity {

    ImageView btnBack, btn_motor, btn_mobil, btn_kereta_api, btn_bis, btn_kapal
            , btn_pesawat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasnportasi);

        btnBack = findViewById(R.id.btn_back);
        btn_motor = findViewById(R.id.btn_motor);
        btn_mobil = findViewById(R.id.btn_mobil);
        btn_kereta_api = findViewById(R.id.btn_kereta_api);
        btn_bis = findViewById(R.id.btn_bis);
        btn_kapal = findViewById(R.id.btn_kapal);
        btn_pesawat = findViewById(R.id.btn_pesawat);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_pesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrasnportasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "pesawat");
                startActivity(intent);
            }
        });

        btn_motor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrasnportasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "motor");
                startActivity(intent);
            }
        });

        btn_mobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrasnportasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "mobil");
                startActivity(intent);
            }
        });

        btn_kereta_api.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrasnportasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kereta");
                startActivity(intent);
            }
        });

        btn_bis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrasnportasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "bis");
                startActivity(intent);
            }
        });

        btn_kapal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrasnportasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kapal");
                startActivity(intent);
            }
        });
    }
}