package com.example.hp.jsonparsingusingretrofitandgalleryview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Hero> list = new ArrayList<>();
    Context context;

    RecyclerViewAdapter(List<Hero> list, Context context){

        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View v=inflater.inflate(R.layout.item_view,parent,false);
        RecyclerViewHolder holder=new RecyclerViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, final int position) {

        Picasso.with(context).load(list.get(position).getImageurl()).into(holder.imageView);
        holder.textView.setText(list.get(position).getName());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,IndiItemViewActivity.class);
                intent.putExtra("image",list.get(position).getImageurl());
                intent.putExtra("name",list.get(position).getName());
                intent.putExtra("realname",list.get(position).getRealname());
                intent.putExtra("team",list.get(position).getTeam());
                intent.putExtra("firstappearance",list.get(position).getFirstappearance());
                intent.putExtra("createdby",list.get(position).getCreatedby());
                intent.putExtra("publisher",list.get(position).getPublisher());
                intent.putExtra("bio",list.get(position).getBio());

                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
