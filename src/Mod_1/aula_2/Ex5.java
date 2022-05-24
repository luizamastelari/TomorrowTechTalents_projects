package Mod_1.aula_2;

public class Ex5 {
    private Double time;
    private Double velocity;

    public void howManyLiters (double time, double velocity){
        double distance = time * velocity;
        double totalLiters = distance / 12;

        System.out.println("Total: " + totalLiters +"L");
    }
}
