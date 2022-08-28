package com.yuvandev.holoducation.sains.teknologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.R;
import com.yuvandev.holoducation.sains.alam.AlamActivity;
import com.yuvandev.holoducation.sains.alam.GejalaAlamActivity;

public class TeknologiActivity extends AppCompatActivity {

    ImageView btn_alat_komunikasi, btn_alat_transportasi, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknologi);

        btn_alat_transportasi = findViewById(R.id.btn_alat_transportasi);
        btn_alat_komunikasi = findViewById(R.id.btn_alat_komunikasi);

        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_alat_transportasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeknologiActivity.this, TrasnportasiActivity.class);
                startActivity(intent);
            }
        });

        btn_alat_komunikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeknologiActivity.this, AlatKomunikasiActivity.class);
                startActivity(intent);
            }
        });
    }
}