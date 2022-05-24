package Mod_2.Ex3;

import java.util.ArrayList;

public class Professor extends Pessoa {
    private String turma;
    private Double salario;
    private ArrayList<Disciplinas> Disciplinas = new ArrayList<>();

    public Professor(String nome, String cpf, String rg, String turma, Double salario, ArrayList<Mod_2.Ex3.Disciplinas> disciplinas) {
        super(nome, cpf, rg);
        this.turma = turma;
        this.salario = salario;
        Disciplinas = disciplinas;
    }

    public Professor(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", turma='" + turma + '\'' +
                ", salario=" + salario +
                ", Disciplinas=" + Disciplinas +
                '}';
    }
}
