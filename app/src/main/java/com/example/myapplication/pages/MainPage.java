package com.example.myapplication.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.adapters.CustomPageAdapter;

public class MainPage extends AppCompatActivity {

    private Button mBtnComprar;
    private ViewPager mVpTelaInicial;
    private ImageView mIvPesquisarProduto;
    private ImageView mIvAbrirSacola;
    private ImageView mIvAbrirLojaVirtual;
    private ImageView mIvAbrirBlog;
    private ImageView mIvAbrirFavoritos;
    private ImageView mIvAbrirCartoes;
    private ImageView mIvAbrirMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_principal);

        mVpTelaInicial = findViewById(R.id.vp_tela_inicial);
        mBtnComprar = findViewById(R.id.btn_comprar);
        mIvPesquisarProduto = findViewById(R.id.iv_pesquisar_produto);
        mIvAbrirSacola = findViewById(R.id.iv_abrir_sacola_pagina_inicial);
        mIvAbrirLojaVirtual = findViewById(R.id.iv_abrir_loja_virtual);
        mIvAbrirBlog = findViewById(R.id.iv_abrir_blog);
        mIvAbrirFavoritos = findViewById(R.id.iv_abrir_favoritos);
        mIvAbrirCartoes = findViewById(R.id.iv_abrir_cartoes);
        mIvAbrirMenu = findViewById(R.id.iv_abrir_menu);

        int[] mResources = {
                R.drawable.um,
                R.drawable.dois,
                R.drawable.tres,
                R.drawable.quatro,
                R.drawable.cinco,
                R.drawable.seis
        };

        CustomPageAdapter mCustomPageAdapter = new CustomPageAdapter(this, mResources);
        mVpTelaInicial.setAdapter(mCustomPageAdapter);

        mBtnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainPage.this, ProductPage.class);
                startActivity(it);
            }
        });

        mIvPesquisarProduto.setOnClickListener(view -> {
            Toast.makeText(this, "Pesquisar por produtos", Toast.LENGTH_SHORT).show();
        });

        mIvAbrirSacola.setOnClickListener(view -> {
            Toast.makeText(this, "Abrir sacola página principal", Toast.LENGTH_SHORT).show();
        });

        mIvAbrirLojaVirtual.setOnClickListener(view -> {
            Toast.makeText(this, "Abrir loja virtual", Toast.LENGTH_SHORT).show();
        });

        mIvAbrirBlog.setOnClickListener(view -> {
            Toast.makeText(this, "Abrir blog", Toast.LENGTH_SHORT).show();
        });

        mIvAbrirFavoritos.setOnClickListener(view -> {
            Toast.makeText(this, "Abrir favoritos", Toast.LENGTH_SHORT).show();
        });

        mIvAbrirCartoes.setOnClickListener(view -> {
            Toast.makeText(this, "Abrir cartões", Toast.LENGTH_SHORT).show();
        });

        mIvAbrirMenu.setOnClickListener(view -> {
            Toast.makeText(this, "Abrir menu", Toast.LENGTH_SHORT).show();
        });
    }
}
