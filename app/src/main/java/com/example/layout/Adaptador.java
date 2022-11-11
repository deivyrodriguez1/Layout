package com.example.layout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter {

    List<String> elementos;

    public Adaptador(List<String> datos){
        elementos = datos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View miCajon;
        miCajon = LayoutInflater.from(parent.getContext()).inflate(R.layout.elemento,parent, false);
        return new Elemento(miCajon);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String miDato = elementos.get(position);
        holder.tvElemento.setText(miDato);
    }

    @Override
    public int getItemCount() {
        if (elementos != )
        return 0;
    }
}
