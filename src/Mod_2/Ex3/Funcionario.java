package Mod_2.Ex3;

public class Funcionario extends Pessoa{
    private String cargo;
    private Double salario;

    public Funcionario(String nome, String cpf, String rg, String cargo, Double salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome){
        super(nome);
    }



    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
