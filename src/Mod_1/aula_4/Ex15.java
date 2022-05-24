package Mod_1.aula_4;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] men_age = new Integer[2];
        Integer[] women_age = new Integer[2];

        for(int i = 0; i <= men_age.length - 1; i++){
            System.out.println("Insira primeiramente a idade de um homen ");
            men_age[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Insira a idade de uma mulher: ");
            women_age[i] = sc.nextInt();
            sc.nextLine();
        }

        int temp = 0;
        if(women_age[0] > women_age[1]){
            temp = women_age[0];
            women_age[0] = women_age[1];
            women_age[1] = temp;
        }

        if(men_age[0] > men_age[1]){
            temp = men_age[0];
            men_age[0] = men_age[1];
            men_age[1] = temp;
        }

        int sumAge = men_age[1] + women_age[0];
        int prodAge = women_age[1] * men_age[0];

        System.out.println("A soma das idades homem mais velho e mulher mais nova = "
        + sumAge);

        System.out.println("A multiplicação das idades mulher mais velha e homem mais novo = "
                + prodAge);



    }
}
