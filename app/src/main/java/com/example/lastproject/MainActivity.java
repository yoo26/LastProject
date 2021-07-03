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
    Button btnLogin;
    EditText edEmail, edPassword;
    String nama, password;

    public boolean validasi() {
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

        btnLogin=findViewById(R.id.btLogin);
        edEmail=findViewById(R.id.edemail);
        edPassword=findViewById(R.id.edpassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edEmail.getText().toString();
                password = edPassword.getText().toString();
                if (nama.equals("rio@gmail.com") && password.equals("rio123")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Sukses" + "", Toast.LENGTH_LONG);
                    t.show();
                    Bundle b = new Bundle();
                    b.putString("parameter1",nama.trim());
                    b.putString("parameter2",password.trim());
                    Intent i = new Intent(getApplicationContext(), Halaman2.class);
                    i.putExtras(b);
                    startActivity(i);
                }
                else if (nama!=("rio@gmail.com") && password.equals("rio123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email anda Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else  if (nama.equals("rio@gmail.com") && password!=("rio123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password anda Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email atau Password anda Salah", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}