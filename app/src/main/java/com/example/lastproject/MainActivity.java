package com.example.lastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variable
    Button btnLogin;
    EditText edEmail, edPassword;
    String nama, password;

    public boolean validasi() {
        //Deklarasi String
        String id = "rio@gmail.com";
        String pw = "rio123";

        if (id.equals(edEmail.getText().toString()) && pw.equals(edPassword.getText().toString())){
            return  true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btLogin); //menghubungkan variable btnLogin dengan btLogin
        edEmail=findViewById(R.id.edemail); //menghubungkan variable edEmail dengan edemail
        edPassword=findViewById(R.id.edpassword); //menghubungkan variable edPassword dengan edpassword

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edEmail.getText().toString();
                password = edPassword.getText().toString();
                //Jika nama dan password sesuai maka menampilkan toast sukses
                if (nama.equals("rio@gmail.com") && password.equals("rio123")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Sukses" + "", Toast.LENGTH_LONG);
                    t.show();
                    Bundle b = new Bundle();
                    b.putString("parameter1",nama.trim());
                    b.putString("parameter2",password.trim());
                    Intent i = new Intent(getApplicationContext(), Halaman2.class); //jika paramenter1 dan parameter2 sesuai maka membuka halaman 2
                    i.putExtras(b);
                    startActivity(i);
                }
                //Jika nama berbeda dan password benar maka menampilkan toast email anda salah
                else if (nama!=("rio@gmail.com") && password.equals("rio123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email anda Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                //jika nama benar dan password berbeda maka menampilkan toast Password anda salah
                else  if (nama.equals("rio@gmail.com") && password!=("rio123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password anda Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                //menampilkan toast email atau password anda salah
                else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email atau Password anda Salah", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}