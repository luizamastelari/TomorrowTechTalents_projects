package com.company;

public class Ex13 {
    private double factorValue;

    public void totalPrice (double factorValue){
        double tot = (factorValue * 1.28) + (factorValue * 0.45);
        System.out.println("Price value = " + tot);
    }
}
