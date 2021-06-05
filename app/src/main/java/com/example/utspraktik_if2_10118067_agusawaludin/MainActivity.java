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
public class MainActivity extends AppCompatActivity {


    public static final String INPUT_NIK = "com.example.UTSPraktik-IF2-10118067-AGUSAWALUDIN.INPUT_NIK";
    public static final String INPUT_NAMA = "com.example.UTSPraktik-IF2-10118067-AGUSAWALUDIN.INPUT_NAMA";
    public static final String INPUT_TGL = "com.example.UTSPraktik-IF2-10118067-AGUSAWALUDIN.INPUT_TGL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah1(View view){
        EditText nik = (EditText) findViewById(R.id.nik);
        EditText nama = (EditText) findViewById(R.id.nama);
        EditText tgl = (EditText) findViewById(R.id.tgl);

        if (nik.length() < 3){
            Toast.makeText(this, "Nim harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }
        if (nama.length() < 3){
            Toast.makeText(this, "Nama harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }
        if (tgl.length() < 3){
            Toast.makeText(this, "Tanggal Lahir harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, CekData.class);
        intent.putExtra(INPUT_NIK, nik.getText().toString());
        intent.putExtra(INPUT_NAMA, nama.getText().toString());
        intent.putExtra(INPUT_TGL, tgl.getText().toString());
        startActivity(intent);
    }
}