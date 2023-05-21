package com.example.weswing.recyclers;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswing.R;

public class NewsFeedViewManager extends RecyclerView.ViewHolder {
    private final TextView context, horari;
    private final ImageView profilepic, go;

    public NewsFeedViewManager(@NonNull View itemView) {
        super(itemView);
        context = itemView.findViewById(R.id.context);
        profilepic = itemView.findViewById(R.id.profile_pic);
        go = itemView.findViewById(R.id.action_go);
        horari = itemView.findViewById(R.id.horari);
    }

    public TextView getContext() {
        return context;
    }

    public ImageView getProfilepic() {
        return profilepic;
    }

    public ImageView getGo() {
        return go;
    }

    public TextView getHorari() {
        return horari;
    }
}

