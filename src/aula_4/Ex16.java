package aula_4;


import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 10 nomes: ");


        String[] names = new String[5];

        for(int i = 0; i <= names.length - 1; i++){
            names[i] = sc.nextLine();
        }

        System.out.println("Okay. Diga um nome para procurar: ");
        String searchName = sc.nextLine();

        boolean foundOrNot = false;
        for(int i = 0; i <= names.length - 1; i++){
            if (searchName.equals(names[i])){
                System.out.println("Achei!");
                foundOrNot = true;
            }
        }

        if(foundOrNot == false){
            System.out.println("Não encontrei");
        }

    }
}
