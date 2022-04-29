package aula_2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args){
        String beachName[] = new String[5];
        Double beachDistance[] = new Double[5];

        Scanner sc = new Scanner(System.in);
        int distantBeachIndex = 0;
        double mostDistant = 0.0;

        for (int i = 0; i < 5; i++){
            System.out.println("Beach name: ");
            beachName[i] = sc.nextLine();
            System.out.println("Beach distance: ");
            beachDistance[i] = sc.nextDouble();
            sc.nextLine();

            if (beachDistance[i] > mostDistant ){
                distantBeachIndex = i;
                mostDistant = beachDistance[i];
            }
        }

        System.out.println("The most distant beach is: " + beachName[distantBeachIndex]);

    }
}
