package com.delight.homework_recuclerview;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Operation_Fragment extends Fragment {

    double val1,val2;
    String result,operator;


    public Operation_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_operation_, container, false);
//        Button plus = view.findViewById(R.id.plus);
//        Button minus = view.findViewById(R.id.minus);
//        Button division = view.findViewById(R.id.division);
//        Button multiply = view.findViewById(R.id.multiply);
//
//        Button percent = view.findViewById(R.id.percent);
//
//
//        //plus button click
//        plus.setOnClickListener(new View.OnClickListener() {
//                                    @Override
//                                    public void onClick(View v) {
//                                        EditText output = view.findViewById(R.id.editText);
//                                        val1 = Double.parseDouble(output.getText().toString());
//                                        output.setText("");
//                                        operator = "+";
//                                    }
//                                });
//        //minus button click
//        minus.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText output = view.findViewById(R.id.editText);
//                val1 = Double.parseDouble(output.getText().toString());
//                output.setText("");
//                operator = "-";
//            }
//        });
//        //division button click
//        division.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText output = view.findViewById(R.id.editText);
//                val1 = Double.parseDouble(output.getText().toString());
//                output.setText("");
//                operator = "/";
//            }
//        });
//        //multiply button click
//        multiply.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText output = view.findViewById(R.id.editText);
//                val1 = Double.parseDouble(output.getText().toString());
//                output.setText("");
//                operator = "*";
//            }
//        });
//        //percent button click
//        percent.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText output = view.findViewById(R.id.editText);
//                val1 = Double.parseDouble(output.getText().toString());
//                output.setText("");
//                operator = "%";
//            }
//        });
//
//        //equals button click


        return view;
    }

}
