package com.example.books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AlreadyreadActivity2 extends AppCompatActivity {
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alreadyread2);
        recycler = findViewById(R.id.recycler);
        Recycleradapter adapter = new Recycleradapter(this);
        recycler.setLayoutManager(new GridLayoutManager(this,2));
        recycler.setAdapter(adapter);
        adapter.setType("already read");
        Util util = new Util();
        adapter.setBooks(util.getAlreadyread());
        getSupportActionBar().setTitle("Already read");
    }
}