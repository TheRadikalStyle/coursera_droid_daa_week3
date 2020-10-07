package com.theradikalsoftware.week3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MascotasFavoritas extends AppCompatActivity {
    private RecyclerView recyclerV;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        recyclerV = findViewById(R.id.activity_second_recyclerview);
        recyclerV.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerV.setLayoutManager(layoutManager);

        mAdapter = new MascotasAdapter();
        recyclerV.setAdapter(mAdapter);
    }
}