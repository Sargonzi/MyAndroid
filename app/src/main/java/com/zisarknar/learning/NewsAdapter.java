package com.zisarknar.learning;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.PriorityQueue;

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private List<News> newsList;
    private Context context;

    public NewsAdapter(List<News> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        return new NewsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view_new, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {
        newsViewHolder.txtTitle.setText(newsList.get(i).getTitle());
        newsViewHolder.txtTime.setText(newsList.get(i).getTime());
        newsViewHolder.txtFullDesc.setText(newsList.get(i).getDescription());
        Glide.with(context).load(newsList.get(i).getImg()).into(newsViewHolder.imgView);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}
