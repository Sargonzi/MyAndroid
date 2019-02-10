package com.zisarknar.learning;

import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txtTitle;
    public TextView txtTime;
    public TextView txtFullDesc;
    public ImageView imgView;

    public NewsViewHolder(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtTime = itemView.findViewById(R.id.txtTime);
        txtFullDesc = itemView.findViewById(R.id.txtFullDesc);
        imgView = itemView.findViewById(R.id.ivNews);
        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

    }
}
