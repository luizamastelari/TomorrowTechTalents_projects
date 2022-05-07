package Mod_2.Ex1;

import java.time.LocalDate;
import java.util.Random;

public class Jogador {
    Integer id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    Integer numero;
    String posicao;
    Integer qualidade;
    Integer cartoesAmarelos;
    Integer cartoesVermelhos;
    Boolean suspenso;

    //public Jogador() {
    //}

    public Jogador(Integer id, String nome,String apelido, LocalDate dataNascimento, Integer numero, String posicao, Integer qualidade, Integer cartoesAmarelos, Integer cartoesVermelhos, Boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
        this.suspenso = suspenso;
        this.apelido = apelido;
    }

    boolean verificarCondicaoDeJogo(){
        if (cartoesAmarelos == 3 || cartoesVermelhos == 1){
            this.suspenso = true;
        }
        return suspenso;
    }

    @Override
    public String toString() {
        return this.posicao + ": " +
                this.nome + " (" + this.apelido + ") - " +
                this.dataNascimento + " CONDIÇÃO: " + (verificarCondicaoDeJogo()? "APTO":"SUSPENSO") ;
    }

    void aplicarCartaoAmarelo( int quantidade){
        this.cartoesAmarelos += quantidade;
        verificarCondicaoDeJogo();
    }

    void aplicarCartaoVermelho(){
        this.cartoesVermelhos += 1;
        verificarCondicaoDeJogo();
    }

    void cumpriSuspensao(){
        this.cartoesVermelhos = 0;
        this.cartoesAmarelos = 0;
        verificarCondicaoDeJogo();
    }

    void sofrerLesao(){
        Random r = new Random();
        int probabilidade = r.nextInt(101) + 1;

        if (probabilidade <= 5){
           this.qualidade =(int)Math.ceil(qualidade * 0.85);
        } else if (probabilidade > 5 && probabilidade <= 15){
            this.qualidade =(int)Math.ceil(qualidade * 0.9);
        } else if (probabilidade > 15 && probabilidade <= 30){
            this.qualidade =(int)Math.ceil(qualidade * 0.95);
        } else if (probabilidade > 30 && probabilidade <= 60){
            this.qualidade -= 2;
        }else if (probabilidade > 60 && qualidade <= 100){
            this.qualidade -= 1;
        }
    }

    void executarTreinamento(){
        Random r = new Random();
        this.qualidade = r.nextInt(3) + 1;
        System.out.println(qualidade);
    }



}
