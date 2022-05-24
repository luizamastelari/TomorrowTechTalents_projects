package Mod_1.aula_4;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de produtos: ");
        Integer qntd = sc.nextInt();
        sc.nextLine();

        String[] name = new String[qntd];
        Integer[] storage_qntd = new Integer[qntd];
        Double[] productPrice = new Double[qntd];

        double totValue = 0;
        double totMerch = 0;
        double medianValue = 0;

        for (int i = 0; i <= name.length - 1; i++){
            System.out.println("Insira o nome do produto: ");
            name[i] = sc.nextLine();

            System.out.println("Insira a quantidade em estoque: ");
            storage_qntd[i] = sc.nextInt();

            System.out.println("Insira o preço do produto: ");
            productPrice[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i <= name.length - 1; i++){
            totValue += (storage_qntd[i] * productPrice[i]);
            totMerch += storage_qntd[i];
        }

        medianValue = totValue / totMerch;

        System.out.println("O valor total em estoque: R$" + totValue);
        System.out.println("A média do valor das mercadorias: R$" + medianValue);
    }
}
