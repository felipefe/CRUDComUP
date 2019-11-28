package com.example.crudcomup.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName = "categoria")
public class Categoria {


    @DatabaseField(allowGeneratedIdInsert = true , generatedId = true)
    private Long id;

    @DatabaseField(canBeNull = false)
    private String nome;

    @DatabaseField(canBeNull = false)
    private Double valor;

    @DatabaseField(canBeNull = false)
    private boolean divisivel;

    public Categoria() {
    }

    public Categoria(Long id, String nome, Double valor, boolean divisivel) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.divisivel = divisivel;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isDivisivel() {
        return divisivel;
    }

    public void setDivisivel(boolean divisivel) {
        this.divisivel = divisivel;
    }

    @Override
    public String toString() {
        return id + " - " + nome;
    }
}
