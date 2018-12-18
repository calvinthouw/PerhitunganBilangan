package com.example.acer.perhitunganbilangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText bil1,bil2;
     Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bil1=(EditText) findViewById(R.id.edt_bil1);
        bil2=(EditText) findViewById(R.id.edt_bil2);
        hitung = (Button) findViewById(R.id.btn_pindah);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = bil1.getText().toString().trim();
                String angka2 = bil2.getText().toString().trim();
                int bil1 = Integer.parseInt(angka1);
                int bil2 = Integer.parseInt(angka2);
                int jumlah = bil1+bil2;
                Bundle bundle = new Bundle();
                bundle.putString("hasil",String.valueOf(jumlah));
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
