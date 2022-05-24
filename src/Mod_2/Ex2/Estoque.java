package Mod_2.Ex2;

import java.util.ArrayList;

public class Estoque {
    public String nome;
    private ArrayList<Produto> produtos = new ArrayList<>();

    private static int id;

    public Estoque() {
        id++;
        this.id = id;
    }

    public Estoque(String nome, ArrayList<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
        id++;
        this.id = id;
    }

    public void addProduto(Produto produto){
        if (duplicatas(produto)){
            System.out.println("Quantidade atualizada.");
        } else {
            this.produtos.add(produto);
            System.out.println("Item adicionado.");
        }
    }

    private boolean duplicatas(Produto produto){
        boolean duplicata = false;
        for(Produto produtoNaLista : produtos){

            if (produto.getMarca().isEmpty() || produto.getNome().isEmpty() ||
            produtoNaLista.getNome().isEmpty() || produtoNaLista.getMarca().isEmpty()){
                return duplicata = false;
            } else {
                if(produtoNaLista.getNome().equals(produto.getNome()) &&
                        produtoNaLista.getMarca().equals(produto.getMarca())){
                    produtoNaLista.setQtd(produtoNaLista.getQtd() + produto.getQtd());
                    duplicata = true;
                }
            }
        }
        return duplicata;
    }

    public void lerListaProd (){
        for(Produto produto : produtos){
            System.out.println("[" + produto.getId_prod() +
                    "] - " + produto.getNome());
        }
    }

    public void dadoProduto(Integer id){
        for(Produto produto : produtos){
            if(produto.getId_prod() == id){
                System.out.println(produto.toString());
            }
        }
    }

    public void deletarItemLista(Integer id){
        for(Produto produto : produtos){
            if(produto.getId_prod() == id){
                produtos.remove(produto);
                System.out.println("Item [" + id +" ] deletado.");
            }
        }
    }

    public void updateItem(Integer id, String nome, String marca, Integer qtd, String session, String tipo){
        for(Produto produto : produtos){
            if(produto.getId_prod() == id){
                produto.setMarca(marca);
                produto.setNome(nome);
                produto.setQtd(qtd);
                produto.setSession(session);
                produto.setTipo(tipo);
            }
        }
    }
}
