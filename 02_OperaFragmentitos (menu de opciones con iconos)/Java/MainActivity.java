package com.example.operafragmentitos;

import android.os.Bundle;
import android.view.Menu;import android.view.MenuItem;import android.view.View;
import android.widget.*;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText numero1,numero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        numero1 = findViewById(R.id.valor1);
        numero2 = findViewById(R.id.valor2);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusito,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Clasesita objetito = new Clasesita();

        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());

        if(item.getItemId() == R.id.sumita || item.getItemId()==R.id.Sumita){
            objetito.setNumero1(num1);
            objetito.setNumero2(num2);
            Toast.makeText(this,"Suma: " + objetito.suma(), Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
        else
        if(item.getItemId() == R.id.restita || item.getItemId()==R.id.Restita){
            objetito.setNumero1(num1);
            objetito.setNumero2(num2);
            Toast.makeText(this,"Resta: " + objetito.resta(), Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
        else
        if(item.getItemId() == R.id.multiplicadita || item.getItemId()==R.id.Multiplica){
            objetito.setNumero1(num1);
            objetito.setNumero2(num2);
            Toast.makeText(this,"Multiplicación: " + objetito.multiplica(), Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
        else
        if(item.getItemId() == R.id.partidita || item.getItemId()==R.id.Divide){
            objetito.setNumero1(num1);
            objetito.setNumero2(num2);
            Toast.makeText(this,"División: " + objetito.divide(), Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
        return false;
    }


}