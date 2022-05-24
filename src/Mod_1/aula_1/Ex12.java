package Mod_1.aula_1;

public class Ex12 {
    private double value;
    private double percentage;

    public void finalPrice (double value, double percentage){
        percentage = percentage / 100;
        System.out.println("Final price = " + value*(percentage + 1.0));
    }
}
