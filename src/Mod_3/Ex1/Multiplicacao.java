package Mod_3.Ex1;

public class Multiplicacao implements Calculo{
    private Double num1;
    private Double num2;

    public Multiplicacao(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calcular() {
        Double result = this.num1 * this.num2;
        System.out.println(this.num1 + " x " + this.num2 + " = " + result);
    }
}
