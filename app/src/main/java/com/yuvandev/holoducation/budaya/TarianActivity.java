package com.yuvandev.holoducation.budaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.AnimationActivity;
import com.yuvandev.holoducation.R;

public class TarianActivity extends AppCompatActivity {

    ImageView btnBack, btn_aceh, btn_jawa_timur, btn_bali, btn_jawa_tengah, btn_papua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarian);

        btnBack = findViewById(R.id.btn_back);
        btn_aceh = findViewById(R.id.btn_aceh);
        btn_jawa_timur = findViewById(R.id.btn_jawa_timur);
        btn_bali = findViewById(R.id.btn_bali);
        btn_jawa_tengah = findViewById(R.id.btn_jawa_tengah);
        btn_papua = findViewById(R.id.btn_papua);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_aceh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TarianActivity.this, AnimationActivity.class);
                intent.putExtra("data", "aceh");
                startActivity(intent);
            }
        });

        btn_jawa_timur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TarianActivity.this, AnimationActivity.class);
                intent.putExtra("data", "jawa timur");
                startActivity(intent);
            }
        });

        btn_bali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TarianActivity.this, AnimationActivity.class);
                intent.putExtra("data", "bali");
                startActivity(intent);
            }
        });

        btn_jawa_tengah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TarianActivity.this, AnimationActivity.class);
                intent.putExtra("data", "jawa tengah");
                startActivity(intent);
            }
        });

        btn_papua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TarianActivity.this, AnimationActivity.class);
                intent.putExtra("data", "papua");
                startActivity(intent);
            }
        });
    }
}