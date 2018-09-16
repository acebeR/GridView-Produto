package com.example.rebecadivina.gridviewprodutos.model;

import java.io.Serializable;

public class Sapato implements Serializable{

    private int nomeImg;

    private String nome;

    private String descricao;

    public Sapato(int nomeImg, String nome, String descricao){
        this.nomeImg  = nomeImg;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getNomeImg() {
        return nomeImg;
    }

    public void setNomeImg(int nomeImg) {
        this.nomeImg = nomeImg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
