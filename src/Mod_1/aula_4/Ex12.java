package Mod_1.aula_4;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do salário: ");
        Double salary = sc.nextDouble();
        double totalEarned = 0;

        System.out.println("Insira o valor das vendas: ");
        Double sells = sc.nextDouble();

        if(sells > 1500){
            totalEarned = salary + (1500 * 0.03) + ((sells - 1500) * 0.05);
        } else {
            totalEarned = salary + (sells * 0.03);
        }

        System.out.println("Total ganho: " + totalEarned);

    }
}
