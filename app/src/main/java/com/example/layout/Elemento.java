package com.example.layout;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class Elemento extends ViewHolder {

    TextView tvElemento;
    TextView rvElemento;

    //Constructor
    public Elemento(@NonNull View itemView) {
        super(itemView);
        tvElemento = itemView.findViewById(R.id.tvElemento);
    }
}
