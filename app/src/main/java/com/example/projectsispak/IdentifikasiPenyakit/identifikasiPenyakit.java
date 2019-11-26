package com.example.projectsispak.IdentifikasiPenyakit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projectsispak.R;

public class identifikasiPenyakit extends AppCompatActivity {

    CheckBox gej1, gej2, gej3, gej4, gej5, gej6, gej7, gej8, gej9, gej10,
            gej11, gej12, gej13, gej14, gej15, gej16, gej17, gej18, gej19,
            gej20, gej21, gej22, gej23, gej24, gej25, gej26, gej27, gej28,
            gej29, gej30, gej31, gej32;
    Button btnIdentifikasi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_identifikasipenyakit);
        gej1 = (CheckBox) findViewById(R.id.cb_pertama);
        gej2 = (CheckBox) findViewById(R.id.cb_kedua);
        gej3 = (CheckBox) findViewById(R.id.cb_ketiga);
        gej4 = (CheckBox) findViewById(R.id.cb_keempat);
        gej5 = (CheckBox) findViewById(R.id.cb_kelima);
        gej6 = (CheckBox) findViewById(R.id.cb_keenam);
        gej7 = (CheckBox) findViewById(R.id.cb_ketujuh);
        gej8 = (CheckBox) findViewById(R.id.cb_kedelapan);
        gej9 = (CheckBox) findViewById(R.id.cb_kesembilan);
        gej10 = (CheckBox) findViewById(R.id.cb_kesepuluh);
        gej11 = (CheckBox) findViewById(R.id.cb_kesebelas);
        gej12 = (CheckBox) findViewById(R.id.cb_keduabelas);
        gej13 = (CheckBox) findViewById(R.id.cb_ketigabelas);
        gej14 = (CheckBox) findViewById(R.id.cb_keempatbelas);
        gej15 = (CheckBox) findViewById(R.id.cb_kelimabelas);
        gej16 = (CheckBox) findViewById(R.id.cb_keenambelas);
        gej17 = (CheckBox) findViewById(R.id.cb_ketujuhbelas);
        gej18 = (CheckBox) findViewById(R.id.cb_kedelapanbelas);
        gej19 = (CheckBox) findViewById(R.id.cb_kesembilanbelas);
        gej20 = (CheckBox) findViewById(R.id.cb_keduapuluh);
        gej21 = (CheckBox) findViewById(R.id.cb_keduapuluhsatu);
        gej22 = (CheckBox) findViewById(R.id.cb_keduapuluhdua);
        gej23 = (CheckBox) findViewById(R.id.cb_keduapuluhtiga);
        gej24 = (CheckBox) findViewById(R.id.cb_keduapuluhempat);
        gej25 = (CheckBox) findViewById(R.id.cb_keduapuluhlima);
        gej26 = (CheckBox) findViewById(R.id.cb_keduapuluhenam);
        gej27 = (CheckBox) findViewById(R.id.cb_keduapuluhtujuh);
        gej28 = (CheckBox) findViewById(R.id.cb_keduapuluhdelapan);
        gej29 = (CheckBox) findViewById(R.id.cb_keduapuluhsembilan);
        gej30 = (CheckBox) findViewById(R.id.cb_tigapuluh);
        gej31 = (CheckBox) findViewById(R.id.cb_tugapuluhsatu);
        gej32 = (CheckBox) findViewById(R.id.cb_tigapuluhdua);
        btnIdentifikasi = (Button) findViewById(R.id.btnIdentifikasi);

        btnIdentifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double latihScabies [] ={6,7,20,8,5,3,7,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,1,0,0,3};
                double latihGastritis [] = {0,0,0,0,0,6,0,1,3,15,6,0,6,0,0,0,0,3,10,0,0,0,0,0,0,0,0,1,0,0,3};
                double latihHelmintiasis [] ={0,0,0,0,1,2,2,2,0,26,28,10,26,12,1,0,0,5,0,0,0,0,4,0,0,0,0,0,3,0,0,5};
                double latihRhintis [] = {0,0,0,0,1,0,0,0,0,0,0,0,2,0,7,6,3,0,3,1,0,0,0,0,0,0,0,0,0,0,0,1};
                double latihDermatophytosis [] = {0,6,7,1,2,0,9,1,0,0,0,0,0,0,0,0,0,0,0,0,6,2,1,0,0,0,0,0,0,0,0,2};
                double latihDermatitis [] = {0,0,7,1,2,1,10,0,0,0,0,0,0,0,0,0,0,0,0,0,2,6,5,6,0,0,0,0,0,0,0,4};
                double latihEnteritis [] = {0,0,1,0,0,0,1,4,0,9,3,0,13,0,0,0,0,3,0,1,0,0,0,0,0,0,0,25,6,7,5,3};
                double latihOtitis [] = {0,0,7,0,1,0,1,5,0,1,1,1,5,0,0,0,0,2,0,0,0,0,0,0,4,5,8,2,0,0,0,3};
                double latihSehat [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12};

                double totLatihpenyakit [] = {25, 15, 43, 9, 14, 15, 30,17 ,12 ,180};
                double totDataLatih [] = {180};

                double prior_scabies = totLatihpenyakit[0]/totDataLatih[0];
                double prior_gastritis = totLatihpenyakit[1]/totDataLatih[0];
                double prior_helmintiasis = totLatihpenyakit[2]/totDataLatih[0];
                double prior_rintis = totLatihpenyakit[3]/totDataLatih[0];
                double prior_dermatopitosis = totLatihpenyakit[4]/totDataLatih[0];
                double prior_dermatitis = totLatihpenyakit[5]/totDataLatih[0];
                double prior_enteritis = totLatihpenyakit[6]/totDataLatih[0];
                double prior_otitis = totLatihpenyakit[7]/totDataLatih[0];
                double prior_sehat = totLatihpenyakit[8]/totDataLatih[0];


                double scabies [] = {1,1,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1};
                double gastritis [] = {0,0,0,0,0,1,0,1,1,1,1,0,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,1};
                double helminthiasis [] = {0,0,0,0,1,1,1,1,0,1,1,1,1,1,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1};
                double rhintis [] = {0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1};
                double dermtopitosis [] = {0,1,1,1,1,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1};
                double dermatitis [] = {0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1};
                double enteritis [] = {0,0,1,0,0,0,1,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1};
                double otitis [] = {0,0,1,0,1,0,0,1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,0,1};
                double sehat [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};


                if(gej1.isChecked()){

                }
             }
        });


    }
}
