package com.example.rebecadivina.gridviewprodutos.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;


import com.example.rebecadivina.gridviewprodutos.R;
import com.example.rebecadivina.gridviewprodutos.adapter.AdapterGrindView;
import com.example.rebecadivina.gridviewprodutos.model.Sapato;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements View.OnClickListener,AdapterView.OnItemClickListener{

    AdapterGrindView adapter;
    GridView gridSapato;
    Intent intent;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridSapato = (GridView) findViewById(R.id.gridSapato);

        List<Sapato> sapatos = new ArrayList<>();
        sapatos.add( new Sapato(R.drawable.primeiro,"Labutam Preto", "Sapato de marca, preto, com corrente"));
        sapatos.add( new Sapato(R.drawable.segundo,"Salto Preto","Salto preto, alto, com piças de ferro"));
        sapatos.add( new Sapato(R.drawable.terceiro,"Salto Azul","Lindo sapato com arranjo de cordas azuis"));
        sapatos.add( new Sapato(R.drawable.quarto,"Salto Mesclado","Salto preto com fitas Brancas"));


        adapter = new AdapterGrindView(sapatos,this);

        gridSapato.setAdapter(adapter);


    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }




}
