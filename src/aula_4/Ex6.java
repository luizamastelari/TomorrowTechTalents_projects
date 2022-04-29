package aula_4;

import java.util.Random;

public class Ex6 {
    public static void main(String[] args){
        Random random = new Random();
        Integer[][] lottery = new Integer[13][3];
        Integer[][] guess = new Integer[13][3];
        int totPoints = 0;

        for(int i = 0; i <= lottery.length - 1; i++){
            for (int j = 0; j <= lottery[0].length - 1; j++){
                lottery[i][j] = random.nextInt(3) + 1;
                guess[i][j] = random.nextInt(3) + 1;
            }
        }

        System.out.println("Results: ");
        for(int i = 0; i <= lottery.length - 1; i++){
            System.out.println("");
            for (int j = 0; j <= lottery[0].length - 1; j++){
                System.out.print(lottery[i][j]);
                System.out.print(" ");
                if (lottery[i][j] == guess[i][j]){
                    totPoints += 1;
                }
            }
        }

        System.out.println("");
        System.out.println("You've made " + totPoints + " points");

    }
}
