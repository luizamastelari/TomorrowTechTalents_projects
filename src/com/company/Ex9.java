package com.company;

public class Ex9 {
    private String studentName;
    private double score1;
    private double score2;
    private double score3;

    public void median (double score1, double score2, double score3){
        System.out.println("Student " + studentName + " final score = "
                            + (score1 + score2 + score3)/3);

    }
}
