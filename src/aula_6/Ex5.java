package aula_6;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a altura : ");
        double h = sc.nextDouble();

        double idealWomen = (62.1 * h) - 44.7;
        double idealMen = (72.7 * h) - 58;

        System.out.println("O peso ideal para mulher é " + idealWomen);
        System.out.println("O peso ideal para homem é " + idealMen);
    }
}
