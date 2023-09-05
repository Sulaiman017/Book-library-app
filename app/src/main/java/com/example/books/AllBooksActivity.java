package com.example.books;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    RecyclerView recyler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        recyler = findViewById(R.id.recycler);
        Recycleradapter adapter = new Recycleradapter(this);
        recyler.setAdapter(adapter);
        recyler.setLayoutManager(new GridLayoutManager(this,2));
        ArrayList<Books> books = new ArrayList<>();
        Util util = new Util();
        util.initbooks();
        books = util.getSeeall();
        adapter.setBooks(books);
    }

}