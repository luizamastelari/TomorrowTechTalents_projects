package Mod_2.Ex3;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Integer idade;
    private String turma;
    private ArrayList<Double> notaPorDisc = new ArrayList<>();

    public Aluno(String nome, String cpf, String rg, Integer idade, String turma, ArrayList<Double> notaPorDisc) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.notaPorDisc = notaPorDisc;
    }

    public Aluno(String nome){
        super(nome);
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "idade=" + idade +
                ", turma='" + turma + '\'' +
                ", notaPorDisc=" + notaPorDisc +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
