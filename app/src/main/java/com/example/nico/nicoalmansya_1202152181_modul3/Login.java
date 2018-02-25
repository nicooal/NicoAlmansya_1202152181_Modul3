package com.example.nico.nicoalmansya_1202152181_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText user, pass; //membuat string

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.tUser);
        pass = (EditText) findViewById(R.id.tPass);
    }

    public void login(View view) { //Membuat method untuk button login jika diklik
        if (user.getText().toString().equals("EAD") && pass.getText().toString().equals("MOBILE")){ //Membuat user & password
            Toast.makeText(getApplicationContext(),"Login Berhasil", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"Username atau Password salah", Toast.LENGTH_SHORT).show();
        }
    }
}
