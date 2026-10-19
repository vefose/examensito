package com.example.fragmentitos;

import android.os.Bundle;
import android.widget.*;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class division extends Fragment implements View.OnClickListener {
    View view;
    Button botoncito;
    EditText n1,n2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_division, container, false);
        botoncito = view.findViewById(R.id.botdiv);
        botoncito.setOnClickListener(this);
        n1 = view.findViewById(R.id.num1);
        n2 = view.findViewById(R.id.num2);
        return view;
    }

    @Override
    public void onClick(View view) {
        Clasesita objetito = new Clasesita();
        int NUM1 = Integer.parseInt(n1.getText().toString());
        int NUM2 = Integer.parseInt(n2.getText().toString());
        objetito.setNUM1(NUM1);
        objetito.setNUM2(NUM2);
        Toast.makeText(getContext(),"Resultado: " + objetito.divide(),Toast.LENGTH_SHORT).show();
    }
}