package com.example.rebecadivina.gridviewprodutos.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.rebecadivina.gridviewprodutos.R;
import com.example.rebecadivina.gridviewprodutos.activity.MainActivity;
import com.example.rebecadivina.gridviewprodutos.activity.SapatoActivity;
import com.example.rebecadivina.gridviewprodutos.model.Sapato;


import java.util.List;

/**
 * Created by UC15101831 on 12/09/2018.
 */

public class AdapterGrindView extends BaseAdapter implements View.OnClickListener{

    Sapato atualSapato;
    Activity activity;
    List<Sapato> list_sapatos;


    public AdapterGrindView(List<Sapato> list_sapatos, Activity activity) {
        this.list_sapatos = list_sapatos;
        this.activity = activity;
    }


    @Override
    public int getCount() {
        return list_sapatos.size();
    }

    @Override
    public Object getItem(int i) {
        return list_sapatos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<Sapato> getList_sapatos() {
        return list_sapatos;
    }

    public void setList_sapatos(List<Sapato> list_sapatos) {
        this.list_sapatos = list_sapatos;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Sapato sapato = (Sapato) getItem(i);

        this.atualSapato = sapato;

//        Log.d("MSG", sapato.getNome()); Melhor que o toast

        view = View.inflate(activity, R.layout.layout_img_grindview, null);

        Button btn = view.findViewById(R.id.btComprar);

        btn.setTag(sapato);             //Pendurando o objeto sapato
        btn.setOnClickListener(this);   //Chamar o Onclick, quando o usuário já tiver clicado, para o sapato da vez


        ImageView imgSapato = view.findViewById(R.id.imgSapato);


        imgSapato.setImageResource(sapato.getNomeImg());


        return view;
    }

    @Override
    public void onClick(View view) {
        Sapato sapato = (Sapato) view.getTag();
        Toast.makeText(getActivity(), sapato.getNome() , Toast.LENGTH_LONG).show();

        Intent intent = new Intent(getActivity(), SapatoActivity.class);

        intent.putExtra("objSapato", sapato);
        activity.startActivity(intent);
    }
}
