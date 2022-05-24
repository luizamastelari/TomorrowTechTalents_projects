package Mod_1.aula_4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double[][] numbers = new Double[2][5];

        for(int i = 0; i <= numbers.length - 1; i++){
            for (int j = 0; j <= numbers[0].length - 1; j++){
                numbers[i][j] = sc.nextDouble();
            }
        }

        for(int i = 0; i <= numbers.length - 1; i++){
            System.out.println("");
            for (int j = 0; j <= numbers[0].length - 1; j++){
                System.out.print(numbers[i][j]);
                System.out.print(" ");
            }
        }

    }
}
