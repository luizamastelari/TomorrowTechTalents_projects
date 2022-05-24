package Mod_1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a área em m2 a ser pintada: ");
        double m = sc.nextDouble();
        double price1 = 0;
        double price2 = 0;
        double qntdLiters = m / 3;

        if (qntdLiters > 18){
            if (qntdLiters % 18 == 0){
                price1 = (qntdLiters / 18) * 80.00;
            } else {
                price1 = ((qntdLiters /18 ) +1) * 80.00;
            }
        } else { price1 = 80.00; }

        if (qntdLiters > 3.6){
            if (qntdLiters % 3.6 == 0){
                price2 = (qntdLiters / 3.6) * 25.00;
            } else {
                price2 = ((qntdLiters / 3.6 ) + 1) * 25.00;
            }
        } else { price2 = 36.00; }

        System.out.println("Preço total com lata de 18L: " + price1);
        System.out.println("Preço total com lata de 3.6L: " + price2);

    }
}
