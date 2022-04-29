package aula_3;

import java.util.Scanner;

public class L3_ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Give 2 numbers");
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();

        if(num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int i = num1 - num2;

        System.out.println("The numbers between " + num2 + " and " + num1);
        for ( i = num2+1 ; i < num1; i++){
            System.out.println(i);
        }
    }

}
