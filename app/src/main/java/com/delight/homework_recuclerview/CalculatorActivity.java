package com.delight.homework_recuclerview;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.io.Serializable;
import java.util.ArrayList;

public class CalculatorActivity extends AppCompatActivity  {
    double val1,val2;
    String result,operator;

    ArrayList<Values> results = new ArrayList<>();
    History_Fragment history_fragment;
    View frameLayout;
    FragmentManager manager;

    FragmentTransaction transaction;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        frameLayout = findViewById(R.id.FrameLayout);

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
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "+";
            }
        });
        //minus button click
        minus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "-";
            }
        });
        //division button click
        division.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "/";
            }
        });
        //multiply button click
        multiply.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "*";
            }
        });
        //percent button click
        percent.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = findViewById(R.id.editText);
                val1 = Double.parseDouble(output.getText().toString());
                output.setText("");
                operator = "%";
            }
        });

        //equals button click
        equally.setOnClickListener(new Button.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           TextView output = findViewById(R.id.editText);
                                           val2 = Double.parseDouble(output.getText().toString());
                                           Values values = new Values();


                                           if (operator == "+") {
                                               output.setText(Double.toString( val1 +  val2));
                                               result = String.valueOf(val1 +  val2);
                                               values.val1 = val1;
                                               values.val2 = val2;
                                               values.operator = "+";
                                               values.result = result;
                                               results.add(values);
                                               saveNewElem(output.getText().toString());





                                           } else if (operator == "-") {
                                               output.setText(Double.toString(val1 -  val2));
                                               result = String.valueOf(val1 -  val2);
                                               values.val1 = val1;
                                               values.val2 = val2;
                                               values.operator = "-";
                                               values.result = result;
                                               results.add(values);
                                               saveNewElem(output.getText().toString());


                                           } else if (operator == "/") {
                                               if (val2 == 0) {
                                                   output.setText("Can not divide by zero!");


                                               } else {
                                                   output.setText(Double.toString(val1 /  val2));

                                                   result = String.valueOf(val1 /  val2);
                                                   values.val1 = val1;
                                                   values.val2 = val2;
                                                   values.operator = "/";
                                                   values.result = result;
                                                   results.add(values);
                                                   saveNewElem(output.getText().toString());
                                               }
                                           } else if (operator == "*") {
                                               output.setText(Double.toString(val1 *  val2));

                                               result = String.valueOf(val1 *  val2);
                                               values.val1 = val1;
                                               values.val2 = val2;
                                               values.operator = "*";
                                               values.result = result;
                                               results.add(values);
                                               saveNewElem(output.getText().toString());
                                           } else if (operator == "%") {
                                               output.setText(Double.toString((val1 / 100) * val2));
                                               result = String.valueOf((val1/100) *  val2);
                                               values.val1 = val1;
                                               values.val2 = val2;
                                               values.operator = "%";
                                               values.result = result;
                                               results.add(values);
                                               saveNewElem(output.getText().toString());


                                           }
                                       }


                                   }


        );


    }

    public  void openHistoryList(View v){

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("Results", results);
        startActivity(intent);
//        Log.d("tag","History Button Pressed");

//        replaceFragment(new Del_His_Fragment());

    }

    public void saveNewElem(String s){
        DataStore.getInstance().saveString(getBaseContext(),s);
    }
    public void removeFragment(Fragment fragment){
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.remove(fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void replaceFragment(Fragment fragment){
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.FrameLayout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}