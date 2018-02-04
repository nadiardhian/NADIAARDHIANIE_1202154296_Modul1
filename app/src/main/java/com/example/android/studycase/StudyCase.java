package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class StudyCase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_case);

        Intent intent = getIntent();
        String tempat = intent.getStringExtra("tempatMakan");
        Intent intent2 = getIntent();
        String menu = intent2.getStringExtra("menu");
        Intent intent3 = getIntent();
        String porsi = intent3.getStringExtra("porsi");
        int totalPorsi = Integer.parseInt(porsi);
        Intent intent4 = getIntent();
        String uangOsas = intent4.getStringExtra("uangOsas");
        int uang = Integer.parseInt(uangOsas);

        if (tempat.contains("Eatbus"))

        {
            int harga = 50000;
            int totalHarga = harga * totalPorsi;

            if (uang >= totalHarga) {
                TextView textViewTempat = findViewById(R.id.textViewTempat);
                textViewTempat.setText(tempat);

                TextView textViewisiMenu = findViewById(R.id.textViewisiMenu);
                textViewisiMenu.setText(menu);

                TextView textViewjmlPorsi = findViewById(R.id.textViewjmlPorsi);
                textViewjmlPorsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView textViewjumlah = findViewById(R.id.textViewjumlah);
                textViewjumlah.setText(hasil);

                Toast.makeText(this, "Milea makan sama aku yuk", Toast.LENGTH_LONG).show();
            } else {
                TextView textViewTempat = findViewById(R.id.textViewTempat);
                textViewTempat.setText(tempat);

                TextView textViewisiMenu = findViewById(R.id.textViewisiMenu);
                textViewisiMenu.setText(menu);

                TextView textViewjmlPorsi = findViewById(R.id.textViewjmlPorsi);
                textViewjmlPorsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView textViewjumlah = findViewById(R.id.textViewjumlah);

                textViewjumlah.setText(hasil);

                Toast.makeText(this, "Uangmu tidak cukup, makan di tempat lain yaa", Toast.LENGTH_LONG).show();
            }

        } else {
            int harga = 30000;
            int totalHarga = harga * totalPorsi;
            if (uang >= totalHarga) {
                TextView textViewTempat = findViewById(R.id.textViewTempat);
                textViewTempat.setText(tempat);

                TextView textViewisiMenu = findViewById(R.id.textViewisiMenu);
                textViewisiMenu.setText(menu);

                TextView textViewjmlPorsi = findViewById(R.id.textViewjmlPorsi);
                textViewjmlPorsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView textViewjumlah = findViewById(R.id.textViewjumlah);
                textViewjumlah.setText(hasil);

                Toast.makeText(this, "Milea makan sama aku yuk", Toast.LENGTH_LONG).show();
            } else {
                TextView textViewTempat = findViewById(R.id.textViewTempat);
                textViewTempat.setText(tempat);

                TextView textViewisiMenu = findViewById(R.id.textViewisiMenu);
                textViewisiMenu.setText(menu);

                TextView textviewjmlPorsi = findViewById(R.id.textViewjmlPorsi);
                textviewjmlPorsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView textViewjumlah = findViewById(R.id.textViewjumlah);

                textViewjumlah.setText(hasil);

                Toast.makeText(this, "Uangmu tidak cukup, makan di tempat lain yaa", Toast.LENGTH_LONG).show();
            }

        }
    }
}


