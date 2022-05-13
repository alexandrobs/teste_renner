package com.example.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] paises = getResources().getStringArray(R.array.paises_array);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises));
    }
}
