package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Hasil;
    EditText EditBil1, EditBil2;
    Button btnKali, btnBagi, btnTambah, btnKurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditBil1 = findViewById(R.id.EditBil1);
        EditBil2 = findViewById(R.id.EditBil2);
        Hasil = findViewById(R.id.hasil);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bil1 = Integer.parseInt(EditBil1.getText().toString());
                int bil2 = Integer.parseInt(EditBil2.getText().toString());
                int perkalian = bil1 * bil2;
                Hasil.setText("perkalian = "+perkalian);

            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bil1 = Integer.parseInt(EditBil1.getText().toString());
                int bil2 = Integer.parseInt(EditBil2.getText().toString());
                double pembagian = (double)(bil1) /(double)(bil2);
                Hasil.setText("pembagian = "+pembagian);

            }
        });
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bil1 = Integer.parseInt(EditBil1.getText().toString());
                int bil2 = Integer.parseInt(EditBil2.getText().toString());
                int tambah = bil1 + bil2;
                Hasil.setText("penjumlahan = "+tambah);

            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bil1 = Integer.parseInt(EditBil1.getText().toString());
                int bil2 = Integer.parseInt(EditBil2.getText().toString());
                int pengurangan = bil1 - bil2;
                Hasil.setText("pengurangan = "+pengurangan);

            }
        });
    }
}
