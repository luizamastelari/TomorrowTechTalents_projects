package aula_2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Integer numbers[] = new Integer[4];
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Type 4 numbers: ");
        for (int i = 0; i < 4; i++){
            numbers[i] = sc.nextInt();
            sum += Math.pow(numbers[i], 2);
        }

        System.out.println("Total sum = " + sum);
    }
}
