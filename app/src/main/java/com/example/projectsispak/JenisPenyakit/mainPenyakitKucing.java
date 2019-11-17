package com.example.projectsispak.JenisPenyakit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectsispak.CardViewPenyakit;
import com.example.projectsispak.R;

import java.util.ArrayList;

public class mainPenyakitKucing extends AppCompatActivity {

    private RecyclerView rvPenyakit;
    private ArrayList<PenyakitKucing> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpenyakit);
        rvPenyakit = findViewById(R.id.rv_heroes);

        list.addAll(DataPenyakitKucing.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvPenyakit.setLayoutManager(new LinearLayoutManager(this));
        CardViewPenyakit cardViewPenyakit = new CardViewPenyakit(list, getBaseContext());
        rvPenyakit.setAdapter(cardViewPenyakit);
    }
}
