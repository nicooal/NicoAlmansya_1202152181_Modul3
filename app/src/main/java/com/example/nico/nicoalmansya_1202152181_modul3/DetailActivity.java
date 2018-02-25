package com.example.nico.nicoalmansya_1202152181_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    TextView title, liter; //Membuat string
    ImageView photo,baterry;
    private int liters = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String Title = intent.getStringExtra("Title");
        Integer Background = intent.getIntExtra("Background",0);

        title = (TextView)findViewById(R.id.detailTitle);
        liter = (TextView)findViewById(R.id.Liter);
        photo = (ImageView)findViewById(R.id.detailPhoto);
        baterry = (ImageView)findViewById(R.id.baterry);

        title.setText(Title);
        Galon();
        photo.setImageResource(Background);
    }


    public void Galon(){ ////Membuat method gambar galon & text bertambah/berkurang
        if (liters <= 0 ){
            // 20%
            liter.setText("2L");
            baterry.setImageResource(R.drawable.ic_battery_1);
            Toast.makeText(this,"Air sedikit",Toast.LENGTH_SHORT).show();
        }else if (liters == 1){
            // 50%
            liter.setText("5L");
            baterry.setImageResource(R.drawable.ic_battery_2);
        }else if(liters == 2){
            // 80%
            liter.setText("8L");
            baterry.setImageResource(R.drawable.ic_battery_3);
        }else{
            // 100%
            liter.setText("10L");
            baterry.setImageResource(R.drawable.ic_battery_4);
            Toast.makeText(this,"Air penuh",Toast.LENGTH_SHORT).show();
        }
    }

    public void tambah(View view) { //Membuat Method jike Button + diklik
        liters++;
        Galon();
    }

    public void kurang(View view) { //Membuat Method jike Button - diklik
        liters--;
        Galon();
    }
}
