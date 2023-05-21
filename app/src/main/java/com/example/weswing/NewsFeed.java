package com.example.weswing;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.weswing.recyclers.NewsFeedEntity;
import com.example.weswing.recyclers.NewsFeedRecycler;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed extends Activity {

    private List<NewsFeedEntity> newsfeeds = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);



        RecyclerView recycler = findViewById(R.id.novetats_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        NewsFeedRecycler adapter = new NewsFeedRecycler(newsfeeds);

        recycler.setLayoutManager(linearLayoutManager);
        recycler.setAdapter(adapter);

        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));
        newsfeeds.add(new NewsFeedEntity("Angela Manela", "Festa d'inici de Trimestre i presentació dels professors!", 5 , "10 hores"));


        adapter.setOnItemClick(new NewsFeedRecycler.OnItemClick() {
            @Override
            public void getPosition(int pos) {
                Intent intent = new Intent(NewsFeed.this, Moguda.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.calendar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewsFeed.this,   Calendar.class);
                startActivity(intent);
            }
        });



    }
}