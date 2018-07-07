package com.example.hp.jsonparsingusingretrofitandgalleryview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.image);
        textView = itemView.findViewById(R.id.name);
    }
}
