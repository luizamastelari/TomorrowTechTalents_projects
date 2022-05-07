package aula_6;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantia em kg: ");
        double m = sc.nextDouble();

        double excesso = m - 50.00;

        double multa = excesso * 4.00;

        System.out.println("Total da multa = " + multa);
    }
}
