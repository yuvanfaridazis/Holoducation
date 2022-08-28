package com.yuvandev.holoducation.sains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.GalleryActivity;
import com.yuvandev.holoducation.R;
import com.yuvandev.holoducation.budaya.BudayaActivity;
import com.yuvandev.holoducation.sains.alam.AlamActivity;
import com.yuvandev.holoducation.sains.binatang.BinatangActivity;
import com.yuvandev.holoducation.sains.teknologi.TeknologiActivity;

public class SainsActivity extends AppCompatActivity {

    ImageView btn_alam, btn_teknologi, btn_binatang, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sains);

        btn_alam = findViewById(R.id.btn_alam);
        btn_teknologi = findViewById(R.id.btn_teknologi);
        btn_binatang = findViewById(R.id.btn_binatang);

        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_alam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SainsActivity.this, AlamActivity.class);
                startActivity(intent);
            }
        });

        btn_teknologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SainsActivity.this, TeknologiActivity.class);
                startActivity(intent);
            }
        });

        btn_binatang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SainsActivity.this, BinatangActivity.class);
                startActivity(intent);
            }
        });
    }
}