package com.example.utspraktik_if2_10118067_agusawaludin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
Tanggal Pengerjaan  : 5 Juni 2021
Nim                 : 10118067
Nama                : Agus Awaludin
Kelas               : IF-2

 */
public class CekData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_data);

        String nik = getIntent().getStringExtra(MainActivity.INPUT_NIK);
        String nama = getIntent().getStringExtra(MainActivity.INPUT_NAMA);
        String tgl = getIntent().getStringExtra(MainActivity.INPUT_TGL);

        String text = getString(R.string.nik).toString();
        String text1 = getString(R.string.nama).toString();
        String text2 = getString(R.string.tgl).toString();

        TextView textnik = (TextView)findViewById(R.id.textnik);
        TextView textnama = (TextView)findViewById(R.id.textnama);
        TextView texttgl = (TextView)findViewById(R.id.texttgl);

        textnik.setText(String.format(text, nik).toString());
        textnama.setText(String.format(text1, nama).toString());
        texttgl.setText(String.format(text2, tgl).toString());

    }

    public void pindah2(View view){
        Intent intent = new Intent(this, BerhasilSimpan.class);
        startActivity(intent);
    }

}