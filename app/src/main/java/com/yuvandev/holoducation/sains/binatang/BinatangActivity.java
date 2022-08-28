package com.yuvandev.holoducation.sains.binatang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.R;
import com.yuvandev.holoducation.budaya.AlatMusikActivity;
import com.yuvandev.holoducation.budaya.BudayaActivity;

public class BinatangActivity extends AppCompatActivity {

    ImageView btn_beranak, btn_bertelur, btn_peliharaan, btn_liar, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binatang);

        btn_beranak = findViewById(R.id.btn_beranak);
        btn_bertelur = findViewById(R.id.btn_bertelur);
        btn_peliharaan = findViewById(R.id.btn_peliharaan);
        btn_liar = findViewById(R.id.btn_liar);

        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_beranak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this, BeranakActivity.class);
                startActivity(intent);
            }
        });

        btn_bertelur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this, BertelurActivity.class);
                startActivity(intent);
            }
        });

        btn_peliharaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this, PeliharaanActivity.class);
                startActivity(intent);
            }
        });

        btn_liar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BinatangActivity.this, LiarActivity.class);
                startActivity(intent);
            }
        });
    }
}