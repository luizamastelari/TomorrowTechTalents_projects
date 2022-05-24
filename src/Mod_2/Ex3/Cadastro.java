package Mod_2.Ex3;

import java.util.ArrayList;

public class Cadastro {

    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public Cadastro() {

    }

    public void cadastrarPessoa(Pessoa pessoa){
        this.listaPessoas.add(pessoa);
    }

    public void deletarPessoa(Pessoa pessoa){
        this.listaPessoas.remove(pessoa);
    }

    public void modificarPessoa(Pessoa pessoa){
        if (pessoa instanceof Funcionario){

        }

    }

    public void listagemPessoas(){
        for (Pessoa pessoa : listaPessoas){
            System.out.println(pessoa.toString());
        }
    }

    public void listagemAlunos(){
        for (Pessoa pessoa : listaPessoas){
            if(pessoa instanceof Aluno){
                System.out.println(pessoa.toString());
            }
        }
    }

    public void listagemProfessores(){
        for (Pessoa pessoa : listaPessoas){
            if(pessoa instanceof Professor){
                System.out.println(pessoa.toString());
            }
        }
    }

    public void listagemFuncionarios(){
        for (Pessoa pessoa : listaPessoas){
            if(pessoa instanceof Funcionario){
                System.out.println(pessoa.toString());
            }
        }
    }

    public void detalhesPessoa(String nome){
        for (Pessoa pessoa : listaPessoas){
            if(pessoa.getNome().equals(nome)){
                System.out.println(pessoa.toString());
            }
        }
    }

}
