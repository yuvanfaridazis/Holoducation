package com.yuvandev.holoducation.sains.teknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;
import com.yuvandev.holoducation.sains.binatang.LiarActivity;

public class AlatKomunikasiActivity extends AppCompatActivity {

    ImageView btnBack, btn_komputer, btn_radio, btn_tv, btn_koran, btn_hp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alat_komunikasi);

        btnBack = findViewById(R.id.btn_back);
        btn_radio = findViewById(R.id.btn_radio);
        btn_tv = findViewById(R.id.btn_tv);
        btn_koran = findViewById(R.id.btn_koran);
        btn_hp = findViewById(R.id.btn_hp);
        btn_komputer = findViewById(R.id.btn_komputer);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatKomunikasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "televisi");
                startActivity(intent);
            }
        });

        btn_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatKomunikasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "radio");
                startActivity(intent);
            }
        });

        btn_koran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatKomunikasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "koran");
                startActivity(intent);
            }
        });

        btn_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatKomunikasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "handphone");
                startActivity(intent);
            }
        });

        btn_komputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatKomunikasiActivity.this, AnimationActivity.class);
                intent.putExtra("data", "komputer");
                startActivity(intent);
            }
        });
    }
}