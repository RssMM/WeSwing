package com.example.weswing;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.weswing.recyclers.AssistentsRecycler;
import com.example.weswing.recyclers.NewsFeedEntity;

import java.util.ArrayList;
import java.util.List;

public class Assistents extends Activity {

    private List<NewsFeedEntity> assistents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistents);

        RecyclerView recycler = findViewById(R.id.assistents_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        AssistentsRecycler adapter = new AssistentsRecycler(assistents);

        recycler.setLayoutManager(linearLayoutManager);
        recycler.setAdapter(adapter);

        assistents.add(new NewsFeedEntity("Alba Cas Lemoonhop", "Dancer"));
        assistents.add(new NewsFeedEntity("Angela Manela Also","Dancer"));
        assistents.add(new NewsFeedEntity("Jana Gruilichova","Professor"));
        assistents.add(new NewsFeedEntity("Jazzmin Olave",  "Dancer"));
        assistents.add(new NewsFeedEntity("Neus Castells Maré","Professor"));

        adapter.setOnItemClick(new AssistentsRecycler.OnItemClick() {
            @Override
            public void getPosition(int pos) {
                Intent intent = new Intent(Assistents.this, Perfil.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.calendar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Assistents.this,   Calendar.class);
                startActivity(intent);
            }
        });


    }
}