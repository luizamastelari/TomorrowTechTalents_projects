package aula_1;

public class Ex3 {
    private double value;
    private int months;

    public void totalPaid (double value, int months){
        double fee = value * Math.pow(1.02,months);
        System.out.println("Valor total será: " + fee);
    }
}
