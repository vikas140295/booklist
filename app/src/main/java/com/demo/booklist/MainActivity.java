package com.demo.booklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Book> bookList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BooksListAdapter booksListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        prepareBookList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        booksListAdapter = new BooksListAdapter(bookList);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(booksListAdapter);

    }

    public void prepareBookList() {
        Book book = new Book(R.drawable.image,"Ruth Ware", 1);
        bookList.add(book);

        Book book2 = new Book(R.drawable.harrypotter1,"Harry Potter", 4);
        bookList.add(book2);

        Book book3 = new Book(R.drawable.android,"Learning Android", 3);
        bookList.add(book3);

        Book book4 = new Book(R.drawable.elonmusk,"Elon Musk", 9);
        bookList.add(book4);

        Book book5 = new Book(R.drawable.lrordofrings,"Lord of Rings", 5);
        bookList.add(book5);

        Book book6 = new Book(R.drawable.ironman,"The Iron Man", 8);
        bookList.add(book6);

        Book book7 = new Book(R.drawable.shivaimmortal,"Lord Shiva", 10);
        bookList.add(book7);

        Book book8 = new Book(R.drawable.oneindiangirl,"Two States", 8);
        bookList.add(book8);

        Book book9 = new Book(R.drawable.halfgirlfriend,"Half Girlfriend", 9);
        bookList.add(book9);

        Book book10 = new Book(R.drawable.stephenhawking,"Stephen Hawking", 10);
        bookList.add(book10);
    }
}
