package com.example.utspraktik_if2_10118067_agusawaludin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
/*
Tanggal Pengerjaan  : 5 Juni 2021
Nim                 : 10118067
Nama                : Agus Awaludin
Kelas               : IF-2

 */

public class BerhasilSimpan extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berhasil_simpan);
    }

    public void pindah3(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}