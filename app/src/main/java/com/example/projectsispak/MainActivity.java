package com.example.projectsispak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectsispak.IdentifikasiPenyakit.identifikasiPenyakit;
import com.example.projectsispak.JenisPenyakit.mainPenyakitKucing;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Button btnDokterdekat;
    Button btnIdentifikasisakit;
    Button btnJenispenyakit;
    Button btnPanduanaplikasi;
    Button btnTentangkami;
    Button btnAkun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDokterdekat = (Button) findViewById(R.id.RSterdekat);
        btnIdentifikasisakit = (Button) findViewById(R.id.identifikasiPenyakit);
        btnJenispenyakit = (Button) findViewById(R.id.jenisPenyakit);
        btnPanduanaplikasi = (Button) findViewById(R.id.panduanAplikasi);
        btnTentangkami = (Button) findViewById(R.id.tentangKami);
        btnAkun = (Button) findViewById(R.id.akun);
        models = new ArrayList<>();
        models.add(new Model(R.drawable.koceng,"Sampah A","Penumpukan sampah yang berserakan ini sangat tidak " +
                "enak dipandang dikarenakan kurangnya kesadaran dari masyrakat setempat membuat sampah tersebut menjadi menggunung"));
        models.add(new Model(R.drawable.koceng,"Sampah B","Penumpukan sampah yang berserakan ini sangat tidak " +
                "enak dipandang dikarenakan kurangnya kesadaran dari masyrakat setempat membuat sampah tersebut menjadi menggunung"));
        models.add(new Model(R.drawable.koceng,"Sampah C","Penumpukan sampah yang berserakan ini sangat tidak " +
                "enak dipandang dikarenakan kurangnya kesadaran dari masyrakat setempat membuat sampah tersebut menjadi menggunung"));
        models.add(new Model(R.drawable.koceng,"Sampah D","Penumpukan sampah yang berserakan ini sangat tidak " +
                "enak dipandang dikarenakan kurangnya kesadaran dari masyrakat setempat membuat sampah tersebut menjadi menggunung"));

        adapter = new Adapter(models,this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(300,0,130,0);
    }

    public void RSterdekat(View view) {
        Intent intent = new Intent(this, mainPenyakitKucing.class);
        startActivity(intent);
    }

    public void identifikasi_penyakit(View view) {
        Intent intent = new Intent(this, identifikasiPenyakit.class);
        startActivity(intent);
    }

    public void jenis_penyakit(View view) {
        Intent intent = new Intent(this, mainPenyakitKucing.class);
        startActivity(intent);

    }

    public void panduan_aplikasi(View view) {
    }

    public void tentang_kami(View view) {
    }

    public void akun(View view) {
    }
}
