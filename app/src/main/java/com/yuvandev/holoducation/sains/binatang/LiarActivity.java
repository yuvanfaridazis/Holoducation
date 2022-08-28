package com.yuvandev.holoducation.sains.binatang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;

public class LiarActivity extends AppCompatActivity {

    ImageView btnBack, btn_buaya, btn_singa, btn_kuda_nil, btn_badak, btn_macan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liar);

        btnBack = findViewById(R.id.btn_back);
        btn_buaya = findViewById(R.id.btn_buaya);
        btn_singa = findViewById(R.id.btn_singa);
        btn_kuda_nil = findViewById(R.id.btn_kuda_nil);
        btn_badak = findViewById(R.id.btn_badak);
        btn_macan = findViewById(R.id.btn_macan);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_buaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiarActivity.this, AnimationActivity.class);
                intent.putExtra("data", "buaya");
                startActivity(intent);
            }
        });

        btn_singa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiarActivity.this, AnimationActivity.class);
                intent.putExtra("data", "singa");
                startActivity(intent);
            }
        });

        btn_kuda_nil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiarActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kudanil");
                startActivity(intent);
            }
        });

        btn_badak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiarActivity.this, AnimationActivity.class);
                intent.putExtra("data", "badak");
                startActivity(intent);
            }
        });

        btn_macan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiarActivity.this, AnimationActivity.class);
                intent.putExtra("data", "macan");
                startActivity(intent);
            }
        });
    }
}