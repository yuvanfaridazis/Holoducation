package com.yuvandev.holoducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.budaya.BudayaActivity;
import com.yuvandev.holoducation.sains.SainsActivity;

public class GalleryActivity extends AppCompatActivity {

    ImageView btn_sains, btn_budaya, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        btn_budaya = findViewById(R.id.btn_budaya);
        btn_sains = findViewById(R.id.btn_sains);

        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_budaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalleryActivity.this, BudayaActivity.class);
                startActivity(intent);
            }
        });

        btn_sains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalleryActivity.this, SainsActivity.class);
                startActivity(intent);
            }
        });
    }
}