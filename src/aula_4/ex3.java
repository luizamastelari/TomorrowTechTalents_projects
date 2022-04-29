package aula_4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double[][] numbers = new Double[2][2];
        Double biggestNum = 0.0;
        System.out.println("Type 4 numbers: ");

        for(int i = 0; i <= numbers.length - 1; i++){
            for (int j = 0; j <= numbers[0].length - 1; j++){
                numbers[i][j] = sc.nextDouble();
                if (biggestNum < numbers[i][j]){
                    biggestNum = numbers[i][j];
                }
            }
        }

        System.out.println("Biggest number is: " + biggestNum);

    }

}
