package Mod_1.aula_4;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os valores ");
        Integer value = sc.nextInt();

        int exchange = value;

        Integer[] bils = {100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i <= bils.length - 1; i++){
            if (exchange >= bils[i]){
                double num_bills = exchange / bils[i];
                exchange %= bils[i];
                System.out.println(num_bills + " notas de " +
                        bils[i] + " reais");
            }
        }

    }
}
