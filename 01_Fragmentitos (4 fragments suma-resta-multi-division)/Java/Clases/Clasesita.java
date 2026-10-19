package com.example.fragmentitos;

public class Clasesita {
    protected double NUM1;
    protected double NUM2;

    public double getNUM1() {
        return NUM1;
    }

    public void setNUM1(double NUM1) {
        this.NUM1 = NUM1;
    }

    public double getNUM2() {
        return NUM2;
    }

    public void setNUM2(double NUM2) {
        this.NUM2 = NUM2;
    }
    public double suma(){
        return NUM1 + NUM2;
    }
    public double resta(){
        return NUM1 - NUM2;
    }
    public double multip(){
        return NUM1 * NUM2;
    }
    public double divide(){
        return NUM1 / NUM2;
    }
}