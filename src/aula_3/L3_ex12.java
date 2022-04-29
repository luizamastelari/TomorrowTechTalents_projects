package aula_3;

import java.util.Scanner;

public class L3_ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        int nameSize = name.length();

        if (nameSize <= 3 ){
            System.out.println("Invalid name");
        }

        System.out.println("Enter the age: ");
        Integer age = sc.nextInt();

        if (age < 0 || age > 150 ){
            System.out.println("Invalid age");
        }

        System.out.println("Enter the salary: ");
        Double salary = sc.nextDouble();

        if (salary <= 0  ){
            System.out.println("Invalid salary");
        }

        System.out.println("Enter the sex 'f' or 'm' : ");
        Character sex = sc.next().charAt(0);

        if (sex != 'f' || sex != 'm' ){
            System.out.println("Invalid sex");
        }

        System.out.println("Enter the marital status  as 'c', 's', 'v' or 'd' : ");
        Character status = sc.next().charAt(0);

        if (status != 'c' || status != 's'
                || status != 'v'|| status != 'd'){
            System.out.println("Invalid status");
        }

    }
}
