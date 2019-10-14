package com.delight.homework_recuclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> implements onViewHolderListener{


        ArrayList<Values> data;
        MainActivity activity;




    public MainAdapter(ArrayList<Values> data){

        this.data = data;




    }



    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_main,parent,false);
        MainViewHolder vh = new MainViewHolder(view);
        vh.setOnClickListener(this);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {


        holder.onBind(data.get(position).result,(position));


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onClick(int position) {

        Intent intent = new Intent(activity,History.class);
        intent.putExtra("key",data);
        activity.startActivity(intent);
    }
}
