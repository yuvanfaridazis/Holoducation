package com.yuvandev.holoducation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class AnimationActivity extends AppCompatActivity {

    GifImageView anim_atas, anim_bawah, anim_kanan, anim_kiri;
    int resId;

    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        anim_atas = findViewById(R.id.anim_atas);
        anim_bawah = findViewById(R.id.anim_bawah);
        anim_kanan = findViewById(R.id.anim_kanan);
        anim_kiri = findViewById(R.id.anim_kiri);

        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        try {
            GifDrawable gifFromResource = new GifDrawable( getResources(), R.drawable.sapi );

//            anim_atas.setImageResource(R.drawable.sapi);
//            anim_bawah.setImageResource(R.drawable.sapi);
//            anim_kiri.setImageResource(R.drawable.sapi);
//            anim_kanan.setImageResource(R.drawable.sapi);

            Bundle bundle = getIntent().getExtras();

            if (bundle != null) {

                String data = bundle.getString("data");
                Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();

                if(data.equals("sapi")){

                    GifDrawable item = new GifDrawable( getResources(), R.drawable.sapi );

                    anim_atas.setImageResource(R.drawable.sapi);
                    anim_bawah.setImageResource(R.drawable.sapi);
                    anim_kiri.setImageResource(R.drawable.sapi);
                    anim_kanan.setImageResource(R.drawable.sapi);
                }

                if(data.equals("kucing")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kucing );

                    anim_atas.setImageResource(R.drawable.kucing);
                    anim_bawah.setImageResource(R.drawable.kucing);
                    anim_kiri.setImageResource(R.drawable.kucing);
                    anim_kanan.setImageResource(R.drawable.kucing);
                }

                if(data.equals("kambing")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kambing );

                    anim_atas.setImageResource(R.drawable.kambing);
                    anim_bawah.setImageResource(R.drawable.kambing);
                    anim_kiri.setImageResource(R.drawable.kambing);
                    anim_kanan.setImageResource(R.drawable.kambing);
                }

                if(data.equals("kelinci")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kelinci );

                    anim_atas.setImageResource(R.drawable.kelinci);
                    anim_bawah.setImageResource(R.drawable.kelinci);
                    anim_kiri.setImageResource(R.drawable.kelinci);
                    anim_kanan.setImageResource(R.drawable.kelinci);
                }

                if(data.equals("hamster")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.hamster );

                    anim_atas.setImageResource(R.drawable.hamster);
                    anim_bawah.setImageResource(R.drawable.hamster);
                    anim_kiri.setImageResource(R.drawable.hamster);
                    anim_kanan.setImageResource(R.drawable.hamster);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("gajah")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.gajah );

                    anim_atas.setImageResource(R.drawable.gajah);
                    anim_bawah.setImageResource(R.drawable.gajah);
                    anim_kiri.setImageResource(R.drawable.gajah);
                    anim_kanan.setImageResource(R.drawable.gajah);
                }

                if(data.equals("jerapah")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.jerapah );

                    anim_atas.setImageResource(R.drawable.jerapah);
                    anim_bawah.setImageResource(R.drawable.jerapah);
                    anim_kiri.setImageResource(R.drawable.jerapah);
                    anim_kanan.setImageResource(R.drawable.jerapah);
                }

                if(data.equals("kuda")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kuda );

                    anim_atas.setImageResource(R.drawable.kuda);
                    anim_bawah.setImageResource(R.drawable.kuda);
                    anim_kiri.setImageResource(R.drawable.kuda);
                    anim_kanan.setImageResource(R.drawable.kuda);
                }

                if(data.equals("monyet")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kera );

                    anim_atas.setImageResource(R.drawable.kera);
                    anim_bawah.setImageResource(R.drawable.kera);
                    anim_kiri.setImageResource(R.drawable.kera);
                    anim_kanan.setImageResource(R.drawable.kera);
                }

                if(data.equals("unta")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.unta );

                    anim_atas.setImageResource(R.drawable.unta);
                    anim_bawah.setImageResource(R.drawable.unta);
                    anim_kiri.setImageResource(R.drawable.unta);
                    anim_kanan.setImageResource(R.drawable.unta);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("burung")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.burung );

                    anim_atas.setImageResource(R.drawable.burung);
                    anim_bawah.setImageResource(R.drawable.burung);
                    anim_kiri.setImageResource(R.drawable.burung);
                    anim_kanan.setImageResource(R.drawable.burung);
                }

                if(data.equals("ular")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.ular );

                    anim_atas.setImageResource(R.drawable.ular);
                    anim_bawah.setImageResource(R.drawable.ular);
                    anim_kiri.setImageResource(R.drawable.ular);
                    anim_kanan.setImageResource(R.drawable.ular);
                }

                if(data.equals("ayam")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.ayam );

                    anim_atas.setImageResource(R.drawable.ayam);
                    anim_bawah.setImageResource(R.drawable.ayam);
                    anim_kiri.setImageResource(R.drawable.ayam);
                    anim_kanan.setImageResource(R.drawable.ayam);
                }

                if(data.equals("kupu")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kupu );

                    anim_atas.setImageResource(R.drawable.kupu);
                    anim_bawah.setImageResource(R.drawable.kupu);
                    anim_kiri.setImageResource(R.drawable.kupu);
                    anim_kanan.setImageResource(R.drawable.kupu);
                }

                if(data.equals("katak")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.katak );

                    anim_atas.setImageResource(R.drawable.katak);
                    anim_bawah.setImageResource(R.drawable.katak);
                    anim_kiri.setImageResource(R.drawable.katak);
                    anim_kanan.setImageResource(R.drawable.katak);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("buaya")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.buaya );

                    anim_atas.setImageResource(R.drawable.buaya);
                    anim_bawah.setImageResource(R.drawable.buaya);
                    anim_kiri.setImageResource(R.drawable.buaya);
                    anim_kanan.setImageResource(R.drawable.buaya);
                }

                if(data.equals("singa")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.singa );

                    anim_atas.setImageResource(R.drawable.singa);
                    anim_bawah.setImageResource(R.drawable.singa);
                    anim_kiri.setImageResource(R.drawable.singa);
                    anim_kanan.setImageResource(R.drawable.singa);
                }

                if(data.equals("kudanil")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kudanil );

                    anim_atas.setImageResource(R.drawable.kudanil);
                    anim_bawah.setImageResource(R.drawable.kudanil);
                    anim_kiri.setImageResource(R.drawable.kudanil);
                    anim_kanan.setImageResource(R.drawable.kudanil);
                }

                if(data.equals("badak")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.badak );

                    anim_atas.setImageResource(R.drawable.badak);
                    anim_bawah.setImageResource(R.drawable.badak);
                    anim_kiri.setImageResource(R.drawable.badak);
                    anim_kanan.setImageResource(R.drawable.badak);
                }

                if(data.equals("macan")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.harimau );

                    anim_atas.setImageResource(R.drawable.harimau);
                    anim_bawah.setImageResource(R.drawable.harimau);
                    anim_kiri.setImageResource(R.drawable.harimau);
                    anim_kanan.setImageResource(R.drawable.harimau);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("bintang")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.bintang );

                    anim_atas.setImageResource(R.drawable.bintang);
                    anim_bawah.setImageResource(R.drawable.bintang);
                    anim_kiri.setImageResource(R.drawable.bintang);
                    anim_kanan.setImageResource(R.drawable.bintang);
                }

                if(data.equals("bulan")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.bulan );

                    anim_atas.setImageResource(R.drawable.bulan);
                    anim_bawah.setImageResource(R.drawable.bulan);
                    anim_kiri.setImageResource(R.drawable.bulan);
                    anim_kanan.setImageResource(R.drawable.bulan);
                }

                if(data.equals("matahari")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.matahari );

                    anim_atas.setImageResource(R.drawable.matahari);
                    anim_bawah.setImageResource(R.drawable.matahari);
                    anim_kiri.setImageResource(R.drawable.matahari);
                    anim_kanan.setImageResource(R.drawable.matahari);
                }

                if(data.equals("awan")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.awan );

                    anim_atas.setImageResource(R.drawable.awan);
                    anim_bawah.setImageResource(R.drawable.awan);
                    anim_kiri.setImageResource(R.drawable.awan);
                    anim_kanan.setImageResource(R.drawable.awan);
                }

                if(data.equals("pelangi")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.pelangi );

                    anim_atas.setImageResource(R.drawable.pelangi);
                    anim_bawah.setImageResource(R.drawable.pelangi);
                    anim_kiri.setImageResource(R.drawable.pelangi);
                    anim_kanan.setImageResource(R.drawable.pelangi);
                }

                if(data.equals("komet")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.komet );

                    anim_atas.setImageResource(R.drawable.komet);
                    anim_bawah.setImageResource(R.drawable.komet);
                    anim_kiri.setImageResource(R.drawable.komet);
                    anim_kanan.setImageResource(R.drawable.komet);
                }

                if(data.equals("planet")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.planet );

                    anim_atas.setImageResource(R.drawable.planet);
                    anim_bawah.setImageResource(R.drawable.planet);
                    anim_kiri.setImageResource(R.drawable.planet);
                    anim_kanan.setImageResource(R.drawable.planet);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("hujan")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.hujan );

                    anim_atas.setImageResource(R.drawable.hujan);
                    anim_bawah.setImageResource(R.drawable.hujan);
                    anim_kiri.setImageResource(R.drawable.hujan);
                    anim_kanan.setImageResource(R.drawable.hujan);
                }

                if(data.equals("kemarau")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kemarau );

                    anim_atas.setImageResource(R.drawable.kemarau);
                    anim_bawah.setImageResource(R.drawable.kemarau);
                    anim_kiri.setImageResource(R.drawable.kemarau);
                    anim_kanan.setImageResource(R.drawable.kemarau);
                }

                if(data.equals("semi")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.semi);

                    anim_atas.setImageResource(R.drawable.semi);
                    anim_bawah.setImageResource(R.drawable.semi);
                    anim_kiri.setImageResource(R.drawable.semi);
                    anim_kanan.setImageResource(R.drawable.semi);
                }

                if(data.equals("dingin")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.dingin );

                    anim_atas.setImageResource(R.drawable.dingin);
                    anim_bawah.setImageResource(R.drawable.dingin);
                    anim_kiri.setImageResource(R.drawable.dingin);
                    anim_kanan.setImageResource(R.drawable.dingin);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("motor")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.motor );

                    anim_atas.setImageResource(R.drawable.motor);
                    anim_bawah.setImageResource(R.drawable.motor);
                    anim_kiri.setImageResource(R.drawable.motor);
                    anim_kanan.setImageResource(R.drawable.motor);
                }

                if(data.equals("mobil")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.mobil );

                    anim_atas.setImageResource(R.drawable.mobil);
                    anim_bawah.setImageResource(R.drawable.mobil);
                    anim_kiri.setImageResource(R.drawable.mobil);
                    anim_kanan.setImageResource(R.drawable.mobil);
                }

                if(data.equals("kereta")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kereta );

                    anim_atas.setImageResource(R.drawable.kereta);
                    anim_bawah.setImageResource(R.drawable.kereta);
                    anim_kiri.setImageResource(R.drawable.kereta);
                    anim_kanan.setImageResource(R.drawable.kereta);
                }

                if(data.equals("bis")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.bis );

                    anim_atas.setImageResource(R.drawable.bis);
                    anim_bawah.setImageResource(R.drawable.bis);
                    anim_kiri.setImageResource(R.drawable.bis);
                    anim_kanan.setImageResource(R.drawable.bis);
                }

                if(data.equals("kapal")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kapal );

                    anim_atas.setImageResource(R.drawable.kapal);
                    anim_bawah.setImageResource(R.drawable.kapal);
                    anim_kiri.setImageResource(R.drawable.kapal);
                    anim_kanan.setImageResource(R.drawable.kapal);
                }

                if(data.equals("pesawat")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.pesawat );

                    anim_atas.setImageResource(R.drawable.pesawat);
                    anim_bawah.setImageResource(R.drawable.pesawat);
                    anim_kiri.setImageResource(R.drawable.pesawat);
                    anim_kanan.setImageResource(R.drawable.pesawat);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("radio")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.radio );

                    anim_atas.setImageResource(R.drawable.radio);
                    anim_bawah.setImageResource(R.drawable.radio);
                    anim_kiri.setImageResource(R.drawable.radio);
                    anim_kanan.setImageResource(R.drawable.radio);
                }

                if(data.equals("televisi")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.televisi );

                    anim_atas.setImageResource(R.drawable.televisi);
                    anim_bawah.setImageResource(R.drawable.televisi);
                    anim_kiri.setImageResource(R.drawable.televisi);
                    anim_kanan.setImageResource(R.drawable.televisi);
                }

                if(data.equals("handphone")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.handphone );

                    anim_atas.setImageResource(R.drawable.handphone);
                    anim_bawah.setImageResource(R.drawable.handphone);
                    anim_kiri.setImageResource(R.drawable.handphone);
                    anim_kanan.setImageResource(R.drawable.handphone);
                }

                if(data.equals("koran")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.koran );

                    anim_atas.setImageResource(R.drawable.koran);
                    anim_bawah.setImageResource(R.drawable.koran);
                    anim_kiri.setImageResource(R.drawable.koran);
                    anim_kanan.setImageResource(R.drawable.koran);
                }

                if(data.equals("komputer")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.komputer );

                    anim_atas.setImageResource(R.drawable.komputer);
                    anim_bawah.setImageResource(R.drawable.komputer);
                    anim_kiri.setImageResource(R.drawable.komputer);
                    anim_kanan.setImageResource(R.drawable.komputer);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("aceh")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.aceh );

                    anim_atas.setImageResource(R.drawable.aceh);
                    anim_bawah.setImageResource(R.drawable.aceh);
                    anim_kiri.setImageResource(R.drawable.aceh);
                    anim_kanan.setImageResource(R.drawable.aceh);
                }

                if(data.equals("jawa timur")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.jawa_timur );

                    anim_atas.setImageResource(R.drawable.jawa_timur);
                    anim_bawah.setImageResource(R.drawable.jawa_timur);
                    anim_kiri.setImageResource(R.drawable.jawa_timur);
                    anim_kanan.setImageResource(R.drawable.jawa_timur);
                }

                if(data.equals("bali")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.bali );

                    anim_atas.setImageResource(R.drawable.bali);
                    anim_bawah.setImageResource(R.drawable.bali);
                    anim_kiri.setImageResource(R.drawable.bali);
                    anim_kanan.setImageResource(R.drawable.bali);
                }

                if(data.equals("jawa tengah")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.jawa_tengah );

                    anim_atas.setImageResource(R.drawable.jawa_tengah);
                    anim_bawah.setImageResource(R.drawable.jawa_tengah);
                    anim_kiri.setImageResource(R.drawable.jawa_tengah);
                    anim_kanan.setImageResource(R.drawable.jawa_tengah);
                }

                if(data.equals("papua")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.papua );

                    anim_atas.setImageResource(R.drawable.papua);
                    anim_bawah.setImageResource(R.drawable.papua);
                    anim_kiri.setImageResource(R.drawable.papua);
                    anim_kanan.setImageResource(R.drawable.papua);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("honai")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.honai );

                    anim_atas.setImageResource(R.drawable.honai);
                    anim_bawah.setImageResource(R.drawable.honai);
                    anim_kiri.setImageResource(R.drawable.honai);
                    anim_kanan.setImageResource(R.drawable.honai);
                }

                if(data.equals("gadang")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.gadang );

                    anim_atas.setImageResource(R.drawable.gadang);
                    anim_bawah.setImageResource(R.drawable.gadang);
                    anim_kiri.setImageResource(R.drawable.gadang);
                    anim_kanan.setImageResource(R.drawable.gadang);
                }

                if(data.equals("badui")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.badui );

                    anim_atas.setImageResource(R.drawable.badui);
                    anim_bawah.setImageResource(R.drawable.badui);
                    anim_kiri.setImageResource(R.drawable.badui);
                    anim_kanan.setImageResource(R.drawable.badui);
                }

                if(data.equals("joglo")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.joglo );

                    anim_atas.setImageResource(R.drawable.joglo);
                    anim_bawah.setImageResource(R.drawable.joglo);
                    anim_kiri.setImageResource(R.drawable.joglo);
                    anim_kanan.setImageResource(R.drawable.joglo);
                }

                if(data.equals("mandar")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.mandar );

                    anim_atas.setImageResource(R.drawable.mandar);
                    anim_bawah.setImageResource(R.drawable.mandar);
                    anim_kiri.setImageResource(R.drawable.mandar);
                    anim_kanan.setImageResource(R.drawable.mandar);
                }

                //////////////////////////////////////////////////////////////////////

                if(data.equals("gamelan")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.angklung );

                    anim_atas.setImageResource(R.drawable.angklung);
                    anim_bawah.setImageResource(R.drawable.angklung);
                    anim_kiri.setImageResource(R.drawable.angklung);
                    anim_kanan.setImageResource(R.drawable.angklung);
                }

                if(data.equals("angklung")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.angklung_2 );

                    anim_atas.setImageResource(R.drawable.angklung_2);
                    anim_bawah.setImageResource(R.drawable.angklung_2);
                    anim_kiri.setImageResource(R.drawable.angklung_2);
                    anim_kanan.setImageResource(R.drawable.angklung_2);
                }

                if(data.equals("kecapi")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.kecapi );

                    anim_atas.setImageResource(R.drawable.kecapi);
                    anim_bawah.setImageResource(R.drawable.kecapi);
                    anim_kiri.setImageResource(R.drawable.kecapi);
                    anim_kanan.setImageResource(R.drawable.kecapi);
                }

                if(data.equals("sasando")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.sasando );

                    anim_atas.setImageResource(R.drawable.sasando);
                    anim_bawah.setImageResource(R.drawable.sasando);
                    anim_kiri.setImageResource(R.drawable.sasando);
                    anim_kanan.setImageResource(R.drawable.sasando);
                }

                if(data.equals("tifa")){
                    GifDrawable item = new GifDrawable( getResources(), R.drawable.tifa );

                    anim_atas.setImageResource(R.drawable.tifa);
                    anim_bawah.setImageResource(R.drawable.tifa);
                    anim_kiri.setImageResource(R.drawable.tifa);
                    anim_kanan.setImageResource(R.drawable.tifa);
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}