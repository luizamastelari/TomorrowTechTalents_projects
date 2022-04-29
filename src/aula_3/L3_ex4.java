package aula_3;

import java.util.Scanner;

public class L3_ex4 {
    public static void main(String[] args){
        Integer numbers[] = new Integer[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        //Integer[] numbers = {5,7,3,9,5};

        for (int i = 0; i < numbers.length -1 ; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[j] > numbers[i]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int i= 0; i < 5; i++){
            System.out.println(numbers[i]);
        }
    }
}
