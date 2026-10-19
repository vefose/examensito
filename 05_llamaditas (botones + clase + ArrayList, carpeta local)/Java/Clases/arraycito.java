package com.example.llamaditas;

import java.util.ArrayList;

public class arraycito {
    ArrayList<clasesita> alistito = new ArrayList<>();
    public void agregar(clasesita objetito){
        alistito.add(objetito);
    }
    public ArrayList regresar(){
        return alistito;
    }
}
