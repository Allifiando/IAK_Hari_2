package com.example.ando.cobaseh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final EditText number=(EditText)findViewById(R.id.nomor);
        Button dial=(Button)findViewById(R.id.btnCall);
        Button btnNext=(Button)findViewById(R.id.btnNext);

        //ketika menekan tombol panggil maka akan melakukan dial

        dial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //number = inputan dari editText
                String toDial=" "+number.getText().toString();

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));//memulai aplikasi dial
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(i);
            }
        });

    }
}



