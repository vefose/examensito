package com.example.llamaditas;

public class clasesita {
    private int tipo;
    private int duracion;
    private int costito;

    public int getCosto() {
        return costito;
    }

    public void setCosto(int costo) {
        this.costito = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public void costol(){
        costito = 1 * duracion;
    }
    public void coston(){
        costito = 2 * duracion;
    }
    public void costoi(){
        costito = 3 * duracion;
    }
}
