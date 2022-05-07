package Mod_2.Ex1;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Jogador j1 = new Jogador(1,"joao", "juju", LocalDate.of(1980, 01, 02), 1, "atacante", 10, 0, 0, false );
        Jogador j2 = new Jogador(2, "Abreu", "abril", LocalDate.of(1980, 01, 02),2, "zagueiro",6, 1,0,false );
        Jogador j3 = new Jogador(3, "Zacarias","zac", LocalDate.of(1980, 01, 02), 3, "goleiro", 8,0, 1, true);
        Jogador j4 = new Jogador(4, "José", "egípcio", LocalDate.of(1980, 01, 02),4,"central", 9,0,0,false);
        Jogador j5 = new Jogador(5, "Anderson", "sonson", LocalDate.of(1980, 01, 02),5,"volante esquedo", 10,0,1,true);
        Jogador j6 = new Jogador(6, "Pitágoras", "cosseno", LocalDate.of(1980, 01, 02), 6, "atacante", 7, 0, 0,false);
        Jogador j7 = new Jogador(7, "Jorge Henrique", "JH", LocalDate.of(1980, 01, 02), 7, "meia", 8, 0,0, false);
        Jogador j8 = new Jogador(8, "Arnoldo", "dimas", LocalDate.of(1980, 01, 02), 8, "zagueiro", 9, 1,0,false);
        Jogador j9 = new Jogador(9, "Cansado", "soneca",LocalDate.of(1980, 01, 02), 9, "meia", 9, 0, 0, false);
        Jogador j10 = new Jogador(10, "Penultimo", "timao", LocalDate.of(1980, 01, 02), 10, "meia", 5, 3, 0, true);
        Jogador j11 = new Jogador(11, "Ultimo", "moicano", LocalDate.of(1980, 01, 02), 11,"atacante", 8, 0, 0, false);

        //j1.executarTreinamento();
        System.out.println(j1.qualidade);
        j1.sofrerLesao();
        System.out.println(j1.qualidade);
    }
}
