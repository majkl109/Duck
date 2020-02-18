package com.example.duck;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView myTextView;

    ViewHolder(View itemView) {
        super(itemView);
        myTextView = itemView.findViewById(R.id.tvAnimalName);
        itemView.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        if(mClickListener != null) mC
    }
}