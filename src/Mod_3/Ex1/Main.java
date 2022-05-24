package Mod_3.Ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double num1, num2;
        Integer menu;

        System.out.println("Insira 2 números para realizar o calculo");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        menu = sc.nextInt();


        switch (menu){
            case 1:
                Adicao add = new Adicao(num1, num2);
                add.calcular();
                break;
            case 2:
                Subtracao sub = new Subtracao(num1,num2);
                sub.calcular();
                break;
            case 3:
                Multiplicacao mult = new Multiplicacao(num1,num2);
                mult.calcular();
                break;
            case 4:
                Divisao div = new Divisao(num1, num2);
                div.calcular();
                break;
        }

    }

}
