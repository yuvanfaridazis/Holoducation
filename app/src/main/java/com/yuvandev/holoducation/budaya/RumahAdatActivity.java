package com.yuvandev.holoducation.budaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;

public class RumahAdatActivity extends AppCompatActivity {

    ImageView btnBack, btn_honai, btn_gadang, btn_badui, btn_joglo, btn_mandar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah_adat);

        btnBack = findViewById(R.id.btn_back);
        btn_honai = findViewById(R.id.btn_honai);
        btn_gadang = findViewById(R.id.btn_gadang);
        btn_badui = findViewById(R.id.btn_badui);
        btn_joglo = findViewById(R.id.btn_joglo);
        btn_mandar = findViewById(R.id.btn_mandar);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_honai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RumahAdatActivity.this, AnimationActivity.class);
                intent.putExtra("data", "honai");
                startActivity(intent);
            }
        });

        btn_gadang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RumahAdatActivity.this, AnimationActivity.class);
                intent.putExtra("data", "gadang");
                startActivity(intent);
            }
        });

        btn_badui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RumahAdatActivity.this, AnimationActivity.class);
                intent.putExtra("data", "badui");
                startActivity(intent);
            }
        });

        btn_joglo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RumahAdatActivity.this, AnimationActivity.class);
                intent.putExtra("data", "joglo");
                startActivity(intent);
            }
        });

        btn_mandar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RumahAdatActivity.this, AnimationActivity.class);
                intent.putExtra("data", "mandar");
                startActivity(intent);
            }
        });
    }
}