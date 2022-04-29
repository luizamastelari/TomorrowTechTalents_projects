package aula_4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Integer[][] numbers = {{11,42,63},{5,27,44},{162,32,46},{18,22,64}};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the line from [0] to [" + (numbers.length - 1) +
                "]");

        int line = sc.nextInt();

        for(int i = 0; i <= numbers.length - 1; i++){
            for (int j = 0; j <= numbers[0].length - 1; j++){
                if(i == line){
                    System.out.print(numbers[i][j]);
                    System.out.print(" ");
                }
            }
        }

    }
}
