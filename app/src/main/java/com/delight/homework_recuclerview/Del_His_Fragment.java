package com.delight.homework_recuclerview;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Del_His_Fragment extends Fragment {
    Button delete;
    Button history;
    EditText editText;

    public Del_His_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {


     final View view = inflater.inflate(R.layout.fragment_del__his_, container, false);
        editText = view.findViewById(R.id.editText);
                Intent intent = new Intent();
        editText.setText(intent.getStringExtra("key"));
     delete = view.findViewById(R.id.delete);
     history = view.findViewById(R.id.history);
        delete.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText output = view.findViewById(R.id.editText);
                output.setText("");
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                History_Fragment fragment = new History_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayout,fragment)
                        .addToBackStack(null).commit();
            }
        });
        return view;
    }

}
