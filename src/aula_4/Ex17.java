package aula_4;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Double[] salary = new Double[100];
        Integer[] numChild = new Integer[100];

        boolean breakOrNot = false;
        int i = 0;
        double salarySum = 0;
        int sumChild = 0;
        double biggestSalary = 0;
        int lowSalaryCount = 0;

        do {
            System.out.println("Insira o numero de filho: ");
            numChild[i] = sc.nextInt();
            sc.nextLine();
            sumChild += numChild[i];

            System.out.println("Insira o salário: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();

            if (salary[i] < 0){
                salary[i] = 0.0;
                breakOrNot = true;
            }

            if (salary[i] > biggestSalary){
                biggestSalary = salary[i];
            }

            if (salary[i] < 150.00){
                lowSalaryCount++;
            }

            salarySum += salary[i];

            i++;
        } while (breakOrNot == false);

        double popMedianEarnings = salarySum / i;
        double numChildMedian = sumChild / i;
        double percentageLowSalary = (lowSalaryCount * 100) / i;

        System.out.println("A ganho médio da população é R$" + popMedianEarnings );
        System.out.println("A média de número de filhos é " + numChildMedian);
        System.out.println("O maior salário é  R$" + biggestSalary);
        System.out.println("A porcentagem de pessoas com salario baixo é " + percentageLowSalary);
    }
}
