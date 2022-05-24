package Mod_1.aula_4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[][] numbers = new Integer[2][2];
        Integer sum = 0;
        System.out.println("Type 4 numbers: ");

        for(int i = 0; i <= numbers.length - 1; i++){
            for (int j = 0; j <= numbers[0].length - 1; j++){
                numbers[i][j] = sc.nextInt();
                sum += numbers[i][j];
            }
        }

        System.out.println("The sum is = " + sum);
    }
}
