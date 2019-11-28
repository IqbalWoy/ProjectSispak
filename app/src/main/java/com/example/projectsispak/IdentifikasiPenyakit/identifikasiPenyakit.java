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

                double totLatihpenyakit [] = {25, 15, 43, 9, 14, 15, 30,17 ,12};
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


                double scabies [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                double gastritis [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                double helminthiasis [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                double rhintis [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                double dermtopitosis [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                double dermatitis [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                double enteritis [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                double otitis [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                double sehat [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};


                if(gej1.isChecked()){
                    scabies[0] = latihScabies[0]/totLatihpenyakit[0];
                    gastritis[0] = latihGastritis[0]/totLatihpenyakit[1];
                    helminthiasis[0] = latihHelmintiasis[0]/totLatihpenyakit[2];
                    rhintis[0] = latihRhintis[0]/totLatihpenyakit[3];
                    dermtopitosis[0] = latihDermatophytosis[0]/totLatihpenyakit[4];
                    dermatitis[0] = latihDermatitis[0]/totLatihpenyakit[5];
                    enteritis[0] = latihEnteritis[0]/totLatihpenyakit[6];
                    otitis[0] = latihOtitis[0]/totLatihpenyakit[7];
                    sehat[0] = latihSehat[0]/totLatihpenyakit[8];
                }else {
                    scabies[0] = gastritis[0] = helminthiasis[0] = rhintis[0] = dermtopitosis[0] =
                            dermatitis[0] = enteritis[0] = otitis[0] = sehat[0] = 1;
                }if(gej2.isChecked()){
                    scabies[1] = latihScabies[1]/totLatihpenyakit[0];
                    gastritis[1] = latihGastritis[1]/totLatihpenyakit[1];
                    helminthiasis[1] = latihHelmintiasis[1]/totLatihpenyakit[2];
                    rhintis[1] = latihRhintis[1]/totLatihpenyakit[3];
                    dermtopitosis[1] = latihDermatophytosis[1]/totLatihpenyakit[4];
                    dermatitis[1] = latihDermatitis[1]/totLatihpenyakit[5];
                    enteritis[1] = latihEnteritis[1]/totLatihpenyakit[6];
                    otitis[1] = latihOtitis[1]/totLatihpenyakit[7];
                    sehat[1] = latihSehat[1]/totLatihpenyakit[8];
                }else {
                    scabies[1] = gastritis[1] = helminthiasis[1] = rhintis[1] = dermtopitosis[1] =
                            dermatitis[1] = enteritis[1] = otitis[1] = sehat[1] = 1;
                }if(gej3.isChecked()){
                    scabies[2] = latihScabies[2]/totLatihpenyakit[0];
                    gastritis[2] = latihGastritis[2]/totLatihpenyakit[1];
                    helminthiasis[2] = latihHelmintiasis[2]/totLatihpenyakit[2];
                    rhintis[2] = latihRhintis[2]/totLatihpenyakit[3];
                    dermtopitosis[2] = latihDermatophytosis[2]/totLatihpenyakit[4];
                    dermatitis[2] = latihDermatitis[2]/totLatihpenyakit[5];
                    enteritis[2] = latihEnteritis[2]/totLatihpenyakit[6];
                    otitis[2] = latihOtitis[2]/totLatihpenyakit[7];
                    sehat[2] = latihSehat[2]/totLatihpenyakit[8];
                }else {
                    scabies[2] = gastritis[2] = helminthiasis[2] = rhintis[2] = dermtopitosis[2] =
                            dermatitis[2] = enteritis[2] = otitis[2] = sehat[2] = 1;
                }if(gej4.isChecked()){
                    scabies[3] = latihScabies[3]/totLatihpenyakit[0];
                    gastritis[3] = latihGastritis[3]/totLatihpenyakit[1];
                    helminthiasis[3] = latihHelmintiasis[3]/totLatihpenyakit[2];
                    rhintis[3] = latihRhintis[3]/totLatihpenyakit[3];
                    dermtopitosis[3] = latihDermatophytosis[3]/totLatihpenyakit[4];
                    dermatitis[3] = latihDermatitis[3]/totLatihpenyakit[5];
                    enteritis[3] = latihEnteritis[3]/totLatihpenyakit[6];
                    otitis[3] = latihOtitis[3]/totLatihpenyakit[7];
                    sehat[3] = latihSehat[3]/totLatihpenyakit[8];
                }else {
                    scabies[3] = gastritis[3] = helminthiasis[3] = rhintis[3] = dermtopitosis[3] =
                            dermatitis[3] = enteritis[3] = otitis[3] = sehat[3] = 1;
                }if(gej5.isChecked()){
                    scabies[4] = latihScabies[4]/totLatihpenyakit[0];
                    gastritis[4] = latihGastritis[4]/totLatihpenyakit[1];
                    helminthiasis[4] = latihHelmintiasis[4]/totLatihpenyakit[2];
                    rhintis[4] = latihRhintis[4]/totLatihpenyakit[3];
                    dermtopitosis[4] = latihDermatophytosis[4]/totLatihpenyakit[4];
                    dermatitis[4] = latihDermatitis[4]/totLatihpenyakit[5];
                    enteritis[4] = latihEnteritis[4]/totLatihpenyakit[6];
                    otitis[4] = latihOtitis[4]/totLatihpenyakit[7];
                    sehat[4] = latihSehat[4]/totLatihpenyakit[8];
                }else {
                    scabies[4] = gastritis[4] = helminthiasis[4] = rhintis[4] = dermtopitosis[4] =
                            dermatitis[4] = enteritis[4] = otitis[4] = sehat[4] = 1;
                }if(gej6.isChecked()){
                    scabies[5] = latihScabies[5]/totLatihpenyakit[0];
                    gastritis[5] = latihGastritis[5]/totLatihpenyakit[1];
                    helminthiasis[5] = latihHelmintiasis[5]/totLatihpenyakit[2];
                    rhintis[5] = latihRhintis[5]/totLatihpenyakit[3];
                    dermtopitosis[5] = latihDermatophytosis[5]/totLatihpenyakit[4];
                    dermatitis[5] = latihDermatitis[5]/totLatihpenyakit[5];
                    enteritis[5] = latihEnteritis[5]/totLatihpenyakit[6];
                    otitis[5] = latihOtitis[5]/totLatihpenyakit[7];
                    sehat[5] = latihSehat[5]/totLatihpenyakit[8];
                }else {
                    scabies[5] = gastritis[5] = helminthiasis[5] = rhintis[5] = dermtopitosis[5] =
                            dermatitis[5] = enteritis[5] = otitis[5] = sehat[5] = 1;
                }if(gej7.isChecked()){
                    scabies[6] = latihScabies[6]/totLatihpenyakit[0];
                    gastritis[6] = latihGastritis[6]/totLatihpenyakit[1];
                    helminthiasis[6] = latihHelmintiasis[6]/totLatihpenyakit[2];
                    rhintis[6] = latihRhintis[6]/totLatihpenyakit[3];
                    dermtopitosis[6] = latihDermatophytosis[6]/totLatihpenyakit[4];
                    dermatitis[6] = latihDermatitis[6]/totLatihpenyakit[5];
                    enteritis[6] = latihEnteritis[6]/totLatihpenyakit[6];
                    otitis[6] = latihOtitis[6]/totLatihpenyakit[7];
                    sehat[6] = latihSehat[6]/totLatihpenyakit[8];
                }else {
                    scabies[6] = gastritis[6] = helminthiasis[6] = rhintis[6] = dermtopitosis[6] =
                            dermatitis[6] = enteritis[6] = otitis[6] = sehat[6] = 1;
                }if(gej8.isChecked()){
                    scabies[7] = latihScabies[7]/totLatihpenyakit[0];
                    gastritis[7] = latihGastritis[7]/totLatihpenyakit[1];
                    helminthiasis[7] = latihHelmintiasis[7]/totLatihpenyakit[2];
                    rhintis[7] = latihRhintis[7]/totLatihpenyakit[3];
                    dermtopitosis[7] = latihDermatophytosis[7]/totLatihpenyakit[4];
                    dermatitis[7] = latihDermatitis[7]/totLatihpenyakit[5];
                    enteritis[7] = latihEnteritis[7]/totLatihpenyakit[6];
                    otitis[7] = latihOtitis[7]/totLatihpenyakit[7];
                    sehat[7] = latihSehat[7]/totLatihpenyakit[8];
                }else {
                    scabies[7] = gastritis[7] = helminthiasis[7] = rhintis[7] = dermtopitosis[7] =
                            dermatitis[7] = enteritis[7] = otitis[7] = sehat[7] = 1;
                }if(gej9.isChecked()){
                    scabies[8] = latihScabies[8]/totLatihpenyakit[0];
                    gastritis[8] = latihGastritis[8]/totLatihpenyakit[1];
                    helminthiasis[8] = latihHelmintiasis[8]/totLatihpenyakit[2];
                    rhintis[8] = latihRhintis[8]/totLatihpenyakit[3];
                    dermtopitosis[8] = latihDermatophytosis[8]/totLatihpenyakit[4];
                    dermatitis[8] = latihDermatitis[8]/totLatihpenyakit[5];
                    enteritis[8] = latihEnteritis[8]/totLatihpenyakit[6];
                    otitis[8] = latihOtitis[8]/totLatihpenyakit[7];
                    sehat[8] = latihSehat[8]/totLatihpenyakit[8];
                }else {
                    scabies[8] = gastritis[8] = helminthiasis[8] = rhintis[8] = dermtopitosis[8] =
                            dermatitis[8] = enteritis[8] = otitis[8] = sehat[8] = 1;
                }if(gej10.isChecked()){
                    scabies[9] = latihScabies[9]/totLatihpenyakit[0];
                    gastritis[9] = latihGastritis[9]/totLatihpenyakit[1];
                    helminthiasis[9] = latihHelmintiasis[9]/totLatihpenyakit[2];
                    rhintis[9] = latihRhintis[9]/totLatihpenyakit[3];
                    dermtopitosis[9] = latihDermatophytosis[9]/totLatihpenyakit[4];
                    dermatitis[9] = latihDermatitis[9]/totLatihpenyakit[5];
                    enteritis[9] = latihEnteritis[9]/totLatihpenyakit[6];
                    otitis[9] = latihOtitis[9]/totLatihpenyakit[7];
                    sehat[9] = latihSehat[9]/totLatihpenyakit[8];
                }else {
                    scabies[9] = gastritis[9] = helminthiasis[9] = rhintis[9] = dermtopitosis[9] =
                            dermatitis[9] = enteritis[9] = otitis[9] = sehat[9] = 1;
                }if(gej11.isChecked()){
                    scabies[10] = latihScabies[10]/totLatihpenyakit[0];
                    gastritis[10] = latihGastritis[10]/totLatihpenyakit[1];
                    helminthiasis[10] = latihHelmintiasis[10]/totLatihpenyakit[2];
                    rhintis[10] = latihRhintis[10]/totLatihpenyakit[3];
                    dermtopitosis[10] = latihDermatophytosis[10]/totLatihpenyakit[4];
                    dermatitis[10] = latihDermatitis[10]/totLatihpenyakit[5];
                    enteritis[10] = latihEnteritis[10]/totLatihpenyakit[6];
                    otitis[10] = latihOtitis[10]/totLatihpenyakit[7];
                    sehat[10] = latihSehat[10]/totLatihpenyakit[8];
                }else {
                    scabies[10] = gastritis[10] = helminthiasis[10] = rhintis[10] = dermtopitosis[10] =
                            dermatitis[10] = enteritis[10] = otitis[10] = sehat[10] = 1;
                }if(gej12.isChecked()){
                    scabies[11] = latihScabies[11]/totLatihpenyakit[0];
                    gastritis[11] = latihGastritis[11]/totLatihpenyakit[1];
                    helminthiasis[11] = latihHelmintiasis[11]/totLatihpenyakit[2];
                    rhintis[11] = latihRhintis[11]/totLatihpenyakit[3];
                    dermtopitosis[11] = latihDermatophytosis[11]/totLatihpenyakit[4];
                    dermatitis[11] = latihDermatitis[11]/totLatihpenyakit[5];
                    enteritis[11] = latihEnteritis[11]/totLatihpenyakit[6];
                    otitis[11] = latihOtitis[11]/totLatihpenyakit[7];
                    sehat[11] = latihSehat[11]/totLatihpenyakit[8];
                }else {
                    scabies[11] = gastritis[11] = helminthiasis[11] = rhintis[11] = dermtopitosis[11] =
                            dermatitis[11] = enteritis[11] = otitis[11] = sehat[11] = 1;
                }
             }
        });


    }
}
