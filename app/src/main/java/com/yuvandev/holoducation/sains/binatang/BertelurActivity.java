package com.yuvandev.holoducation.sains.binatang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;

public class BertelurActivity extends AppCompatActivity {

    ImageView btnBack, btn_burung, btn_ular, btn_ayam, btn_kupu, btn_katak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bertelur);

        btnBack = findViewById(R.id.btn_back);
        btn_burung = findViewById(R.id.btn_burung);
        btn_ular = findViewById(R.id.btn_ular);
        btn_ayam = findViewById(R.id.btn_ayam);
        btn_kupu = findViewById(R.id.btn_kupu);
        btn_katak = findViewById(R.id.btn_katak);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_katak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BertelurActivity.this, AnimationActivity.class);
                intent.putExtra("data", "katak");
                startActivity(intent);
            }
        });

        btn_burung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BertelurActivity.this, AnimationActivity.class);
                intent.putExtra("data", "burung");
                startActivity(intent);
            }
        });

        btn_ular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BertelurActivity.this, AnimationActivity.class);
                intent.putExtra("data", "ular");
                startActivity(intent);
            }
        });

        btn_ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BertelurActivity.this, AnimationActivity.class);
                intent.putExtra("data", "ayam");
                startActivity(intent);
            }
        });

        btn_kupu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BertelurActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kupu");
                startActivity(intent);
            }
        });
    }
}