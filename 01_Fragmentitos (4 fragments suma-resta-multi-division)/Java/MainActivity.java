package com.example.fragmentitos;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button sumita,restita,mult,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        sumita = findViewById(R.id.fragment1btn);
        sumita.setOnClickListener(this);
        restita = findViewById(R.id.fragment2btn);
        restita.setOnClickListener(this);
        mult = findViewById(R.id.fragment3btn);
        mult.setOnClickListener(this);
        div = findViewById(R.id.fragment4btn);
        div.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button)v).getText().toString();
        if (cadenita.equals("+")){
            sumitas fragmentito = new sumitas();
            reemplazafragmento(fragmentito);
        }
        else
        if(cadenita.equals("-")){
            restitas fragmentito = new restitas();
            reemplazafragmento(fragmentito);
        }
        else
        if (cadenita.equals("*")){
            multis fragmentito = new multis();
            reemplazafragmento(fragmentito);

        }
        else
        if (cadenita.equals("/")) {
            division fragamentito = new division();
            reemplazafragmento(fragamentito);

        }
    }
    private void reemplazafragmento(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.basesita,fragment);
        fragmentTransaction.commit();
    }
}