package com.example.listview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String deportescomenta [] = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
    String deporteslista [] = {"depo1","depo2","depo3","depo4","depo5","depo6","depo7","depo8","depo9","depo10"};
    int deporteimagenes [] =  {R.drawable.worlds_largest_larp,R.drawable.minecraft_logo};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
}