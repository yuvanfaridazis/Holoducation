package com.yuvandev.holoducation.sains.alam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.R;
import com.yuvandev.holoducation.sains.binatang.BertelurActivity;
import com.yuvandev.holoducation.sains.binatang.BinatangActivity;

public class AlamActivity extends AppCompatActivity {

    ImageView btn_gejala_alam, btn_benda_langit, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam);

        btn_gejala_alam = findViewById(R.id.btn_gejala_alam);
        btn_benda_langit = findViewById(R.id.btn_benda_langit);

        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_gejala_alam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlamActivity.this, GejalaAlamActivity.class);
                startActivity(intent);
            }
        });

        btn_benda_langit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlamActivity.this, BendaLangitActivity.class);
                startActivity(intent);
            }
        });
    }
}