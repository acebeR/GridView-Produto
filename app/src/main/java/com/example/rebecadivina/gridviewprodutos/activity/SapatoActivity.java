package com.example.rebecadivina.gridviewprodutos.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rebecadivina.gridviewprodutos.R;
import com.example.rebecadivina.gridviewprodutos.model.Sapato;

public class SapatoActivity extends Activity implements View.OnClickListener {

    Intent intent;
    Sapato sapato;
    TextView lbNome;
    TextView lbDescricao;
    ImageView imgSapato;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sapato);


        intent = getIntent();
        sapato = (Sapato) intent.getSerializableExtra("objSapato");

        lbNome = (TextView) findViewById(R.id.lbNome);
        lbNome.setText(sapato.getNome());

        lbDescricao = (TextView) findViewById(R.id.lbDescricao);
        lbDescricao.setText(sapato.getDescricao());

        imgSapato = (ImageView) findViewById(R.id.imgSapato);


        imgSapato.setImageBitmap(BitmapFactory.decodeResource(getResources(),sapato.getNomeImg()));

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button btn = findViewById(view.getId());


        if(btn != null){
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
