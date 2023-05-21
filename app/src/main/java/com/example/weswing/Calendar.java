package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.weswing.recyclers.AssistentsRecycler;
import com.example.weswing.recyclers.CalendarEntity;
import com.example.weswing.recyclers.CalendarRecycler;
import com.example.weswing.recyclers.NewsFeedEntity;

import java.util.ArrayList;
import java.util.List;

public class Calendar extends Activity {

    private Button button1;
    private Button button2;
    private Button button3;
    private List<CalendarEntity> assistents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> updateButtonColors(button1));
        button2.setOnClickListener(v -> updateButtonColors(button2));
        button3.setOnClickListener(v -> updateButtonColors(button3));

        RecyclerView recycler = findViewById(R.id.assistents_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        CalendarRecycler adapter = new CalendarRecycler(assistents);

        recycler.setLayoutManager(linearLayoutManager);
        recycler.setAdapter(adapter);

        int[] nums = {2,2};

        adapter.add(new CalendarEntity("I'm beginning to see the light", "18 de abril de 2017 ", "Big Mama","17/07/2017 - 18/04/2017 | 2h hores", "Madrid, spain", nums));
        adapter.add(new CalendarEntity("I'm beginning to see the light", "18 de abril de 2017 ", "Big Mama","17/07/2017 - 18/04/2017 | 2h hores", "Madrid, spain", nums));
        adapter.add(new CalendarEntity("I'm beginning to see the light", "18 de abril de 2017 ", "Big Mama","17/07/2017 - 18/04/2017 | 2h hores", "Madrid, spain", nums));
        adapter.setOnItemClick(new CalendarRecycler.OnItemClick() {
            @Override
            public void getPosition(int pos) {

            }
        });


        findViewById(R.id.filtrar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calendar.this,   Filtre.class);
                startActivity(intent);
            }
        });
    }

    private void updateButtonColors(Button clickedButton) {
        button1.setBackgroundColor(Color.parseColor("#e7e2d6"));
        button2.setBackgroundColor(Color.parseColor("#e7e2d6"));
        button3.setBackgroundColor(Color.parseColor("#e7e2d6"));

        clickedButton.setBackgroundColor(Color.parseColor("#a24844"));
    }


}