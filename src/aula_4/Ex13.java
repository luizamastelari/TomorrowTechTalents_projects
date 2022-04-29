package aula_4;

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de litros: ");
        Double liters = sc.nextDouble();
        sc.nextLine();
        System.out.println("Insira o tipo do combustível [G] ou [A]: ");
        String fuelType = sc.nextLine();
        fuelType.toLowerCase();
        double price = 0;

        if(fuelType.equals("g")){
            if (liters <= 20){
                price = (7.59 * 0.97) * liters;
            } else {
                price = (7.59 * 0.95) * liters;
            }
            System.out.println("O total foi R$" + price);
        } else if (fuelType.equals("a")){
            if (liters <= 20){
                price = (7.59 * 0.96) * liters;
            } else {
                price = (7.59 * 0.94) * liters;
            }
            System.out.println("O total foi R$" + price);
        }


    }
}
