package com.example.projectsispak.JenisPenyakit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.projectsispak.R;

import org.w3c.dom.Text;

public class detailPenyakitKucing extends AppCompatActivity {
    private static final String TAG = "Detail Penyakit Kucing";
    private TextView namaPenyakit1;

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
        namaPenyakit1 = findViewById(R.id.namaPenyakit);
        namaPenyakit1.setText(namaPenyakit);
    }

    private void setDeskripsiPenyakit(String deskripsiPenyakit){
        TextView deskripsiPenyakit1 = findViewById(R.id.deskripsiPenyakit);
//        deskripsiPenyakit1.setText(deskripsiPenyakit);
        if (namaPenyakit1.getText().equals("Scabies")){
            deskripsiPenyakit1.setText("Scabies atau kudis ini disebabkan oleh tungu kecil yang bernama notodes coti. Tungau ini mirip dengan tungau sarcoptic yang menyebabkan scabies");
        } else if (namaPenyakit1.getText().equals("Gastritis")){
            deskripsiPenyakit1.setText("Ini deskripsi gastritis");
        } else if (namaPenyakit1.getText().equals("Helminthiasis")){
            deskripsiPenyakit1.setText("helmiiiiiiinnnnnnnnnn");
        } else if (namaPenyakit1.getText().equals("Rhintis")){
            deskripsiPenyakit1.setText("rhintiiiiiiiiissssssssss");
        } else if (namaPenyakit1.getText().equals("Dermatitis")){
            deskripsiPenyakit1.setText("dermatitiiiiisssssssssssss");
        } else if (namaPenyakit1.getText().equals("Dermaphytosis")){
            deskripsiPenyakit1.setText("dermaphytttttttttttttttttttt");
        } else if (namaPenyakit1.getText().equals("Otitis")){
            deskripsiPenyakit1.setText("otitiiiiiiiiiiiiiisssssssss");
        } else if (namaPenyakit1.getText().equals("Entritis")){
            deskripsiPenyakit1.setText("entririiiiiiiiiiiiii");
        } else if (namaPenyakit1.getText().equals("Sehat")){
            deskripsiPenyakit1.setText("sehat coooooooyyyyyyyyy");
        }
    }

    private void setGejalaPenyakit(String gejalaPenyakit){
        TextView gejalapenyakit1 = findViewById(R.id.gejalaPenyakit);
//        gejalapenyakit1.setText(gejalaPenyakit);
        if (namaPenyakit1.getText().equals("Scabies")){
            gejalapenyakit1.setText("Scabies atau kudis ini disebabkan oleh tungu kecil yang bernama notodes coti. Tungau ini mirip dengan tungau sarcoptic yang menyebabkan scabies");
        } else if (namaPenyakit1.getText().equals("Gastritis")){
            gejalapenyakit1.setText("Ini deskripsi gastritis");
        } else if (namaPenyakit1.getText().equals("Helminthiasis")){
            gejalapenyakit1.setText("helmiiiiiiinnnnnnnnnn");
        } else if (namaPenyakit1.getText().equals("Rhintis")){
            gejalapenyakit1.setText("rhintiiiiiiiiissssssssss");
        } else if (namaPenyakit1.getText().equals("Dermatitis")){
            gejalapenyakit1.setText("dermatitiiiiisssssssssssss");
        } else if (namaPenyakit1.getText().equals("Dermaphytosis")){
            gejalapenyakit1.setText("dermaphytttttttttttttttttttt");
        } else if (namaPenyakit1.getText().equals("Otitis")){
            gejalapenyakit1.setText("otitiiiiiiiiiiiiiisssssssss");
        } else if (namaPenyakit1.getText().equals("Entritis")){
            gejalapenyakit1.setText("entririiiiiiiiiiiiii");
        } else if (namaPenyakit1.getText().equals("Sehat")){
            gejalapenyakit1.setText("sehat coooooooyyyyyyyyy");
        }
    }

    private void setPenyebabPenyakit(String penyebabPenyakit){
        TextView penyebabpenyakit1 = findViewById(R.id.penyebabPenyakit);
//        penyebabpenyakit1.setText(penyebabPenyakit);
        if (namaPenyakit1.getText().equals("Scabies")){
            penyebabpenyakit1.setText("Scabies atau kudis ini disebabkan oleh tungu kecil yang bernama notodes coti. Tungau ini mirip dengan tungau sarcoptic yang menyebabkan scabies");
        } else if (namaPenyakit1.getText().equals("Gastritis")){
            penyebabpenyakit1.setText("Ini deskripsi gastritis");
        } else if (namaPenyakit1.getText().equals("Helminthiasis")){
            penyebabpenyakit1.setText("helmiiiiiiinnnnnnnnnn");
        } else if (namaPenyakit1.getText().equals("Rhintis")){
            penyebabpenyakit1.setText("rhintiiiiiiiiissssssssss");
        } else if (namaPenyakit1.getText().equals("Dermatitis")){
            penyebabpenyakit1.setText("dermatitiiiiisssssssssssss");
        } else if (namaPenyakit1.getText().equals("Dermaphytosis")){
            penyebabpenyakit1.setText("dermaphytttttttttttttttttttt");
        } else if (namaPenyakit1.getText().equals("Otitis")){
            penyebabpenyakit1.setText("otitiiiiiiiiiiiiiisssssssss");
        } else if (namaPenyakit1.getText().equals("Entritis")){
            penyebabpenyakit1.setText("entririiiiiiiiiiiiii");
        } else if (namaPenyakit1.getText().equals("Sehat")){
            penyebabpenyakit1.setText("sehat coooooooyyyyyyyyy");
        }
    }


    private void setSolusiPenyakit(String solusiPenyakit){
        TextView solusipenyakit1 = findViewById(R.id.solusiPenyakit);
//        solusipenyakit1.setText(solusiPenyakit);
        if (namaPenyakit1.getText().equals("Scabies")){
            solusipenyakit1.setText("Scabies atau kudis ini disebabkan oleh tungu kecil yang bernama notodes coti. Tungau ini mirip dengan tungau sarcoptic yang menyebabkan scabies");
        } else if (namaPenyakit1.getText().equals("Gastritis")){
            solusipenyakit1.setText("Ini deskripsi gastritis");
        } else if (namaPenyakit1.getText().equals("Helminthiasis")){
            solusipenyakit1.setText("helmiiiiiiinnnnnnnnnn");
        } else if (namaPenyakit1.getText().equals("Rhintis")){
            solusipenyakit1.setText("rhintiiiiiiiiissssssssss");
        } else if (namaPenyakit1.getText().equals("Dermatitis")){
            solusipenyakit1.setText("dermatitiiiiisssssssssssss");
        } else if (namaPenyakit1.getText().equals("Dermaphytosis")){
            solusipenyakit1.setText("dermaphytttttttttttttttttttt");
        } else if (namaPenyakit1.getText().equals("Otitis")){
            solusipenyakit1.setText("otitiiiiiiiiiiiiiisssssssss");
        } else if (namaPenyakit1.getText().equals("Entritis")){
            solusipenyakit1.setText("entririiiiiiiiiiiiii");
        } else if (namaPenyakit1.getText().equals("Sehat")){
            solusipenyakit1.setText("sehat coooooooyyyyyyyyy");
        }
    }




}
