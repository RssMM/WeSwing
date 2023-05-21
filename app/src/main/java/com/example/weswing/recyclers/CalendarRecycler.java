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


public class CalendarRecycler extends RecyclerView.Adapter<CalendarViewManager> {

    private List<CalendarEntity> calendarEntities;

    public CalendarRecycler(List<CalendarEntity> newsfeed) {
        this.calendarEntities = newsfeed;
    }

    public List<CalendarEntity> get() {
        return calendarEntities;
    }


    public void add(CalendarEntity newsFeed) {
        this.calendarEntities.add(newsFeed);
        this.notifyItemInserted(this.calendarEntities.size() - 1);
    }

    public void flush(){
        this.calendarEntities = new ArrayList<>();
    }

    @NonNull
    @Override
    public CalendarViewManager onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.calendar_card, parent, false);
        final CalendarViewManager viewHolder = new CalendarViewManager(vista);

        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull CalendarViewManager holder, @SuppressLint("RecyclerView") int position) {
        CalendarEntity calendar = this.calendarEntities.get(position);

        holder.getData_header().setText(calendar.getData_header());
        holder.getOrganitzar().setText("Organitzar per " + calendar.getOrganitzar());
        holder.getFecha().setText(calendar.getFecha());
        holder.getLocation().setText(calendar.getLocation());
        holder.getAssistents_amics().setText(calendar.getAssistents_amics()[0] + " asssistents | " + calendar.getAssistents_amics()[0] +  " amics");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.getPosition(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.calendarEntities.size();
    }

    OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public interface OnItemClick {
        void getPosition(int pos);
    }
}