package com.yuvandev.holoducation.sains.alam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;
import com.yuvandev.holoducation.sains.teknologi.TrasnportasiActivity;

public class GejalaAlamActivity extends AppCompatActivity {

    ImageView btnBack, btn_hujan, btn_kemarau, btn_semi, btn_dingin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala_alam);

        btnBack = findViewById(R.id.btn_back);
        btn_hujan = findViewById(R.id.btn_hujan);
        btn_kemarau = findViewById(R.id.btn_kemarau);
        btn_semi = findViewById(R.id.btn_semi);
        btn_dingin = findViewById(R.id.btn_dingin);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_hujan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GejalaAlamActivity.this, AnimationActivity.class);
                intent.putExtra("data", "hujan");
                startActivity(intent);
            }
        });

        btn_kemarau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GejalaAlamActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kemarau");
                startActivity(intent);
            }
        });

        btn_semi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GejalaAlamActivity.this, AnimationActivity.class);
                intent.putExtra("data", "semi");
                startActivity(intent);
            }
        });

        btn_dingin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GejalaAlamActivity.this, AnimationActivity.class);
                intent.putExtra("data", "dingin");
                startActivity(intent);
            }
        });
    }
}