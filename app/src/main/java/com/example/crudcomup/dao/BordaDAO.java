package com.example.crudcomup.dao;

import android.content.Context;

import com.example.crudcomup.dao.helpers.DaoHelper;
import com.example.crudcomup.model.Borda;

public class BordaDAO  extends DaoHelper<Borda> {



    public BordaDAO(Context c) {
        super(c, Borda.class);
    }
}
