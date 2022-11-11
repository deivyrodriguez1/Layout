package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvElementos;
    Adaptador miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvElementos = findViewById(R.id.rvElementos);
        rvElementos.setLayoutManager(new LinearLayoutManager(this));

        List<String> misDatosLocales = new ArrayList<>();
        misDatosLocales.add("Deivy");
        misDatosLocales.add("Yenifer");
        misDatosLocales.add("Mariana");
        misDatosLocales.add("Edwin");

        miAdaptador = new Adaptador(misDatosLocales);
        rvElementos.setAdapter(miAdaptador);
    }
}