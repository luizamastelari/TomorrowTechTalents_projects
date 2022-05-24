package Mod_1.aula_4;

import java.util.Random;

public class ex1 {
    public static void main(String[] args){
        Random random = new Random();
        Double[] numbers = new Double[10];

        for(int i = 0; i <= numbers.length - 1; i++){
            numbers[i] = random.nextDouble() * 100;
            System.out.println(numbers[i]);
        }
    }

}
