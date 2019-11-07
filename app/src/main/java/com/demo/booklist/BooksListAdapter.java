package com.demo.booklist;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BooksListAdapter extends RecyclerView.Adapter<BooksListAdapter.MyViewHolder> {

    private List<Book> booksList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, rating;
        public ImageView icon;

        public MyViewHolder( View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            rating = itemView.findViewById(R.id.rating);
            icon = itemView.findViewById(R.id.icon);
        }
    }

    public BooksListAdapter(List<Book> booksList) {
        this.booksList = booksList;
    }


    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.book_list_row, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MyViewHolder myViewHolder, int i) {
        Book book = booksList.get(i);
        String title =  "Title: " + book.getTitle();
        String rating = "Rating: " + book.getRating();
        myViewHolder.title.setText(title);
        myViewHolder.rating.setText(rating);
        myViewHolder.icon.setImageResource(book.getImageId());
    }

    @Override
    public int getItemCount() {
        return booksList.size();
    }

}
