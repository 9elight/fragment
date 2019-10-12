package com.delight.homework_recuclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);



        Intent intent = getIntent();
        ArrayList<Values> res = (ArrayList<Values>) intent.getSerializableExtra("Results");



        MainAdapter mainAdapter = new MainAdapter(res);
        recyclerView.setAdapter(mainAdapter);
        mainAdapter.activity = this;




    }



}
