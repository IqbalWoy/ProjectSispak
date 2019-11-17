package com.example.projectsispak;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.projectsispak.JenisPenyakit.PenyakitKucing;
import com.example.projectsispak.JenisPenyakit.detailPenyakitKucing;

import java.util.ArrayList;

public class CardViewPenyakit extends RecyclerView.Adapter<CardViewPenyakit.CardViewHolder> {

    private ArrayList<PenyakitKucing> listPenyakit;
    Context context;

    public CardViewPenyakit(ArrayList<PenyakitKucing> list, Context context){
        this.listPenyakit = list;
        this.context = context;
    }

    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_penyakit, viewGroup, false);
        return new CardViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewPenyakit.CardViewHolder holder, int position) {
        final PenyakitKucing penyakitKucing = listPenyakit.get(position);

        Glide.with(holder.itemView.getContext()).
                load(penyakitKucing.getImage()).
                apply(new RequestOptions().override(350,350)).into(holder.imgPhoto);
        holder.textPenyakit.setText(penyakitKucing.getNama());
        holder.arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),
                        "Penyakit " + listPenyakit.get(holder.getAdapterPosition())
                                .getNama(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context.getApplicationContext(), detailPenyakitKucing.class);
                intent.putExtra("image", penyakitKucing.getImage());
                intent.putExtra("namaPenyakit", penyakitKucing.getNama());
                intent.putExtra("desPenyakit", penyakitKucing.getDeskripsi());
                intent.putExtra("gejPenyakit", penyakitKucing.getGejala());
                intent.putExtra("penyPenyakit", penyakitKucing.getPenyebab());
                intent.putExtra("solPenyakit", penyakitKucing.getSolusi());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listPenyakit.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto, arrow;
        TextView textPenyakit;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            arrow = itemView.findViewById(R.id.arrow);
            textPenyakit = itemView.findViewById(R.id.textPenyakit);
        }
    }
}
