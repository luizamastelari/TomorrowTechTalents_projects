package Mod_1.aula_3;

public class L3_ex7 {
    private int number;


    public void factorial(int number){
        int factorial = number;
        for (int i = number - 1; i >= 1; i--){
            System.out.println(factorial + " * " + i);
            factorial *= i;
        }

        System.out.println("Fatorial de " + number + " = " + factorial);
    }
}
