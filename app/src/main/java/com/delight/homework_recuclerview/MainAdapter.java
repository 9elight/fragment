package com.delight.homework_recuclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {


        ArrayList<String> data;
    public void ClearHistory(View view) {
    }

    public MainAdapter(ArrayList<String> result){

        data = result;
        notifyDataSetChanged();

    }



    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_main,parent,false);
        MainViewHolder vh = new MainViewHolder(view);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        String text = data.get(position);
        holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
