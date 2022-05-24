package Mod_1;

public class Ex7 {
    public static void main(String[] args){
        String[] marca = {"gol", "cordoba", "celta", "fusca", "hb20"};
        Double[] consumoPorLitro = {13.00, 15.00, 16.00, 9.00, 12.00};

        double n = consumoPorLitro[0];
        int menorConsumo = 0;
        for (int i = 0; i <= marca.length -1; i++){
            if (n < consumoPorLitro[i] ){
                menorConsumo = i;
            }
        }

        System.out.println("O carro mais econômico é:" + marca[menorConsumo]);
    }
}
