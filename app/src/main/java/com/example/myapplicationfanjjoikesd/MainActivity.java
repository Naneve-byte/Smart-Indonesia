package com.example.myapplicationfanjjoikesd;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn_huruf;
    private Button btn_angka,btn_warna;
    private int waktu_loading=4000;
    Button tonton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_angka = (Button) findViewById(R.id.buttonAngka);
        btn_huruf = (Button) findViewById(R.id.buttonHuruf);
        btn_warna = (Button) findViewById(R.id.buttonwarna);
        tonton = (Button) findViewById(R.id.watch);
        tonton.setOnClickListener(this);
        btn_warna.setOnClickListener(this);
        btn_huruf.setOnClickListener(this);
        btn_angka.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonHuruf:
                Intent aa = new Intent(MainActivity.this, alphabet.class);
                startActivity(aa);
                break;
            case R.id.buttonAngka:
                Intent bb = new Intent(MainActivity.this, buah.class);
                startActivity(bb);
                break;
            case R.id.buttonwarna:
                startActivity(new Intent(MainActivity.this, Warna.class));
                break;
            case R.id.watch:
                startActivity(new Intent(MainActivity.this, menonton.class));
                break;
        }
    }
}