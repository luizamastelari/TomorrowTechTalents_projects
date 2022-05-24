package Mod_1.aula_2;

public class Ex1 {
    private String name;
    private String className;
    private Double grades[];
    private Double tot = 0.0;


    public void gradesValue (String name, String className, Double grades[]){

        for (double value : grades) {
            tot = tot + value;
        }
        System.out.println("Sala " + className );
        System.out.println(name + " = " + tot/3);
    }
}
