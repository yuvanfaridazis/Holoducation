package com.yuvandev.holoducation.sains.binatang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;

public class BeranakActivity extends AppCompatActivity {

    ImageView btnBack, btn_unta, btn_gajah, btn_jerapah, btn_kuda, btn_monyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranak);

        btnBack = findViewById(R.id.btn_back);
        btn_gajah = findViewById(R.id.btn_gajah);
        btn_jerapah = findViewById(R.id.btn_jerapah);
        btn_kuda = findViewById(R.id.btn_kuda);
        btn_monyet = findViewById(R.id.btn_monyet);
        btn_unta = findViewById(R.id.btn_unta);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_monyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeranakActivity.this, AnimationActivity.class);
                intent.putExtra("data", "monyet");
                startActivity(intent);
            }
        });

        btn_unta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeranakActivity.this, AnimationActivity.class);
                intent.putExtra("data", "unta");
                startActivity(intent);
            }
        });

        btn_gajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeranakActivity.this, AnimationActivity.class);
                intent.putExtra("data", "gajah");
                startActivity(intent);
            }
        });

        btn_jerapah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeranakActivity.this, AnimationActivity.class);
                intent.putExtra("data", "jerapah");
                startActivity(intent);
            }
        });

        btn_kuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeranakActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kuda");
                startActivity(intent);
            }
        });
    }
}