package aula_3;

public class L3_ex5 {
    private double weight;
    private double hight;

    public void howIMC (double weight, double hight){
        double imc = weight / (Math.pow(hight, 2));

        if (imc < 18.5){
            System.out.println("Abaixo do peso = " + imc);
        } else if (imc >= 18.5 || imc <= 24.9){
            System.out.println("Peso normal = " + imc);
        } else if (imc >= 25 || imc <= 29.9){
            System.out.println("Excesso de peso = " + imc);
        } else if (imc >= 30){
            System.out.println("Obesidade = " + imc);
        }
    }
}
