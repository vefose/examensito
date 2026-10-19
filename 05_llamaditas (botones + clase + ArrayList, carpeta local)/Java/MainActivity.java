package com.example.llamaditas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button botoncitol, botonciton, botoncitoi, bpaquetito;
    EditText editadito;
    arraycito alistito;
    int cuantos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        alistito = new arraycito();
        editadito = findViewById(R.id.textito);
        botoncitol = findViewById(R.id.blocal);
        botonciton = findViewById(R.id.bnacional);
        botoncitoi = findViewById(R.id.binternacional);
        bpaquetito = findViewById(R.id.bpagar);

        botoncitol.setOnClickListener(this);
        botonciton.setOnClickListener(this);
        botoncitoi.setOnClickListener(this);
        bpaquetito.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button)v).getText().toString();

        if (cadenita.equals("Local")) {
            clasesita objetito = new clasesita();
            objetito.setTipo(1);
            objetito.setDuracion(Integer.parseInt(editadito.getText().toString()));
            objetito.costol();
            alistito.agregar(objetito);
            Toast.makeText(this, "agregado", Toast.LENGTH_SHORT).show();
        }
        if (cadenita.equals("Nacional")) {
            clasesita objetito = new clasesita();
            objetito.setTipo(2);
            objetito.setDuracion(Integer.parseInt(editadito.getText().toString()));
            objetito.coston();
            alistito.agregar(objetito);
            Toast.makeText(this, "agregado", Toast.LENGTH_SHORT).show();
        }
        if (cadenita.equals("Internacional")) {
            clasesita objetito = new clasesita();
            objetito.setTipo(3);
            objetito.setDuracion(Integer.parseInt(editadito.getText().toString()));
            objetito.costoi();
            alistito.agregar(objetito);
            Toast.makeText(this, "agregado", Toast.LENGTH_SHORT).show();
        }
        if (cadenita.equals("Pagar")) {
            ArrayList<clasesita> aregresito = new ArrayList<>();
            aregresito = alistito.regresar();
            cuantos = aregresito.size();
            for (int i = 0; i < cuantos; i++) {
                Toast.makeText(this, "Tipo: " + aregresito.get(i).getTipo()
                        + "  Duracion: " + aregresito.get(i).getDuracion()
                        + "  Costo: $" + aregresito.get(i).getCosto(),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
