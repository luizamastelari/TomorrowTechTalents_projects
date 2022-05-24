package Mod_1.aula_3;

import java.util.Scanner;

public class L3_ex2 {
    public static void main(String[] args){
        int number = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("To quit type 0: ");
        while (number != 0){
            number = sc.nextInt();
            if (number < 0 ) {System.out.println("Negative");}
            else if (number > 0){ System.out.println("Positive");}
        }
    }
}
