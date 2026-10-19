package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String deportescomenta [] = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
    String deporteslista [] = {"depo1","depo2","depo3","depo4","depo5","depo6","depo7","depo8","depo9","depo10"};
    int deporteimagenes [] =  {R.drawable.worlds_largest_larp,R.drawable.minecraft_logo,R.drawable.caballero_retira,
            R.drawable.gato_muejeje,R.drawable.hombre_de_negocios,R.drawable.ijodelaberga,R.drawable.itadori_dontget,
            R.drawable.patricio_traje_meme,R.drawable.spiderman,R.drawable.veggeto
    };
    ListView listViewsita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listViewsita = findViewById(R.id.vistitas);
        listViewsita.setOnItemClickListener(this);

        Adaptador adaptadorsito = new Adaptador(this,deportescomenta,deporteslista,deporteimagenes);
        listViewsita.setAdapter(adaptadorsito);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this,deportescomenta[position],Toast.LENGTH_SHORT).show();
    }
}