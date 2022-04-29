package aula_3;

public class L3_ex1 {
    private Double grades[];


    public static void approvedOrNot (Double grades[]){
        double tot = 0;

        for (double value : grades) {
            tot = tot + value;
        }

        if(tot/4.0 >= 7.0){
            System.out.println("You were approved!");
        } else {
            System.out.println("You didn't pass");
        }
    }
}
