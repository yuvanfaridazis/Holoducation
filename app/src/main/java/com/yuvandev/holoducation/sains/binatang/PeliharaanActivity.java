package com.yuvandev.holoducation.sains.binatang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;

public class PeliharaanActivity extends AppCompatActivity {

    ImageView btnBack, btn_sapi, btn_kambing, btn_hamster, btn_kucing, btn_kelinci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliharaan);

        btnBack = findViewById(R.id.btn_back);
        btn_sapi = findViewById(R.id.btn_sapi);
        btn_kelinci = findViewById(R.id.btn_kelinci);
        btn_kucing = findViewById(R.id.btn_kucing);
        btn_hamster = findViewById(R.id.btn_hamster);
        btn_kambing = findViewById(R.id.btn_kambing);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_sapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeliharaanActivity.this, AnimationActivity.class);
                intent.putExtra("data", "sapi");
                startActivity(intent);
            }
        });

        btn_kambing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeliharaanActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kambing");
                startActivity(intent);
            }
        });

        btn_kucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeliharaanActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kucing");
                startActivity(intent);
            }
        });

        btn_kelinci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeliharaanActivity.this, AnimationActivity.class);
                intent.putExtra("data", "kelinci");
                startActivity(intent);
            }
        });

        btn_hamster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeliharaanActivity.this, AnimationActivity.class);
                intent.putExtra("data", "hamster");
                startActivity(intent);
            }
        });
    }
}