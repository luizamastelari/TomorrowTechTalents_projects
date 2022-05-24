package Mod_2.Ex3;

import java.util.ArrayList;
import java.util.jar.JarEntry;

public class Main {

    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();

        Aluno izaura = new Aluno("Izaura");
        Professor luciano = new Professor("Luciano");
        Funcionario jose = new Funcionario("Jose");

        cadastro.cadastrarPessoa(izaura);
        cadastro.cadastrarPessoa(luciano);
        cadastro.cadastrarPessoa(jose);

        cadastro.deletarPessoa(jose);
        cadastro.listagemPessoas();

        //cadastro.detalhesPessoa("Izaura");
;

    }

}
