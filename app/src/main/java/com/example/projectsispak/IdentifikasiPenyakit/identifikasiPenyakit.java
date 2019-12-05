package com.example.projectsispak.IdentifikasiPenyakit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
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
                String Message;
                double latihScabies[] = {6, 7, 20, 8, 5, 3, 7, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, 0, 0, 3};
                double latihGastritis[] = {0, 0, 0, 0, 0, 6, 0, 1, 3, 15, 6, 0, 6, 0, 0, 0, 0, 3, 10, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 3};
                double latihHelmintiasis[] = {0, 0, 0, 0, 1, 2, 2, 2, 0, 26, 28, 10, 26, 12, 1, 0, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 3, 0, 0, 5};
                double latihRhintis[] = {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 6, 3, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
                double latihDermatophytosis[] = {0, 6, 7, 1, 2, 0, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2};
                double latihDermatitis[] = {0, 0, 7, 1, 2, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 6, 5, 6, 0, 0, 0, 0, 0, 0, 0, 4};
                double latihEnteritis[] = {0, 0, 1, 0, 0, 0, 1, 4, 0, 9, 3, 0, 13, 0, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 25, 6, 7, 5, 3};
                double latihOtitis[] = {0, 0, 7, 0, 1, 0, 1, 5, 0, 1, 1, 1, 5, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 4, 5, 8, 2, 0, 0, 0, 3};
                double latihSehat[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12};

                double totLatihpenyakit[] = {25, 15, 43, 9, 14, 15, 30, 17, 12};
                double totDataLatih[] = {180};

                double prior_scabies = totLatihpenyakit[0] / totDataLatih[0];
                double prior_gastritis = totLatihpenyakit[1] / totDataLatih[0];
                double prior_helmintiasis = totLatihpenyakit[2] / totDataLatih[0];
                double prior_rintis = totLatihpenyakit[3] / totDataLatih[0];
                double prior_dermatopitosis = totLatihpenyakit[4] / totDataLatih[0];
                double prior_dermatitis = totLatihpenyakit[5] / totDataLatih[0];
                double prior_enteritis = totLatihpenyakit[6] / totDataLatih[0];
                double prior_otitis = totLatihpenyakit[7] / totDataLatih[0];
                double prior_sehat = totLatihpenyakit[8] / totDataLatih[0];


                double scabies[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                double gastritis[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                double helminthiasis[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                double rhintis[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                double dermtopitosis[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                double dermatitis[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                double enteritis[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                double otitis[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                double sehat[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


                if (gej1.isChecked()) {
                    scabies[0] = latihScabies[0] / totLatihpenyakit[0];
                    gastritis[0] = latihGastritis[0] / totLatihpenyakit[1];
                    helminthiasis[0] = latihHelmintiasis[0] / totLatihpenyakit[2];
                    rhintis[0] = latihRhintis[0] / totLatihpenyakit[3];
                    dermtopitosis[0] = latihDermatophytosis[0] / totLatihpenyakit[4];
                    dermatitis[0] = latihDermatitis[0] / totLatihpenyakit[5];
                    enteritis[0] = latihEnteritis[0] / totLatihpenyakit[6];
                    otitis[0] = latihOtitis[0] / totLatihpenyakit[7];
                    sehat[0] = latihSehat[0] / totLatihpenyakit[8];
                } else {
                    scabies[0] = gastritis[0] = helminthiasis[0] = rhintis[0] = dermtopitosis[0] =
                            dermatitis[0] = enteritis[0] = otitis[0] = sehat[0] = 1;
                }
                if (gej2.isChecked()) {
                    scabies[1] = latihScabies[1] / totLatihpenyakit[0];
                    gastritis[1] = latihGastritis[1] / totLatihpenyakit[1];
                    helminthiasis[1] = latihHelmintiasis[1] / totLatihpenyakit[2];
                    rhintis[1] = latihRhintis[1] / totLatihpenyakit[3];
                    dermtopitosis[1] = latihDermatophytosis[1] / totLatihpenyakit[4];
                    dermatitis[1] = latihDermatitis[1] / totLatihpenyakit[5];
                    enteritis[1] = latihEnteritis[1] / totLatihpenyakit[6];
                    otitis[1] = latihOtitis[1] / totLatihpenyakit[7];
                    sehat[1] = latihSehat[1] / totLatihpenyakit[8];
                } else {
                    scabies[1] = gastritis[1] = helminthiasis[1] = rhintis[1] = dermtopitosis[1] =
                            dermatitis[1] = enteritis[1] = otitis[1] = sehat[1] = 1;
                }
                if (gej3.isChecked()) {
                    scabies[2] = latihScabies[2] / totLatihpenyakit[0];
                    gastritis[2] = latihGastritis[2] / totLatihpenyakit[1];
                    helminthiasis[2] = latihHelmintiasis[2] / totLatihpenyakit[2];
                    rhintis[2] = latihRhintis[2] / totLatihpenyakit[3];
                    dermtopitosis[2] = latihDermatophytosis[2] / totLatihpenyakit[4];
                    dermatitis[2] = latihDermatitis[2] / totLatihpenyakit[5];
                    enteritis[2] = latihEnteritis[2] / totLatihpenyakit[6];
                    otitis[2] = latihOtitis[2] / totLatihpenyakit[7];
                    sehat[2] = latihSehat[2] / totLatihpenyakit[8];
                } else {
                    scabies[2] = gastritis[2] = helminthiasis[2] = rhintis[2] = dermtopitosis[2] =
                            dermatitis[2] = enteritis[2] = otitis[2] = sehat[2] = 1;
                }
                if (gej4.isChecked()) {
                    scabies[3] = latihScabies[3] / totLatihpenyakit[0];
                    gastritis[3] = latihGastritis[3] / totLatihpenyakit[1];
                    helminthiasis[3] = latihHelmintiasis[3] / totLatihpenyakit[2];
                    rhintis[3] = latihRhintis[3] / totLatihpenyakit[3];
                    dermtopitosis[3] = latihDermatophytosis[3] / totLatihpenyakit[4];
                    dermatitis[3] = latihDermatitis[3] / totLatihpenyakit[5];
                    enteritis[3] = latihEnteritis[3] / totLatihpenyakit[6];
                    otitis[3] = latihOtitis[3] / totLatihpenyakit[7];
                    sehat[3] = latihSehat[3] / totLatihpenyakit[8];
                } else {
                    scabies[3] = gastritis[3] = helminthiasis[3] = rhintis[3] = dermtopitosis[3] =
                            dermatitis[3] = enteritis[3] = otitis[3] = sehat[3] = 1;
                }
                if (gej5.isChecked()) {
                    scabies[4] = latihScabies[4] / totLatihpenyakit[0];
                    gastritis[4] = latihGastritis[4] / totLatihpenyakit[1];
                    helminthiasis[4] = latihHelmintiasis[4] / totLatihpenyakit[2];
                    rhintis[4] = latihRhintis[4] / totLatihpenyakit[3];
                    dermtopitosis[4] = latihDermatophytosis[4] / totLatihpenyakit[4];
                    dermatitis[4] = latihDermatitis[4] / totLatihpenyakit[5];
                    enteritis[4] = latihEnteritis[4] / totLatihpenyakit[6];
                    otitis[4] = latihOtitis[4] / totLatihpenyakit[7];
                    sehat[4] = latihSehat[4] / totLatihpenyakit[8];
                } else {
                    scabies[4] = gastritis[4] = helminthiasis[4] = rhintis[4] = dermtopitosis[4] =
                            dermatitis[4] = enteritis[4] = otitis[4] = sehat[4] = 1;
                }
                if (gej6.isChecked()) {
                    scabies[5] = latihScabies[5] / totLatihpenyakit[0];
                    gastritis[5] = latihGastritis[5] / totLatihpenyakit[1];
                    helminthiasis[5] = latihHelmintiasis[5] / totLatihpenyakit[2];
                    rhintis[5] = latihRhintis[5] / totLatihpenyakit[3];
                    dermtopitosis[5] = latihDermatophytosis[5] / totLatihpenyakit[4];
                    dermatitis[5] = latihDermatitis[5] / totLatihpenyakit[5];
                    enteritis[5] = latihEnteritis[5] / totLatihpenyakit[6];
                    otitis[5] = latihOtitis[5] / totLatihpenyakit[7];
                    sehat[5] = latihSehat[5] / totLatihpenyakit[8];
                } else {
                    scabies[5] = gastritis[5] = helminthiasis[5] = rhintis[5] = dermtopitosis[5] =
                            dermatitis[5] = enteritis[5] = otitis[5] = sehat[5] = 1;
                }
                if (gej7.isChecked()) {
                    scabies[6] = latihScabies[6] / totLatihpenyakit[0];
                    gastritis[6] = latihGastritis[6] / totLatihpenyakit[1];
                    helminthiasis[6] = latihHelmintiasis[6] / totLatihpenyakit[2];
                    rhintis[6] = latihRhintis[6] / totLatihpenyakit[3];
                    dermtopitosis[6] = latihDermatophytosis[6] / totLatihpenyakit[4];
                    dermatitis[6] = latihDermatitis[6] / totLatihpenyakit[5];
                    enteritis[6] = latihEnteritis[6] / totLatihpenyakit[6];
                    otitis[6] = latihOtitis[6] / totLatihpenyakit[7];
                    sehat[6] = latihSehat[6] / totLatihpenyakit[8];
                } else {
                    scabies[6] = gastritis[6] = helminthiasis[6] = rhintis[6] = dermtopitosis[6] =
                            dermatitis[6] = enteritis[6] = otitis[6] = sehat[6] = 1;
                }
                if (gej8.isChecked()) {
                    scabies[7] = latihScabies[7] / totLatihpenyakit[0];
                    gastritis[7] = latihGastritis[7] / totLatihpenyakit[1];
                    helminthiasis[7] = latihHelmintiasis[7] / totLatihpenyakit[2];
                    rhintis[7] = latihRhintis[7] / totLatihpenyakit[3];
                    dermtopitosis[7] = latihDermatophytosis[7] / totLatihpenyakit[4];
                    dermatitis[7] = latihDermatitis[7] / totLatihpenyakit[5];
                    enteritis[7] = latihEnteritis[7] / totLatihpenyakit[6];
                    otitis[7] = latihOtitis[7] / totLatihpenyakit[7];
                    sehat[7] = latihSehat[7] / totLatihpenyakit[8];
                } else {
                    scabies[7] = gastritis[7] = helminthiasis[7] = rhintis[7] = dermtopitosis[7] =
                            dermatitis[7] = enteritis[7] = otitis[7] = sehat[7] = 1;
                }
                if (gej9.isChecked()) {
                    scabies[8] = latihScabies[8] / totLatihpenyakit[0];
                    gastritis[8] = latihGastritis[8] / totLatihpenyakit[1];
                    helminthiasis[8] = latihHelmintiasis[8] / totLatihpenyakit[2];
                    rhintis[8] = latihRhintis[8] / totLatihpenyakit[3];
                    dermtopitosis[8] = latihDermatophytosis[8] / totLatihpenyakit[4];
                    dermatitis[8] = latihDermatitis[8] / totLatihpenyakit[5];
                    enteritis[8] = latihEnteritis[8] / totLatihpenyakit[6];
                    otitis[8] = latihOtitis[8] / totLatihpenyakit[7];
                    sehat[8] = latihSehat[8] / totLatihpenyakit[8];
                } else {
                    scabies[8] = gastritis[8] = helminthiasis[8] = rhintis[8] = dermtopitosis[8] =
                            dermatitis[8] = enteritis[8] = otitis[8] = sehat[8] = 1;
                }
                if (gej10.isChecked()) {
                    scabies[9] = latihScabies[9] / totLatihpenyakit[0];
                    gastritis[9] = latihGastritis[9] / totLatihpenyakit[1];
                    helminthiasis[9] = latihHelmintiasis[9] / totLatihpenyakit[2];
                    rhintis[9] = latihRhintis[9] / totLatihpenyakit[3];
                    dermtopitosis[9] = latihDermatophytosis[9] / totLatihpenyakit[4];
                    dermatitis[9] = latihDermatitis[9] / totLatihpenyakit[5];
                    enteritis[9] = latihEnteritis[9] / totLatihpenyakit[6];
                    otitis[9] = latihOtitis[9] / totLatihpenyakit[7];
                    sehat[9] = latihSehat[9] / totLatihpenyakit[8];
                } else {
                    scabies[9] = gastritis[9] = helminthiasis[9] = rhintis[9] = dermtopitosis[9] =
                            dermatitis[9] = enteritis[9] = otitis[9] = sehat[9] = 1;
                }
                if (gej11.isChecked()) {
                    scabies[10] = latihScabies[10] / totLatihpenyakit[0];
                    gastritis[10] = latihGastritis[10] / totLatihpenyakit[1];
                    helminthiasis[10] = latihHelmintiasis[10] / totLatihpenyakit[2];
                    rhintis[10] = latihRhintis[10] / totLatihpenyakit[3];
                    dermtopitosis[10] = latihDermatophytosis[10] / totLatihpenyakit[4];
                    dermatitis[10] = latihDermatitis[10] / totLatihpenyakit[5];
                    enteritis[10] = latihEnteritis[10] / totLatihpenyakit[6];
                    otitis[10] = latihOtitis[10] / totLatihpenyakit[7];
                    sehat[10] = latihSehat[10] / totLatihpenyakit[8];
                } else {
                    scabies[10] = gastritis[10] = helminthiasis[10] = rhintis[10] = dermtopitosis[10] =
                            dermatitis[10] = enteritis[10] = otitis[10] = sehat[10] = 1;
                }
                if (gej12.isChecked()) {
                    scabies[11] = latihScabies[11] / totLatihpenyakit[0];
                    gastritis[11] = latihGastritis[11] / totLatihpenyakit[1];
                    helminthiasis[11] = latihHelmintiasis[11] / totLatihpenyakit[2];
                    rhintis[11] = latihRhintis[11] / totLatihpenyakit[3];
                    dermtopitosis[11] = latihDermatophytosis[11] / totLatihpenyakit[4];
                    dermatitis[11] = latihDermatitis[11] / totLatihpenyakit[5];
                    enteritis[11] = latihEnteritis[11] / totLatihpenyakit[6];
                    otitis[11] = latihOtitis[11] / totLatihpenyakit[7];
                    sehat[11] = latihSehat[11] / totLatihpenyakit[8];
                } else {
                    scabies[11] = gastritis[11] = helminthiasis[11] = rhintis[11] = dermtopitosis[11] =
                            dermatitis[11] = enteritis[11] = otitis[11] = sehat[11] = 1;
                }
                if (gej13.isChecked()) {
                    scabies[12] = latihScabies[12] / totLatihpenyakit[0];
                    gastritis[12] = latihGastritis[12] / totLatihpenyakit[1];
                    helminthiasis[12] = latihHelmintiasis[12] / totLatihpenyakit[2];
                    rhintis[12] = latihRhintis[12] / totLatihpenyakit[3];
                    dermtopitosis[12] = latihDermatophytosis[12] / totLatihpenyakit[4];
                    dermatitis[12] = latihDermatitis[12] / totLatihpenyakit[5];
                    enteritis[12] = latihEnteritis[12] / totLatihpenyakit[6];
                    otitis[12] = latihOtitis[12] / totLatihpenyakit[7];
                    sehat[12] = latihSehat[12] / totLatihpenyakit[8];
                } else {
                    scabies[12] = gastritis[12] = helminthiasis[12] = rhintis[12] = dermtopitosis[12] =
                            dermatitis[12] = enteritis[12] = otitis[12] = sehat[12] = 1;
                }
                if (gej14.isChecked()) {
                    scabies[13] = latihScabies[13] / totLatihpenyakit[0];
                    gastritis[13] = latihGastritis[13] / totLatihpenyakit[1];
                    helminthiasis[13] = latihHelmintiasis[13] / totLatihpenyakit[2];
                    rhintis[13] = latihRhintis[13] / totLatihpenyakit[3];
                    dermtopitosis[13] = latihDermatophytosis[13] / totLatihpenyakit[4];
                    dermatitis[13] = latihDermatitis[13] / totLatihpenyakit[5];
                    enteritis[13] = latihEnteritis[13] / totLatihpenyakit[6];
                    otitis[13] = latihOtitis[13] / totLatihpenyakit[7];
                    sehat[13] = latihSehat[13] / totLatihpenyakit[8];
                } else {
                    scabies[13] = gastritis[13] = helminthiasis[13] = rhintis[13] = dermtopitosis[13] =
                            dermatitis[13] = enteritis[13] = otitis[13] = sehat[13] = 1;
                }
                if (gej15.isChecked()) {
                    scabies[14] = latihScabies[14] / totLatihpenyakit[0];
                    gastritis[14] = latihGastritis[14] / totLatihpenyakit[1];
                    helminthiasis[14] = latihHelmintiasis[14] / totLatihpenyakit[2];
                    rhintis[14] = latihRhintis[14] / totLatihpenyakit[3];
                    dermtopitosis[14] = latihDermatophytosis[14] / totLatihpenyakit[4];
                    dermatitis[14] = latihDermatitis[14] / totLatihpenyakit[5];
                    enteritis[14] = latihEnteritis[14] / totLatihpenyakit[6];
                    otitis[14] = latihOtitis[14] / totLatihpenyakit[7];
                    sehat[14] = latihSehat[14] / totLatihpenyakit[8];
                } else {
                    scabies[14] = gastritis[14] = helminthiasis[14] = rhintis[14] = dermtopitosis[14] =
                            dermatitis[14] = enteritis[14] = otitis[14] = sehat[14] = 1;
                }
                if (gej16.isChecked()) {
                    scabies[15] = latihScabies[15] / totLatihpenyakit[0];
                    gastritis[15] = latihGastritis[15] / totLatihpenyakit[1];
                    helminthiasis[15] = latihHelmintiasis[15] / totLatihpenyakit[2];
                    rhintis[15] = latihRhintis[15] / totLatihpenyakit[3];
                    dermtopitosis[15] = latihDermatophytosis[15] / totLatihpenyakit[4];
                    dermatitis[15] = latihDermatitis[15] / totLatihpenyakit[5];
                    enteritis[15] = latihEnteritis[15] / totLatihpenyakit[6];
                    otitis[15] = latihOtitis[15] / totLatihpenyakit[7];
                    sehat[15] = latihSehat[15] / totLatihpenyakit[8];
                } else {
                    scabies[15] = gastritis[15] = helminthiasis[15] = rhintis[15] = dermtopitosis[15] =
                            dermatitis[15] = enteritis[15] = otitis[15] = sehat[15] = 1;
                }
                if (gej17.isChecked()) {
                    scabies[16] = latihScabies[16] / totLatihpenyakit[0];
                    gastritis[16] = latihGastritis[16] / totLatihpenyakit[1];
                    helminthiasis[16] = latihHelmintiasis[16] / totLatihpenyakit[2];
                    rhintis[16] = latihRhintis[16] / totLatihpenyakit[3];
                    dermtopitosis[16] = latihDermatophytosis[16] / totLatihpenyakit[4];
                    dermatitis[16] = latihDermatitis[16] / totLatihpenyakit[5];
                    enteritis[16] = latihEnteritis[16] / totLatihpenyakit[6];
                    otitis[16] = latihOtitis[16] / totLatihpenyakit[7];
                    sehat[16] = latihSehat[16] / totLatihpenyakit[8];
                } else {
                    scabies[16] = gastritis[16] = helminthiasis[16] = rhintis[16] = dermtopitosis[16] =
                            dermatitis[16] = enteritis[16] = otitis[16] = sehat[16] = 1;
                }
                if (gej18.isChecked()) {
                    scabies[17] = latihScabies[17] / totLatihpenyakit[0];
                    gastritis[17] = latihGastritis[17] / totLatihpenyakit[1];
                    helminthiasis[17] = latihHelmintiasis[17] / totLatihpenyakit[2];
                    rhintis[17] = latihRhintis[17] / totLatihpenyakit[3];
                    dermtopitosis[17] = latihDermatophytosis[17] / totLatihpenyakit[4];
                    dermatitis[17] = latihDermatitis[17] / totLatihpenyakit[5];
                    enteritis[17] = latihEnteritis[17] / totLatihpenyakit[6];
                    otitis[17] = latihOtitis[17] / totLatihpenyakit[7];
                    sehat[17] = latihSehat[17] / totLatihpenyakit[8];
                } else {
                    scabies[17] = gastritis[17] = helminthiasis[17] = rhintis[17] = dermtopitosis[17] =
                            dermatitis[17] = enteritis[17] = otitis[17] = sehat[17] = 1;
                }
                if (gej19.isChecked()) {
                    scabies[18] = latihScabies[18] / totLatihpenyakit[0];
                    gastritis[18] = latihGastritis[18] / totLatihpenyakit[1];
                    helminthiasis[18] = latihHelmintiasis[18] / totLatihpenyakit[2];
                    rhintis[18] = latihRhintis[18] / totLatihpenyakit[3];
                    dermtopitosis[18] = latihDermatophytosis[18] / totLatihpenyakit[4];
                    dermatitis[18] = latihDermatitis[18] / totLatihpenyakit[5];
                    enteritis[18] = latihEnteritis[18] / totLatihpenyakit[6];
                    otitis[18] = latihOtitis[18] / totLatihpenyakit[7];
                    sehat[18] = latihSehat[18] / totLatihpenyakit[8];
                } else {
                    scabies[18] = gastritis[18] = helminthiasis[18] = rhintis[18] = dermtopitosis[18] =
                            dermatitis[18] = enteritis[18] = otitis[18] = sehat[18] = 1;
                }
                if (gej20.isChecked()) {
                    scabies[19] = latihScabies[19] / totLatihpenyakit[0];
                    gastritis[19] = latihGastritis[19] / totLatihpenyakit[1];
                    helminthiasis[19] = latihHelmintiasis[19] / totLatihpenyakit[2];
                    rhintis[19] = latihRhintis[19] / totLatihpenyakit[3];
                    dermtopitosis[19] = latihDermatophytosis[19] / totLatihpenyakit[4];
                    dermatitis[19] = latihDermatitis[19] / totLatihpenyakit[5];
                    enteritis[19] = latihEnteritis[19] / totLatihpenyakit[6];
                    otitis[19] = latihOtitis[19] / totLatihpenyakit[7];
                    sehat[19] = latihSehat[19] / totLatihpenyakit[8];
                } else {
                    scabies[19] = gastritis[19] = helminthiasis[19] = rhintis[19] = dermtopitosis[19] =
                            dermatitis[19] = enteritis[19] = otitis[19] = sehat[19] = 1;
                }
                if (gej21.isChecked()) {
                    scabies[20] = latihScabies[20] / totLatihpenyakit[0];
                    gastritis[20] = latihGastritis[20] / totLatihpenyakit[1];
                    helminthiasis[20] = latihHelmintiasis[20] / totLatihpenyakit[2];
                    rhintis[20] = latihRhintis[20] / totLatihpenyakit[3];
                    dermtopitosis[20] = latihDermatophytosis[20] / totLatihpenyakit[4];
                    dermatitis[20] = latihDermatitis[20] / totLatihpenyakit[5];
                    enteritis[20] = latihEnteritis[20] / totLatihpenyakit[6];
                    otitis[20] = latihOtitis[20] / totLatihpenyakit[7];
                    sehat[20] = latihSehat[20] / totLatihpenyakit[8];
                } else {
                    scabies[20] = gastritis[20] = helminthiasis[20] = rhintis[20] = dermtopitosis[20] =
                            dermatitis[20] = enteritis[20] = otitis[20] = sehat[20] = 1;
                }
                if (gej22.isChecked()) {
                    scabies[21] = latihScabies[21] / totLatihpenyakit[0];
                    gastritis[21] = latihGastritis[21] / totLatihpenyakit[1];
                    helminthiasis[21] = latihHelmintiasis[21] / totLatihpenyakit[2];
                    rhintis[21] = latihRhintis[21] / totLatihpenyakit[3];
                    dermtopitosis[21] = latihDermatophytosis[21] / totLatihpenyakit[4];
                    dermatitis[21] = latihDermatitis[21] / totLatihpenyakit[5];
                    enteritis[21] = latihEnteritis[21] / totLatihpenyakit[6];
                    otitis[21] = latihOtitis[21] / totLatihpenyakit[7];
                    sehat[21] = latihSehat[21] / totLatihpenyakit[8];
                } else {
                    scabies[21] = gastritis[21] = helminthiasis[21] = rhintis[21] = dermtopitosis[21] =
                            dermatitis[21] = enteritis[21] = otitis[21] = sehat[21] = 1;
                }
                if (gej23.isChecked()) {
                    scabies[22] = latihScabies[22] / totLatihpenyakit[0];
                    gastritis[22] = latihGastritis[22] / totLatihpenyakit[1];
                    helminthiasis[22] = latihHelmintiasis[22] / totLatihpenyakit[2];
                    rhintis[22] = latihRhintis[22] / totLatihpenyakit[3];
                    dermtopitosis[22] = latihDermatophytosis[22] / totLatihpenyakit[4];
                    dermatitis[22] = latihDermatitis[22] / totLatihpenyakit[5];
                    enteritis[22] = latihEnteritis[22] / totLatihpenyakit[6];
                    otitis[22] = latihOtitis[22] / totLatihpenyakit[7];
                    sehat[22] = latihSehat[22] / totLatihpenyakit[8];
                } else {
                    scabies[22] = gastritis[22] = helminthiasis[22] = rhintis[22] = dermtopitosis[22] =
                            dermatitis[22] = enteritis[22] = otitis[22] = sehat[22] = 1;
                }
                if (gej24.isChecked()) {
                    scabies[23] = latihScabies[23] / totLatihpenyakit[0];
                    gastritis[23] = latihGastritis[23] / totLatihpenyakit[1];
                    helminthiasis[23] = latihHelmintiasis[23] / totLatihpenyakit[2];
                    rhintis[23] = latihRhintis[23] / totLatihpenyakit[3];
                    dermtopitosis[23] = latihDermatophytosis[23] / totLatihpenyakit[4];
                    dermatitis[23] = latihDermatitis[23] / totLatihpenyakit[5];
                    enteritis[23] = latihEnteritis[23] / totLatihpenyakit[6];
                    otitis[23] = latihOtitis[23] / totLatihpenyakit[7];
                    sehat[23] = latihSehat[23] / totLatihpenyakit[8];
                } else {
                    scabies[23] = gastritis[23] = helminthiasis[23] = rhintis[23] = dermtopitosis[23] =
                            dermatitis[23] = enteritis[23] = otitis[23] = sehat[23] = 1;
                }
                if (gej25.isChecked()) {
                    scabies[24] = latihScabies[24] / totLatihpenyakit[0];
                    gastritis[24] = latihGastritis[24] / totLatihpenyakit[1];
                    helminthiasis[24] = latihHelmintiasis[24] / totLatihpenyakit[2];
                    rhintis[24] = latihRhintis[24] / totLatihpenyakit[3];
                    dermtopitosis[24] = latihDermatophytosis[24] / totLatihpenyakit[4];
                    dermatitis[24] = latihDermatitis[24] / totLatihpenyakit[5];
                    enteritis[24] = latihEnteritis[24] / totLatihpenyakit[6];
                    otitis[24] = latihOtitis[24] / totLatihpenyakit[7];
                    sehat[24] = latihSehat[24] / totLatihpenyakit[8];
                } else {
                    scabies[24] = gastritis[24] = helminthiasis[24] = rhintis[24] = dermtopitosis[24] =
                            dermatitis[24] = enteritis[24] = otitis[24] = sehat[24] = 1;
                }
                if (gej26.isChecked()) {
                    scabies[25] = latihScabies[25] / totLatihpenyakit[0];
                    gastritis[25] = latihGastritis[25] / totLatihpenyakit[1];
                    helminthiasis[25] = latihHelmintiasis[25] / totLatihpenyakit[2];
                    rhintis[25] = latihRhintis[25] / totLatihpenyakit[3];
                    dermtopitosis[25] = latihDermatophytosis[25] / totLatihpenyakit[4];
                    dermatitis[25] = latihDermatitis[25] / totLatihpenyakit[5];
                    enteritis[25] = latihEnteritis[25] / totLatihpenyakit[6];
                    otitis[25] = latihOtitis[25] / totLatihpenyakit[7];
                    sehat[25] = latihSehat[25] / totLatihpenyakit[8];
                } else {
                    scabies[25] = gastritis[25] = helminthiasis[25] = rhintis[25] = dermtopitosis[25] =
                            dermatitis[25] = enteritis[25] = otitis[25] = sehat[25] = 1;
                }
                if (gej27.isChecked()) {
                    scabies[26] = latihScabies[26] / totLatihpenyakit[0];
                    gastritis[26] = latihGastritis[26] / totLatihpenyakit[1];
                    helminthiasis[26] = latihHelmintiasis[26] / totLatihpenyakit[2];
                    rhintis[26] = latihRhintis[26] / totLatihpenyakit[3];
                    dermtopitosis[26] = latihDermatophytosis[26] / totLatihpenyakit[4];
                    dermatitis[26] = latihDermatitis[26] / totLatihpenyakit[5];
                    enteritis[26] = latihEnteritis[26] / totLatihpenyakit[6];
                    otitis[26] = latihOtitis[26] / totLatihpenyakit[7];
                    sehat[26] = latihSehat[26] / totLatihpenyakit[8];
                } else {
                    scabies[26] = gastritis[26] = helminthiasis[26] = rhintis[26] = dermtopitosis[26] =
                            dermatitis[26] = enteritis[26] = otitis[26] = sehat[26] = 1;
                }
                if (gej28.isChecked()) {
                    scabies[27] = latihScabies[27] / totLatihpenyakit[0];
                    gastritis[27] = latihGastritis[27] / totLatihpenyakit[1];
                    helminthiasis[27] = latihHelmintiasis[27] / totLatihpenyakit[2];
                    rhintis[27] = latihRhintis[27] / totLatihpenyakit[3];
                    dermtopitosis[27] = latihDermatophytosis[27] / totLatihpenyakit[4];
                    dermatitis[27] = latihDermatitis[27] / totLatihpenyakit[5];
                    enteritis[27] = latihEnteritis[27] / totLatihpenyakit[6];
                    otitis[27] = latihOtitis[27] / totLatihpenyakit[7];
                    sehat[27] = latihSehat[27] / totLatihpenyakit[8];
                } else {
                    scabies[27] = gastritis[27] = helminthiasis[27] = rhintis[27] = dermtopitosis[27] =
                            dermatitis[27] = enteritis[27] = otitis[27] = sehat[27] = 1;
                }
                if (gej29.isChecked()) {
                    scabies[28] = latihScabies[28] / totLatihpenyakit[0];
                    gastritis[28] = latihGastritis[28] / totLatihpenyakit[1];
                    helminthiasis[28] = latihHelmintiasis[28] / totLatihpenyakit[2];
                    rhintis[28] = latihRhintis[28] / totLatihpenyakit[3];
                    dermtopitosis[28] = latihDermatophytosis[28] / totLatihpenyakit[4];
                    dermatitis[28] = latihDermatitis[28] / totLatihpenyakit[5];
                    enteritis[28] = latihEnteritis[28] / totLatihpenyakit[6];
                    otitis[28] = latihOtitis[28] / totLatihpenyakit[7];
                    sehat[28] = latihSehat[28] / totLatihpenyakit[8];
                } else {
                    scabies[28] = gastritis[28] = helminthiasis[28] = rhintis[28] = dermtopitosis[28] =
                            dermatitis[28] = enteritis[28] = otitis[28] = sehat[28] = 1;
                }
                if (gej30.isChecked()) {
                    scabies[29] = latihScabies[29] / totLatihpenyakit[0];
                    gastritis[29] = latihGastritis[29] / totLatihpenyakit[1];
                    helminthiasis[29] = latihHelmintiasis[29] / totLatihpenyakit[2];
                    rhintis[29] = latihRhintis[29] / totLatihpenyakit[3];
                    dermtopitosis[29] = latihDermatophytosis[29] / totLatihpenyakit[4];
                    dermatitis[29] = latihDermatitis[29] / totLatihpenyakit[5];
                    enteritis[29] = latihEnteritis[29] / totLatihpenyakit[6];
                    otitis[29] = latihOtitis[29] / totLatihpenyakit[7];
                    sehat[29] = latihSehat[29] / totLatihpenyakit[8];
                } else {
                    scabies[29] = gastritis[29] = helminthiasis[29] = rhintis[29] = dermtopitosis[29] =
                            dermatitis[29] = enteritis[29] = otitis[29] = sehat[29] = 1;
                }
                if (gej31.isChecked()) {
                    scabies[30] = latihScabies[30] / totLatihpenyakit[0];
                    gastritis[30] = latihGastritis[30] / totLatihpenyakit[1];
                    helminthiasis[30] = latihHelmintiasis[30] / totLatihpenyakit[2];
                    rhintis[30] = latihRhintis[30] / totLatihpenyakit[3];
                    dermtopitosis[30] = latihDermatophytosis[30] / totLatihpenyakit[4];
                    dermatitis[30] = latihDermatitis[30] / totLatihpenyakit[5];
                    enteritis[30] = latihEnteritis[30] / totLatihpenyakit[6];
                    otitis[30] = latihOtitis[30] / totLatihpenyakit[7];
                    sehat[30] = latihSehat[30] / totLatihpenyakit[8];
                } else {
                    scabies[30] = gastritis[30] = helminthiasis[30] = rhintis[30] = dermtopitosis[30] =
                            dermatitis[30] = enteritis[30] = otitis[30] = sehat[30] = 1;
                }
                if (gej32.isChecked()) {
                    scabies[31] = latihScabies[31] / totLatihpenyakit[0];
                    gastritis[31] = latihGastritis[31] / totLatihpenyakit[1];
                    helminthiasis[31] = latihHelmintiasis[31] / totLatihpenyakit[2];
                    rhintis[31] = latihRhintis[31] / totLatihpenyakit[3];
                    dermtopitosis[31] = latihDermatophytosis[31] / totLatihpenyakit[4];
                    dermatitis[31] = latihDermatitis[31] / totLatihpenyakit[5];
                    enteritis[31] = latihEnteritis[31] / totLatihpenyakit[6];
                    otitis[31] = latihOtitis[31] / totLatihpenyakit[7];
                    sehat[31] = latihSehat[31] / totLatihpenyakit[8];
                } else {
                    scabies[31] = gastritis[31] = helminthiasis[31] = rhintis[31] = dermtopitosis[31] =
                            dermatitis[31] = enteritis[31] = otitis[31] = sehat[31] = 1;
                }

                double likelihood_scabies = 1;
                double likelihood_gastritis = 1;
                double likelihood_helminthiasis = 1;
                double likelihood_rhintis = 1;
                double likelihood_dermatopitosis = 1;
                double likelihood_dermatitis = 1;
                double likelihood_enteritis = 1;
                double likelihood_otitis = 1;
                double likelihood_sehat = 1;

                for (int i = 0; i < 32; i++) {
                    likelihood_scabies *= scabies[1];
                    likelihood_gastritis *= gastritis[1];
                    likelihood_helminthiasis *= helminthiasis[1];
                    likelihood_rhintis *= rhintis[1];
                    likelihood_dermatopitosis *= dermtopitosis[1];
                    likelihood_dermatitis *= dermatitis[1];
                    likelihood_enteritis *= enteritis[1];
                    likelihood_otitis *= otitis[1];
                    likelihood_sehat *= sehat[1];
                }

                double posterior_scabis = prior_scabies * likelihood_scabies;
                double posterior_gastritis = prior_gastritis * likelihood_gastritis;
                double posterior_helmintiasis = prior_helmintiasis * likelihood_helminthiasis;
                double posterior_rhintis = prior_rintis * likelihood_rhintis;
                double posterior_dermatopitosis = prior_dermatopitosis * likelihood_dermatopitosis;
                double posterior_dermatitis = prior_dermatitis * likelihood_dermatitis;
                double posterior_enteritis = prior_enteritis * likelihood_enteritis;
                double posterior_otitis = prior_otitis * likelihood_otitis;
                double posterior_sehat = prior_sehat * likelihood_sehat;

                if (posterior_scabis > posterior_gastritis
                        && posterior_scabis > posterior_helmintiasis
                        && posterior_scabis > posterior_rhintis
                        && posterior_scabis > posterior_dermatitis
                        && posterior_scabis > posterior_dermatopitosis
                        && posterior_scabis > posterior_enteritis
                        && posterior_scabis > posterior_otitis
                        && posterior_scabis > posterior_sehat) {
                    Message = "Kucing Anda Didiagnosis Mengidap Penyakit Scabies";
                    showMessage(Message);
                } else if (posterior_gastritis > posterior_scabis
                        && posterior_gastritis > posterior_helmintiasis
                        && posterior_gastritis > posterior_rhintis
                        && posterior_gastritis > posterior_dermatitis
                        && posterior_gastritis > posterior_dermatopitosis
                        && posterior_gastritis > posterior_enteritis
                        && posterior_gastritis > posterior_otitis
                        && posterior_gastritis > posterior_sehat) {
                    Message = "Kucing Anda Didiagnosis Mengidap Penyakit Gastritis";
                    showMessage(Message);
                } else if (posterior_helmintiasis > posterior_scabis
                        && posterior_helmintiasis > posterior_gastritis
                        && posterior_helmintiasis > posterior_rhintis
                        && posterior_helmintiasis > posterior_dermatitis
                        && posterior_helmintiasis > posterior_dermatopitosis
                        && posterior_helmintiasis > posterior_enteritis
                        && posterior_helmintiasis > posterior_otitis
                        && posterior_helmintiasis > posterior_sehat) {
                    Message = "Kucing Anda Didiagnosis Mengidap Penyakit Helmintiasis";
                    showMessage(Message);
                } else if (posterior_rhintis > posterior_scabis
                        && posterior_rhintis > posterior_gastritis
                        && posterior_rhintis > posterior_helmintiasis
                        && posterior_rhintis > posterior_dermatitis
                        && posterior_rhintis > posterior_dermatopitosis
                        && posterior_rhintis > posterior_enteritis
                        && posterior_rhintis > posterior_otitis
                        && posterior_rhintis > posterior_sehat) {
                    Message = "Kucing Anda Didiagnosis Mengidap Penyakit Rhintis";
                    showMessage(Message);
                }else if (posterior_dermatitis > posterior_scabis
                        && posterior_dermatitis > posterior_gastritis
                        && posterior_dermatitis > posterior_helmintiasis
                        && posterior_dermatitis > posterior_rhintis
                        && posterior_dermatitis > posterior_dermatopitosis
                        && posterior_dermatitis > posterior_enteritis
                        && posterior_dermatitis > posterior_otitis
                        && posterior_dermatitis > posterior_sehat) {
                    Message = "Kucing Anda Didiagnosis Mengidap Penyakit Dermatitis";
                    showMessage(Message);
                }else if (posterior_dermatopitosis > posterior_scabis
                        && posterior_dermatopitosis > posterior_gastritis
                        && posterior_dermatopitosis > posterior_helmintiasis
                        && posterior_dermatopitosis > posterior_rhintis
                        && posterior_dermatopitosis > posterior_dermatitis
                        && posterior_dermatopitosis > posterior_enteritis
                        && posterior_dermatopitosis > posterior_otitis
                        && posterior_dermatopitosis > posterior_sehat) {
                    Message = "Kucing Anda Didiagnosis Mengidap Penyakit Dermatopitosis";
                    showMessage(Message);
                }else if (posterior_enteritis > posterior_scabis
                        && posterior_enteritis > posterior_gastritis
                        && posterior_enteritis > posterior_helmintiasis
                        && posterior_enteritis > posterior_rhintis
                        && posterior_enteritis > posterior_dermatitis
                        && posterior_enteritis > posterior_dermatopitosis
                        && posterior_enteritis > posterior_otitis
                        && posterior_enteritis > posterior_sehat) {
                    Message = "Kucing Anda Didiagnosis Mengidap Penyakit Enteritis";
                    showMessage(Message);
                }else if (posterior_otitis > posterior_scabis
                        && posterior_otitis > posterior_gastritis
                        && posterior_otitis > posterior_helmintiasis
                        && posterior_otitis > posterior_rhintis
                        && posterior_otitis > posterior_dermatitis
                        && posterior_otitis > posterior_dermatopitosis
                        && posterior_otitis > posterior_enteritis
                        && posterior_otitis > posterior_sehat) {
                    Message = "Kucing Anda Didiagnosis Mengidap Penyakit Otitis";
                    showMessage(Message);
                }else if (posterior_sehat > posterior_scabis
                        && posterior_sehat > posterior_gastritis
                        && posterior_sehat > posterior_helmintiasis
                        && posterior_sehat > posterior_rhintis
                        && posterior_sehat > posterior_dermatitis
                        && posterior_sehat > posterior_dermatopitosis
                        && posterior_sehat > posterior_enteritis
                        && posterior_sehat > posterior_otitis) {
                    Message = "Kucing Anda Sehat";
                    showMessage(Message);
                }
            }
        });
    }

    private void showMessage(String hasil) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Hasil Diagnosa");
        dialog.setMessage(hasil);
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}
