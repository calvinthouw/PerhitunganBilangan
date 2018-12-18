package com.example.acer.perhitunganbilangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class Main2Activity extends AppCompatActivity {
    private TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hasil = (TextView) findViewById(R.id.tv_hasil);

        Bundle bundle = getIntent().getExtras();
        hasil.setText(bundle.getString("hasil"));
    }
}
