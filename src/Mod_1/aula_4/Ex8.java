package Mod_1.aula_4;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Integer[][] num = new Integer[10][10];

        for(int i = 0; i <= num.length - 1; i++){
            for (int j = 0; j <= num[0].length - 1; j++){
                num[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Insert a value 0 - 100 : ");
        int guess = sc.nextInt();
        int hasNumber = 0;

        for(int i = 0; i <= num.length - 1; i++){
            for (int j = 0; j <= num[0].length - 1; j++){
                if(guess == num[i][j]){
                    System.out.println("The value exists");
                    hasNumber = 1;
                    break;
                }
            }
        }

        if(hasNumber == 0){
            System.out.println("--");
        }

    }
}
