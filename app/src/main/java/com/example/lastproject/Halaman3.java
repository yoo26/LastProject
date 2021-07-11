package com.example.lastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Halaman3 extends AppCompatActivity {
    //Deklarasi Element
    TextInputLayout Name, Phone, Date;
    Button buttonBooking;

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);

        Name = findViewById(R.id.rName); //Menghubungkan textbox rName di String Name
        Phone = findViewById(R.id.rPhone); //Menghubungkan textbox rPhone di String Phone
        Date = findViewById(R.id.rDate); //Menghubungkan textbox rDate di String Date
        buttonBooking = findViewById(R.id.bNow); //Menghubungkan buttonBooking dengan bNow

        //Mengatur apa yang terjadi jika buttonBooking di tekan
        buttonBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Mendapatkan informasi dari FirebaseDatabase
                rootNode = FirebaseDatabase.getInstance();
                //Mengatur lokasi penyimpanan data di users
                reference = rootNode.getReference("users");

                String name = Name.getEditText().getText().toString(); //Mendapatkan data dari Nama untuk disimpan di database
                String telpon = Phone.getEditText().getText().toString(); //Mendapatkan data dari Phone untuk disimpan di database
                String tanggal = Date.getEditText().getText().toString(); //Mendapatkan data dari Date untuk disimpan di database

                UserHelper helperClass  = new UserHelper(name, telpon, tanggal); //Memanggil class UserHelper

                reference.child(telpon).setValue(helperClass); //menjadikan telpon sebagai variable prima
            }
        });
    }
}