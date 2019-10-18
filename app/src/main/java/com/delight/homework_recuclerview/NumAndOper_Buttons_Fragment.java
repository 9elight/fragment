package com.delight.homework_recuclerview;


import android.content.Intent;
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
public class NumAndOper_Buttons_Fragment extends Fragment {

    double val1,val2;
    String result,operator;
    ArrayList<Values> results = new ArrayList<>();
    EditText output;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button dot;
    Button equally;
    View view;
    View view2;
    Button plus;
    Button minus ;
    Button division;
    Button multiply;
    Del_His_Fragment fragment;

    public NumAndOper_Buttons_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_number__buttons_, container, false);
        view2 = inflater.inflate(R.layout.fragment_del__his_, container, false);

         output = view2.findViewById(R.id.editText);
         button0 = view.findViewById(R.id.zero);
         button1 = view.findViewById(R.id.one);
         button2 = view.findViewById(R.id.two);
         button3 = view.findViewById(R.id.three);
         button4 = view.findViewById(R.id.four);
         button5 = view.findViewById(R.id.five);
         button6 = view.findViewById(R.id.six);
         button7 = view.findViewById(R.id.seven);
         button8 = view.findViewById(R.id.eight);
         button9 = view.findViewById(R.id.nine);
         dot = view.findViewById(R.id.dot);
         plus = view.findViewById(R.id.plus);
         minus = view.findViewById(R.id.minus);
         division = view.findViewById(R.id.division);
         multiply = view.findViewById(R.id.multiply);
         equally = view.findViewById(R.id.equally);
        if (output !=null){
            allNumber();
            equally();
            operator();
        }



        return view;
    }
    public void allNumber(){
        button0.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.setText("0");
            }
        });

        //button1 click
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append("1");
            }
        });

        //button2 click
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append("2");
            }
        });

        //button3 click
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append("3");
            }
        });

        //button4 click
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append("4");
            }
        });

        //button5 click
        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append("5");
            }
        });

        //button6 click
        button6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append("6");
            }
        });

        //button7 click
        button7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append("7");
            }
        });


        //button8 click
        button8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append("8");
            }
        });


        //button9 click
        button9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append("9");
            }
        });
        //  dot button  click
        dot.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 output = view2.findViewById(R.id.editText);
                output.append(".");
            }
        });
    }
    public void equally(){
        equally.setOnClickListener(new Button.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           TextView output = view2.findViewById(R.id.editText);
                                           val2 = Double.parseDouble(output.getText().toString());
                                           Values values = new Values();


                                           if (operator == "+") {
                                               output.setText(Double.toString(val1 + val2));
                                               result = String.valueOf(val1 + val2);
                                               values.val1 = val1;
                                               values.val2 = val2;
                                               values.operator = "+";
                                               values.result = result;
                                               results.add(values);


                                           } else if (operator == "-") {
                                               output.setText(Double.toString(val1 - val2));
                                               result = String.valueOf(val1 - val2);
                                               values.val1 = val1;
                                               values.val2 = val2;
                                               values.operator = "-";
                                               values.result = result;
                                               results.add(values);


                                           } else if (operator == "/") {
                                               if (val2 == 0) {
                                                   output.setText("Can not divide by zero!");


                                               } else {
                                                   output.setText(Double.toString(val1 / val2));

                                                   result = String.valueOf(val1 / val2);
                                                   values.val1 = val1;
                                                   values.val2 = val2;
                                                   values.operator = "/";
                                                   values.result = result;
                                                   results.add(values);
                                               }
                                           } else if (operator == "*") {
                                               output.setText(Double.toString(val1 * val2));

                                               result = String.valueOf(val1 * val2);
                                               values.val1 = val1;
                                               values.val2 = val2;
                                               values.operator = "*";
                                               values.result = result;
                                               results.add(values);
                                           } else if (operator == "%") {
                                               output.setText(Double.toString((val1 / 100) * val2));
                                               result = String.valueOf((val1 / 100) * val2);
                                               values.val1 = val1;
                                               values.val2 = val2;
                                               values.operator = "%";
                                               values.result = result;
                                               results.add(values);


                                           }
                                           new Intent(getContext(),Del_His_Fragment.class).putExtra("key",output.getText().toString());
                                       }


                                   }


        );
    }
    public void operator(){
        //plus button click
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = view.findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "+";
            }
        });
        //minus button click
        minus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = view.findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "-";
            }
        });
        //division button click
        division.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = view.findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "/";
            }
        });
        //multiply button click
        multiply.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = view.findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "*";
            }
        });


    }



}
