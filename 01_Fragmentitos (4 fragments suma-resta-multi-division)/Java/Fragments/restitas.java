package com.example.fragmentitos;

import android.os.Bundle;
import android.widget.*;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class restitas extends Fragment implements View.OnClickListener {
    View view;
    EditText n1, n2;
    Button botoncito;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_restitas, container, false);

        botoncito = view.findViewById(R.id.botresta);
        botoncito.setOnClickListener(this);

        n1 = view.findViewById(R.id.num1);
        n2 = view.findViewById(R.id.num2);
        return view;
    }

    @Override
    public void onClick(View view) {
        Clasesita objetito = new Clasesita();
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        objetito.setNUM1(num1);
        objetito.setNUM2(num2);
        Toast.makeText(getContext(),"Resultado: " + objetito.resta(),Toast.LENGTH_SHORT).show();
    }
}