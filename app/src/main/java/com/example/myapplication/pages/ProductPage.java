package com.example.myapplication.pages;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.adapters.CustomPageAdapter;

public class ProductPage extends AppCompatActivity {

    private Button mBtnAdicionarProdutoSacola;
    private ViewPager mPageView;
    private ImageView mIvVoltarPaginaProduto;
    private ImageView mIvCompartilharProduto;
    private ImageView mIvAbrirSacolaPaginaProduto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_page);

        mPageView = findViewById(R.id.vp_tela_inicial);
        mBtnAdicionarProdutoSacola = findViewById(R.id.btn_adicionar_produto_sacola);
        mIvVoltarPaginaProduto = findViewById(R.id.iv_voltar_pagina_produto);
        mIvCompartilharProduto = findViewById(R.id.iv_compartilhar_produto);
        mIvAbrirSacolaPaginaProduto = findViewById(R.id.iv_abrir_sacola_pagina_produto);

        int[] mResources = {
                R.drawable.um,
                R.drawable.dois,
                R.drawable.tres,
                R.drawable.quatro,
                R.drawable.cinco,
                R.drawable.seis
        };

        CustomPageAdapter mCustomPageAdapter = new CustomPageAdapter(this, mResources);
        mPageView.setAdapter(mCustomPageAdapter);

        mBtnAdicionarProdutoSacola.setOnClickListener(view -> {
            Toast.makeText(this, "Produto adicionado na sacola com sucesso", Toast.LENGTH_SHORT).show();
        });

        mIvVoltarPaginaProduto.setOnClickListener(view -> {
            onBackPressed();
        });

        mIvCompartilharProduto.setOnClickListener(view -> {
            Toast.makeText(this, "Compartilhar produto", Toast.LENGTH_SHORT).show();
        });

        mIvAbrirSacolaPaginaProduto.setOnClickListener(view -> {
            Toast.makeText(this, "Abrir sacola página produto", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
