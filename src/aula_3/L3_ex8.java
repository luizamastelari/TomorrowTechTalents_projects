package aula_3;

import java.util.Scanner;

public class L3_ex8 {
    public static void main(String[] args){

            Integer numbers[] = new Integer[10];
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < numbers.length; i++){
                numbers[i] = sc.nextInt();
            }

            //Integer[] numbers = {5,7,3,109,5,14,65,10,9,17};
            int biggestNum = 0;
            int smallerNum = 0;

            for (int i = 0; i < numbers.length; i++){
                if(i == 0){
                    biggestNum = numbers[i];
                    smallerNum = numbers[i];
                } else {
                    if (biggestNum > numbers[i]){
                        biggestNum = numbers[i];
                    } else if (smallerNum < numbers[i]){
                        smallerNum = numbers[i];
                    }
                }
            }
            System.out.println(smallerNum);
            System.out.println(biggestNum);
    }
}
