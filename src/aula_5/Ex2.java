package aula_5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a área em m2 a ser pintada: ");
        double m = sc.nextDouble();
        double price = 0;
        double qntdLiters = m / 3;

        if (qntdLiters > 18){
            if (qntdLiters % 18 == 0){
                price = qntdLiters / 18;
            } else {
                price = (qntdLiters /18 ) +1;
            }
        } else { price = 80.00; }


        System.out.println("Preço total: " + price);




    }

}
