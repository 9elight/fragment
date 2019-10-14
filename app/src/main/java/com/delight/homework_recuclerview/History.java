package com.delight.homework_recuclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class History extends AppCompatActivity {
    TextView textView;
    Values values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        textView = findViewById(R.id.text_history);

        Intent intent = getIntent();

        values = (Values) intent.getSerializableExtra("key");


       /* String s1 = String.valueOf(values.get(0).val1);
        String s2 = String.valueOf(values.get(0).val2);
        String s3 = String.valueOf(values.get(0).operator);
        String s4 = String.valueOf(values.get(0).result);*/

        textView.setText((int) values.val1 + " " + values.operator + " " +  values.val2 + " = " + values.result );
    }
}
