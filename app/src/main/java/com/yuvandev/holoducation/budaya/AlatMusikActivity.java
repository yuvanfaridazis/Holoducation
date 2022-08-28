package com.yuvandev.holoducation.budaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;
import com.yuvandev.holoducation.sains.alam.BendaLangitActivity;

public class AlatMusikActivity extends AppCompatActivity {

    ImageView btnBack, btn_sasando, btn_gamelan, btn_angklung, btn_kecapi, btn_tifa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alat_musik);

        btnBack = findViewById(R.id.btn_back);
        btn_sasando = findViewById(R.id.btn_sasando);
        btn_gamelan = findViewById(R.id.btn_gamelan);
        btn_angklung = findViewById(R.id.btn_angklung);
        btn_kecapi = findViewById(R.id.btn_kecapi);
        btn_tifa = findViewById(R.id.btn_tifa);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_sasando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatMusikActivity.this, AnimationActivity.class);
                intent.putExtra("data", "sasando");
                startActivity(intent);
            }
        });

        btn_gamelan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatMusikActivity.this, AnimationActivity.class);
                intent.putExtra("data", "gamelan");
                startActivity(intent);
            }
        });

        btn_angklung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatMusikActivity.this, AnimationActivity.class);
                intent.putExtra("data", "angklung");
                startActivity(intent);
            }
        });

        btn_kecapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatMusikActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kecapi");
                startActivity(intent);
            }
        });

        btn_tifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatMusikActivity.this, AnimationActivity.class);
                intent.putExtra("data", "tifa");
                startActivity(intent);
            }
        });
    }
}