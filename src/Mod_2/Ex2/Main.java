package Mod_2.Ex2;

public class Main {
    public static void main(String[] args){

        Estoque est = new Estoque();
        Produto prod1 = new Produto();
        Produto prod2 = new Produto("banana","prata", 0);
        Produto prod3 = new Produto("banana","prata", 3);
        Produto prod4 = new Produto("abacaxi", "3", "fruta", 5, "del vale");

        est.addProduto(prod4);
        est.addProduto(prod3);
        est.addProduto(prod1);
        est.addProduto(prod2);


        //est.deletarItemLista(1);
        //est.updateItem(0,"abacaxi","del vale", 10, "3", "fruta");

        est.lerListaProd();






    }
}
