package Mod_1.aula_3;

public class L3_ex3 {

    public void countMultipleTen(){
        for (int i = 0; i <= 100; i++){
            if(i % 10 == 0){
                System.out.println("Multiplo de 10 = " + i);
            } else {
                System.out.println(i);
            }
        }
    }
}
