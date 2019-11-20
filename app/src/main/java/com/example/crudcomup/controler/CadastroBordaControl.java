package com.example.crudcomup.controler;

import android.app.Activity;
import android.widget.EditText;
import android.widget.ListView;

import com.example.crudcomup.R;
import com.example.crudcomup.dao.BordaDAO;
import com.example.crudcomup.model.Borda;

public class CadastroBordaControl implements InterfaceListView, InterfaceControleDados {

    private Activity activity;

    private Borda borda;
    private BordaDAO bordaDAO;

    private EditText editNome;
    private EditText editValor;

    public CadastroBordaControl(Activity activity) {
        this.activity = activity;
        initComponents();
    }

    @Override
    public void initComponents() {
        editNome = activity.findViewById(R.id.editNome);
        editValor = activity.findViewById(R.id.editValor);
    }

    @Override
    public void getDadosForm() {

    }

    @Override
    public void setDadosForm() {

    }

    @Override
    public void clearDadosForm() {

    }

    @Override
    public void salvarDadosBanco() {

    }

    @Override
    public void getDadosBanco() {

    }

    @Override
    public void configListView() {

    }

    @Override
    public void configCliqueCurto() {

    }

    @Override
    public void configCliqueLongo() {

    }
}
