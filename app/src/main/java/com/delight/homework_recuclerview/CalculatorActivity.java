package com.delight.homework_recuclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class CalculatorActivity extends AppCompatActivity  {

    ArrayList<Values> results = new ArrayList<>();
    Values values = new Values();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);


        //цифры 0-9
        Button button0 = findViewById(R.id.zero);
        Button button1 = findViewById(R.id.one);
        Button button2 = findViewById(R.id.two);
        Button button3 = findViewById(R.id.three);
        Button button4 = findViewById(R.id.four);
        Button button5 = findViewById(R.id.five);
        Button button6 = findViewById(R.id.six);
        Button button7 = findViewById(R.id.seven);
        Button button8 = findViewById(R.id.eight);
        Button button9 = findViewById(R.id.nine);
        //plus,minus,division,multiply,dot,equally,delete
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button division = findViewById(R.id.division);
        Button multiply = findViewById(R.id.multiply);
        Button dot = findViewById(R.id.dot);
        Button equally = findViewById(R.id.equally);
        Button delete = findViewById(R.id.delete);
        Button percent = findViewById(R.id.percent);
        //button0 click
        button0.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("0");
            }
        });

        //button1 click
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("1");
            }
        });

        //button2 click
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("2");
            }
        });

        //button3 click
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("3");
            }
        });

        //button4 click
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("4");
            }
        });

        //button5 click
        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("5");
            }
        });

        //button6 click
        button6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("6");
            }
        });

        //button7 click
        button7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("7");
            }
        });


        //button8 click
        button8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("8");
            }
        });


        //button9 click
        button9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append("9");
            }
        });
        //  dot button  click
        dot.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.append(".");
            }
        });

        // button delete click

        delete.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                output.setText("");
            }
        });

        //plus button click
        plus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                values.val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                values.operator = "+";
            }
        });
        //minus button click
        minus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                values.val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                values.operator = "-";
            }
        });
        //division button click
        division.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                values.val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                values.operator = "/";
            }
        });
        //multiply button click
        multiply.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                values.val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                values.operator = "*";
            }
        });
        //percent button click
        percent.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                values.val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                values.operator = "%";
            }
        });

        //equals button click
        equally.setOnClickListener(new Button.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           TextView output = findViewById(R.id.editText);
                                           values.val2 = Double.parseDouble(output.getText().toString());

                                           if (values.operator == "+") {
                                               output.setText(Double.toString( values.val1 +  values.val2));
                                               values.result = values.val1 +  values.val2;





                                           } else if (values.operator == "-") {
                                               output.setText(Double.toString(values.val1 -  values.val2));
                                               values.result = values.val1 -  values.val2;



                                           } else if (values.operator == "/") {
                                               if (values.val2 == 0) {
                                                   output.setText("Can not divide by zero!");


                                               } else {
                                                   output.setText(Double.toString(values.val1 /  values.val2));

                                                   values.result = values.val1 /  values.val2;

                                               }
                                           } else if (values.operator == "*") {
                                               output.setText(Double.toString(values.val1 *  values.val2));

                                               values.result = values.val1 *  values.val2;


                                           } else if (values.operator == "%") {
                                               output.setText(Double.toString((values.val1 / 100) * values.val2));
                                               values.result = (values.val1/100) *  values.val2;





                                           }
                                       }


                                   }


        );


    }

    public void openHistoryList(View v){
        results.add(values);
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("Results", results);
        startActivity(intent);

    }

}