package com.example.books;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class InsideActivity extends AppCompatActivity {
    ImageView image;
    TextView name,author,description,pages;
    Button currently,wanttoread,already;
    private Books incomingbook;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        image = findViewById(R.id.image);
        name = findViewById(R.id.name);
        author = findViewById(R.id.author);
        description = findViewById(R.id.description);
        pages = findViewById(R.id.pages);
        currently = findViewById(R.id.currently);
        wanttoread = findViewById(R.id.wanttoread);
        already = findViewById(R.id.already);

        Intent intent = new Intent();
        intent = getIntent();
        int id = intent.getIntExtra("Bookid",0);
        Util util = new Util();
        ArrayList<Books> books = new ArrayList<>();
        books = util.getSeeall();
        for (Books b: books){
            if(b.getId() == id){
                incomingbook = b;
                name.setText(b.getName());
                author.setText(b.getAuthor());
                description.setText(b.getDescription());
                pages.setText("Pages: " + b.getPages());

                Glide.with(this).asBitmap().load(b.getImageurl()).into(image);
            }

        }
        currently.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Books> currently = util.getCurrentlyreading();
                boolean flag = true;
                for (Books b: currently){
                    if(b.getId() == incomingbook.getId()){
                       flag = false;
                    }
                }
                if(flag){
                    util.addCurrently(incomingbook);
                    builder.setMessage(incomingbook.getName() + " has been successfully added");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setCancelable(false);
                    builder.create().show();
                }
                else{
                    builder.setTitle("Error");
                    builder.setMessage("The book already exists in the list");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setCancelable(false);
                    builder.create().show();
                }
            }
        });

        wanttoread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                util.addWant(incomingbook);
            }
        });

        wanttoread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Books> wanto = util.getWanttoreadbooks();
                boolean flag = true;
                for (Books b: wanto){
                    if(incomingbook.getId() == b.getId()){
                        flag = false;
                    }
                }
                if(flag){
                    util.addWant(incomingbook);
                    builder.setMessage(incomingbook.getName() + " has been added to want to read list");
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setCancelable(false);
                    builder.create().show();
                }
                else {
                    builder.setTitle("Error");
                    builder.setMessage("The book already exists in the list");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setCancelable(false);
                    builder.create().show();
                }
            }
        });


        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Books> already = util.getAlreadyread();
                boolean flag = true;
                for (Books b: already){
                    if(incomingbook.getId() == b.getId()){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    util.addAlready(incomingbook);
                    builder.setMessage(incomingbook.getName() + " has been added to already read list");
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setCancelable(false);
                    builder.create().show();
                }
                else {
                    builder.setTitle("Error");
                    builder.setMessage("The book already exists in the list");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setCancelable(false);
                    builder.create().show();
                }
            }
        });

    }
}