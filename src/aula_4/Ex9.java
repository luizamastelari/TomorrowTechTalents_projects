package aula_4;

import java.util.Random;

public class Ex9 {
    public static void main(String[] args){
        Random random = new Random();
        Integer[][] num = new Integer[3][5];
        Integer[] sumLine = {0,0,0};
        Integer[] sumColumn = {0,0,0,0,0};

        for(int i = 0; i <= num.length - 1; i++){
            for (int j = 0; j <= num[0].length - 1; j++){
                num[i][j] = random.nextInt(5);
            }
        }

        for(int i = 0; i <= num.length - 1; i++){
            System.out.println("");
            for (int j = 0; j <= num[0].length - 1; j++){
                sumColumn[j] += num[i][j];
                sumLine[i] += num[i][j];
                System.out.print(num[i][j]);
                System.out.print(" ");
            }

        }
        System.out.println(" ");

        for(int i = 0; i <= sumColumn.length - 1; i++){
            System.out.printf("Column [%d] sum = %d \n",i ,sumColumn[i]);
        }

        for(int i = 0; i <= sumLine.length - 1; i++){
            System.out.printf("Line [%d] sum = %d \n",i ,sumLine[i]);
        }


    }
}
