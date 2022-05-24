package Mod_1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Double[][] jump = new Double[100][5];
        String[] name = new String[100];

        boolean existOrNot = false;

        do {

            for(int i = 0; i <= jump.length - 1; i++){
                System.out.println("Informe o nome do atleta");
                name[i] = sc.nextLine();

                if(name[i].equals("")){
                    existOrNot = true;
                    break;
                }

                for (int j = 0; j <= jump[0].length - 1; j++){
                    System.out.println("Informe " + (j + 1) + " salto: ");
                    jump[i][j] = sc.nextDouble();
                    sc.nextLine();
                }
            }

        } while (existOrNot == false);

        for(int i = 0; i <= jump.length - 1; i++){
            for (int j = 0; j <= jump[0].length - 1; j++){

            }
        }

    }

}
