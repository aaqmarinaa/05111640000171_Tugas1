package com.example.tugas1ppbalmas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputPanjang, inputLebar;
    private Button btnHasil;
    private TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputPanjang = findViewById(R.id.inputPanjang);
        inputLebar = findViewById(R.id.inputLebar);
        btnHasil = findViewById(R.id.btnHasil);
        Hasil = findViewById(R.id.Hasil);

        getSupportActionBar().setTitle("Kalkulator Luas Persegi");

        btnHasil.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               String panjang, lebar;
               panjang = inputPanjang.getText().toString();
               lebar = inputLebar.getText().toString();

               if(TextUtils.isEmpty(panjang)){
                   inputPanjang.setError("Tolong diisi!");
                   inputPanjang.requestFocus();
               }else if(TextUtils.isEmpty(lebar)){
                   inputLebar.setError("Tolong diisi!");
                   inputLebar.requestFocus();
               }else{
                   double p = Double.parseDouble(panjang);
                   double l = Double.parseDouble(lebar);
                   double hasil = p*l;

                   Hasil.setText("Hasil = " + hasil);
               }
           }
        });
    }



}
