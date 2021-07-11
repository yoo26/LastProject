package com.example.lastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;

public class Halaman2 extends AppCompatActivity {
    //Deklarasi Button
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        btn1 = (Button) findViewById(R.id.btnBooking);
        btn2 = (Button) findViewById(R.id.btnGallery);

        //Mengatur btn 1 jika di click menuju halaman3
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Halaman3.class);
                startActivity(i);
            }
        });

        //Mengatur btn2 jika di click menuju Halaman Gambar
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HalamanGambar.class);
                startActivity(i);
            }
        });
    }
}