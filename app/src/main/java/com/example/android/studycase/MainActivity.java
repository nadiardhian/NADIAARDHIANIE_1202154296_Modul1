package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import com.example.android.studycase.R;
import com.example.android.studycase.StudyCase;

public class MainActivity extends AppCompatActivity {
//    private static final String LOG_TAG = MainActivity.class.getSimpleName();
//
//    public static final String EXTRA_MESSAGE =
//            "com.example.android.StudyCase.extra.MESSAGE";

    private EditText mMenu;
    private EditText mPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMenu = (EditText) findViewById(R.id.menu);
        mPorsi = (EditText) findViewById(R.id.porsi);
    }

    public void mEatbus(View view) {
        Intent intent = new Intent(this, StudyCase.class);
        int uang = 65500;
        String uangOsas = String.valueOf(uang);
        intent.putExtra("uangOsas", uangOsas);

        String tempatMakan = "Eatbus";
        intent.putExtra("tempatMakan", tempatMakan);

        String menu = mMenu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = mPorsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }
    public void mAbnormal(View view) {
        Intent intent = new Intent(this, StudyCase.class);
        int uang = 65500;
        String uangOsas = String.valueOf(uang);
        intent.putExtra("uangOsas", uangOsas);

        String tempatMakan = "Abnormal";
        intent.putExtra("tempatMakan", tempatMakan);

        String menu = mMenu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = mPorsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }
}