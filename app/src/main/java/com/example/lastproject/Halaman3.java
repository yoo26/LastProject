package com.example.lastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Halaman3 extends AppCompatActivity {

    TextInputLayout Name, Phone, Date;
    Button buttonBooking;

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);

        Name = findViewById(R.id.rName);
        Phone = findViewById(R.id.rPhone);
        Date = findViewById(R.id.rDate);
        buttonBooking = findViewById(R.id.bNow);

        buttonBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");

                String name = Name.getEditText().getText().toString();
                String telpon = Phone.getEditText().getText().toString();
                String tanggal = Date.getEditText().getText().toString();

                UserHelper helperClass  = new UserHelper(name, telpon, tanggal);

                reference.child(telpon).setValue(helperClass);
            }
        });
    }
}