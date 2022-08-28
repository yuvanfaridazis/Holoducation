package com.yuvandev.holoducation.sains.alam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;

public class BendaLangitActivity extends AppCompatActivity {

    ImageView btnBack, btn_bintang, btn_bulan, btn_matahari, btn_awan, btn_pelangi, btn_komet, btn_planet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benda_langit);

        btnBack = findViewById(R.id.btn_back);
        btn_bintang = findViewById(R.id.btn_bintang);
        btn_bulan = findViewById(R.id.btn_bulan);
        btn_matahari = findViewById(R.id.btn_matahari);
        btn_awan = findViewById(R.id.btn_awan);
        btn_pelangi = findViewById(R.id.btn_pelangi);
        btn_komet = findViewById(R.id.btn_komet);
        btn_planet = findViewById(R.id.btn_planet);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_bintang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BendaLangitActivity.this, AnimationActivity.class);
                intent.putExtra("data", "bintang");
                startActivity(intent);
            }
        });

        btn_bulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BendaLangitActivity.this, AnimationActivity.class);
                intent.putExtra("data", "bulan");
                startActivity(intent);
            }
        });

        btn_matahari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BendaLangitActivity.this, AnimationActivity.class);
                intent.putExtra("data", "matahari");
                startActivity(intent);
            }
        });

        btn_planet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BendaLangitActivity.this, AnimationActivity.class);
                intent.putExtra("data", "planet");
                startActivity(intent);
            }
        });

        btn_awan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BendaLangitActivity.this, AnimationActivity.class);
                intent.putExtra("data", "awan");
                startActivity(intent);
            }
        });

        btn_komet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BendaLangitActivity.this, AnimationActivity.class);
                intent.putExtra("data", "komet");
                startActivity(intent);
            }
        });

        btn_pelangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BendaLangitActivity.this, AnimationActivity.class);
                intent.putExtra("data", "pelangi");
                startActivity(intent);
            }
        });
    }
}