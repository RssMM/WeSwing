package com.example.weswing.recyclers;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswing.R;

public class CalendarViewManager extends RecyclerView.ViewHolder {
    private final TextView data_header, organitzar, fecha, location, assistents_amics, context;

    public CalendarViewManager(@NonNull View itemView) {
        super(itemView);
        context = itemView.findViewById(R.id.context);
        data_header= itemView.findViewById(R.id.date_header);
        organitzar= itemView.findViewById(R.id.organitzar);
        fecha= itemView.findViewById(R.id.fecha);
        location= itemView.findViewById(R.id.location);
        assistents_amics= itemView.findViewById(R.id.assistents);

    }

    public TextView getData_header() {
        return data_header;
    }

    public TextView getOrganitzar() {
        return organitzar;
    }

    public TextView getFecha() {
        return fecha;
    }

    public TextView getLocation() {
        return location;
    }

    public TextView getAssistents_amics() {
        return assistents_amics;
    }
}