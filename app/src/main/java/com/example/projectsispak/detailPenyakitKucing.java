package com.example.projectsispak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class detailPenyakitKucing extends AppCompatActivity {
    private static final String TAG = "Detail Penyakit Kucing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_penyakit_kucing);
        getIncomingContent();
    }

    private void getIncomingContent() {

        Log.d(TAG, "getIncomingContent: Checking for incoming intents");

        if(getIntent().hasExtra("image")){
            String namaPenyakit = getIntent().getStringExtra("namaPenyakit");
            String desPenyakit = getIntent().getStringExtra("desPenyakit");
            String gejPenyakit = getIntent().getStringExtra("gejPenyakit");
            String penyPenyakit = getIntent().getStringExtra("penyPenyakit");
            String solPenyakit = getIntent().getStringExtra("solPenyakit");

            setNamaPenyakit(namaPenyakit);
            setDeskripsiPenyakit(desPenyakit);
            setGejalaPenyakit(gejPenyakit);
            setPenyebabPenyakit(penyPenyakit);
            setSolusiPenyakit(solPenyakit);
        }
    }

    private void setNamaPenyakit(String namaPenyakit){
        TextView namaPenyakit1 = findViewById(R.id.namaPenyakit);
        namaPenyakit1.setText(namaPenyakit);
    }

    private void setDeskripsiPenyakit(String deskripsiPenyakit){
        TextView deskripsiPenyakit1 = findViewById(R.id.deskripsiPenyakit);
        deskripsiPenyakit1.setText(deskripsiPenyakit);
    }

    private void setGejalaPenyakit(String gejalaPenyakit){
        TextView gejalapenyakit1 = findViewById(R.id.gejalaPenyakit);
        gejalapenyakit1.setText(gejalaPenyakit);
    }

    private void setPenyebabPenyakit(String penyebabPenyakit){
        TextView penyebabpenyakit1 = findViewById(R.id.penyebabPenyakit);
        penyebabpenyakit1.setText(penyebabPenyakit);
    }

    private void setSolusiPenyakit(String solusiPenyakit){
        TextView solusipenyakit1 = findViewById(R.id.solusiPenyakit);
        solusipenyakit1.setText(solusiPenyakit);
    }



}
