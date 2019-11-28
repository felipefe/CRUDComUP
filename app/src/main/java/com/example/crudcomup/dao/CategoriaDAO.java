package com.example.crudcomup.dao;

import android.content.Context;

import com.example.crudcomup.dao.helpers.DaoHelper;
import com.example.crudcomup.model.Categoria;

public class CategoriaDAO extends DaoHelper<Categoria> {

    public CategoriaDAO(Context c) {
        super(c, Categoria.class);
    }
}
