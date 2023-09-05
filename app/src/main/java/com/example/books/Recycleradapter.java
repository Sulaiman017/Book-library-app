package com.example.books;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Recycleradapter extends RecyclerView.Adapter<Recycleradapter.Viewholder> {
    private ArrayList<Books> books = new ArrayList<>();
    Viewholder viewholder;
    Context context;
    String type="";
    Util util;
    public Recycleradapter(Context context){
        this.context = context;
        util = new Util();
    }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler,parent,false);
        viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, @SuppressLint("RecyclerView") int position) {
        viewholder.name.setText(books.get(position).getName());
        viewholder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,InsideActivity.class);
                intent.putExtra("Bookid",books.get(position).getId());
                context.startActivity(intent);
            }
        });

        Glide.with(context)
                .asBitmap()
                .load(books.get(position).getImageurl())
                .into(holder.image);

        viewholder.card.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                switch (type){
                    case "want to read":
                        util.removeWant(books.get(position));
                        notifyDataSetChanged();
                        break;
                    case "currently reading":
                        util.removeCurrently(books.get(position));
                        notifyDataSetChanged();
                        break;
                    case "already read":
                        util.removeAlready(books.get(position));
                        notifyDataSetChanged();
                        break;
                }
                return true;
            }

        });
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;
        CardView card;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            card = itemView.findViewById(R.id.card);
        }
    }

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
        notifyDataSetChanged();
    }

    public void setType(String type) {
        this.type = type;
    }
}
