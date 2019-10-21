package com.delight.homework_recuclerview;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Del_His_Fragment extends Fragment {

    View view;
    Button historyButton;
    FragmentManager manager;
    FragmentTransaction transaction;
    Number_Buttons_Fragment number_buttons_fragment;
    public Del_His_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        historyButton = view.findViewById(R.id.history);
//        historyButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                manager = getFragmentManager();
//                transaction = manager.beginTransaction();
//                number_buttons_fragment = (Number_Buttons_Fragment)getFragmentManager().findFragmentById(R.id.numberButtons_Fragment);
//                transaction.remove(number_buttons_fragment);
//                transaction.replace(R.id.FrameLayout,new Del_His_Fragment());
//                transaction.commit();
//
//            }
//        });

        view = inflater.inflate(R.layout.fragment_del__his_, container, false);
        return view;
    }

}
