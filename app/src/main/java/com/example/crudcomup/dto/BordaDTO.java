package com.example.crudcomup.dto;

import com.example.crudcomup.model.Borda;

public class BordaDTO {

    private long id;
    private String nome;
    private Double preco;

    public BordaDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Borda getBorda(){
        Borda borda = new Borda();
        borda.setId(getId());
        borda.setNome(getNome());
        borda.setValor(getPreco());
        return borda;
    }



}
