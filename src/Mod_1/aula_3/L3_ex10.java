package Mod_1.aula_3;

import java.util.Random;
import java.util.Scanner;

public class L3_ex10 {
    public static void main(String[] args){
        Random random = new Random();
        int randomNum = random.nextInt(10);

        Scanner sc = new Scanner(System.in);

        int guessesCount = 1;

        do {
            System.out.println("Guess a number between 0 - 10:");
            Integer guessNum = sc.nextInt();


            if (guessNum == randomNum){
                System.out.println("You've got it!");
            } else if (guessNum < randomNum){
                System.out.println("Try a bigger number next time");
            } else {
                System.out.println("Try a smaller number next time");
            }

            guessesCount++;

        } while (guessesCount <= 3);

        System.out.println("The answer was: " + randomNum);
    }
}
