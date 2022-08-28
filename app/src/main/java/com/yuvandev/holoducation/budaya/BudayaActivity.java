package com.yuvandev.holoducation.budaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yuvandev.holoducation.R;
import com.yuvandev.holoducation.sains.SainsActivity;
import com.yuvandev.holoducation.sains.alam.AlamActivity;

public class BudayaActivity extends AppCompatActivity {

    ImageView btn_alat_musik, btn_rumah_adat, btn_tarian, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);

        btn_alat_musik = findViewById(R.id.btn_alat_musik);
        btn_rumah_adat = findViewById(R.id.btn_rumah_adat);
        btn_tarian = findViewById(R.id.btn_tarian);

        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_alat_musik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BudayaActivity.this, AlatMusikActivity.class);
                startActivity(intent);
            }
        });

        btn_rumah_adat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BudayaActivity.this, RumahAdatActivity.class);
                startActivity(intent);
            }
        });

        btn_tarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BudayaActivity.this, TarianActivity.class);
                startActivity(intent);
            }
        });
    }
}