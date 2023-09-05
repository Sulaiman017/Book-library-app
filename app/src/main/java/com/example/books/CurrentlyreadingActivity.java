package com.example.books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CurrentlyreadingActivity extends AppCompatActivity {
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currentlyreading);
        recycler = findViewById(R.id.recycler);
        Recycleradapter adapter = new Recycleradapter(this);
        recycler.setLayoutManager(new GridLayoutManager(this,2));
        recycler.setAdapter(adapter);
        Util util = new Util();
        adapter.setType("currently reading");
        ArrayList<Books> books = util.getCurrentlyreading();
        adapter.setBooks(books);
    }
}