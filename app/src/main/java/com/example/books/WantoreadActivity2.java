package com.example.books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class WantoreadActivity2 extends AppCompatActivity {
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wantoread2);
        recycler = findViewById(R.id.recycler);
        Recycleradapter adapter = new Recycleradapter(this);
        recycler.setLayoutManager(new GridLayoutManager(this,2));
        recycler.setAdapter(adapter);
        adapter.setType("want to read");
        Util util = new Util();
        adapter.setBooks(util.getWanttoreadbooks());
    }
}