package com.example.win7.belajarbindoxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tentang extends AppCompatActivity {
    public TextView version;
    public TextView nomor;
    public TextView gmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        version = (TextView) findViewById(R.id.isiversi);
        nomor = (TextView) findViewById(R.id.nomor);
        gmail = (TextView)findViewById(R.id.gmail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        version.setText("Versi 1.0.3.0");
        nomor.setText(": 081511553314");
        gmail.setText(": Reza.okovian@gmail.com");
    }
}
