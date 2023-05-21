package com.example.weswing.recyclers;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.weswing.R;

import java.util.ArrayList;
import java.util.List;

public class AssistentsRecycler extends RecyclerView.Adapter<NewsFeedViewManager> {

    private List<NewsFeedEntity> newsFeedEntities;

    public AssistentsRecycler(List<NewsFeedEntity> newsfeed) {
        this.newsFeedEntities = newsfeed;
    }

    public List<NewsFeedEntity> get() {
        return newsFeedEntities;
    }


    public void add(NewsFeedEntity newsFeed) {
        this.newsFeedEntities.add(newsFeed);
        this.notifyItemInserted(this.newsFeedEntities.size() - 1);
    }

    public void flush(){
        this.newsFeedEntities = new ArrayList<>();
    }

    @NonNull
    @Override
    public NewsFeedViewManager onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.newsfeed_card, parent, false);
        final NewsFeedViewManager viewHolder = new NewsFeedViewManager(vista);

        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull NewsFeedViewManager holder, @SuppressLint("RecyclerView") int position) {
        NewsFeedEntity news = this.newsFeedEntities.get(position);
        String context = news.getNomApellidos();
        holder.getContext().setText(context);
        holder.getHorari().setText(news.getData());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.getPosition(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.newsFeedEntities.size();
    }

    OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public interface OnItemClick {
        void getPosition(int pos);
    }
}
