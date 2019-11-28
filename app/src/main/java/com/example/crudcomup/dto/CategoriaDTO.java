package com.example.crudcomup.dto;

import com.example.crudcomup.model.Categoria;

public class CategoriaDTO {

    private long id;
    private String nome;
    private Double preco;
    private boolean divisivel;

    public CategoriaDTO() {
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

    public boolean isDivisivel() {
        return divisivel;
    }

    public void setDivisivel(boolean divisivel) {
        this.divisivel = divisivel;
    }

    public Categoria getCategoria(){
        Categoria cat = new Categoria();
        cat.setId(getId());
        cat.setNome(getNome());
        cat.setValor(getPreco());
        cat.setDivisivel(isDivisivel());
        return cat;
    }
}
