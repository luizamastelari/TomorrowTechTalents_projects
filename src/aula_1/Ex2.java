package aula_1;

public class Ex2 {
    private double mass;
    private double high;
    private double time_sec;

    public void howManyHorses(double mass, double high, double time_sec){
        double horses = ((mass * high) / time_sec) / 745.6999;

        System.out.println(horses + " horses");
    }
}
