package Mod_1.aula_5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Há quantos anos fuma?");
        int anos = sc.nextInt();
        sc.nextLine();
        System.out.println("Há quantos cigarros fuma por dia?");
        int cigarrosDia = sc.nextInt();
        sc.nextLine();
        System.out.println("Preço de uma carteira de cigarros:");
        int precoCarteiro = sc.nextInt();
        sc.nextLine();

        double totalGasto = (((anos * 365) * cigarrosDia) / 20) * precoCarteiro;

        System.out.println("Total gasto: " + totalGasto);
    }
}
