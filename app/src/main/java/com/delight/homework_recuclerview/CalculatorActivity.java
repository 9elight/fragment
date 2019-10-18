package com.delight.homework_recuclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class CalculatorActivity extends AppCompatActivity  {
    FragmentManager manager;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        addFragment(new Del_His_Fragment());
        addFragment(new NumAndOper_Buttons_Fragment());

    }
    public void addFragment(Fragment fragment){
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.FrameLayout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}