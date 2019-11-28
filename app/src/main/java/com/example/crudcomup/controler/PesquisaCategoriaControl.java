package com.example.crudcomup.controler;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.crudcomup.R;
import com.example.crudcomup.dao.CategoriaDAO;
import com.example.crudcomup.model.Categoria;

import java.util.List;

public class PesquisaCategoriaControl {

    private Activity activity;

    private Categoria categoria;
    private CategoriaDAO categoriaDAO;

    private List<Categoria> categorias;

    private EditText editPesquisa;
    private ListView lvCategoria;



    private ArrayAdapter<Categoria> adapterCategoria;


    public PesquisaCategoriaControl(Activity activity) {
        this.activity = activity;
        initComponents();
    }

    private void initComponents(){
        editPesquisa = activity.findViewById(R.id.editPesquisa);
    }






}
