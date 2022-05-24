package Mod_1.aula_3;

import java.util.Scanner;

public class L3_ex9 {
    public static void main(String[] args){
        Integer ages[] = new Integer[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the age of 10 people:");

        //Integer[] ages = {5,73,3,103,5,14,65,10,9,18};

        int olderThan18Count = 0;

        for (int i = 0; i < ages.length; i++){
            ages[i] = sc.nextInt();
            if (ages[i] >= 18){
                olderThan18Count++;
            }
        }

        System.out.println("The total number of people older than 18 is: " + olderThan18Count);
    }
}
