package com.example.projectsispak;

import java.util.ArrayList;

public class DataPenyakitKucing {

    private static String[] namaPenyakit = {
            "Scabies","Gastritis", "Helminthiasis", "Rhintis", "Dermatitis", "Dermaphytosis"
            ,"Otitis", "Entritis", "Sehat"
    };
    private static int[] gambarPenyakit = {
              R.drawable.koceng
    };

    private static String[] deskripsiPenyakit = {
            "Deksripsi Penyakit1", "Deksripsi Penyakit2","Deksripsi Penyakit3","Deksripsi Penyakit4",
            "Deksripsi Penyakit5","Deksripsi Penyakit6", "Deksripsi Penyakit7", "Deksripsi Penyakit8",
            "Deksripsi Penyakit9"
    };
    private static String[] gejalaPenyakit = {
            "Gejala Penyakit1", "Gejala Penyakit2", "Gejala Penyakit3", "Gejala Penyakit4", "Gejala Penyakit5",
            "Gejala Penyakit6", "Gejala Penyakit7", "Gejala Penyakit8", "Gejala Penyakit9"
    };
    private static String[] penyebabPenyakit = {
            "Penyebab Penyakit1", "Penyebab Penyakit2", "Penyebab Penyakit3", "Penyebab Penyakit4",
            "Penyebab Penyakit5", "Penyebab Penyakit6", "Penyebab Penyakit7", "Penyebab Penyakit8"
            ,"Penyebab Penyakit9"
    };
    private static String[] solusiPenyakit = {
            "Solusi Penyakit1", "Solusi Penyakit2", "Solusi Penyakit3", "Solusi Penyakit4","Solusi Penyakit5",
            "Solusi Penyakit6", "Solusi Penyakit7", "Solusi Penyakit8", "Solusi Penyakit9"
    };


    static ArrayList<PenyakitKucing> getListData(){
        ArrayList<PenyakitKucing> list = new ArrayList<>();
        for (int position = 0; position < namaPenyakit.length; position++){
            PenyakitKucing penyakitKucing = new PenyakitKucing();
            penyakitKucing.setNama(namaPenyakit[position]);
            penyakitKucing.setImage(gambarPenyakit[0]);
            penyakitKucing.setDeskripsi(deskripsiPenyakit[position]);
            penyakitKucing.setGejala(gejalaPenyakit[position]);
            penyakitKucing.setPenyebab(penyebabPenyakit[position]);
            penyakitKucing.setSolusi(solusiPenyakit[position]);
            list.add(penyakitKucing);
        }
        return list;
    }
}
