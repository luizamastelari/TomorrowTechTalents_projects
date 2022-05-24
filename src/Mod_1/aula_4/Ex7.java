package Mod_1.aula_4;

public class Ex7 {
    public static void main(String[] args){
        String[][] exam = {{"a","b","c","b","d","c","a","a","a","b"},
                            {"a","c","a","b","d","b","a","a","a","c"},
                            {"a","d","a","b","d","a","c","b","a","b"},
                            {"d","b","c","b","d","b","a","b","a","b"},
                            {"c","c","d","b","d","b","a","c","a","b"}};

        String[] correction = {"d","b","c","b","d","b","a","b","a","b"};

        String[] students = {"Ana","Matheus","Dimitri","Yasmin","Lucio"};

        Integer[] grades = {0,0,0,0,0};

        for(int i = 0; i <= exam.length - 1; i++){
            for (int j = 0; j <= exam[0].length - 1; j++){
                if (exam[i][j].equals(correction[j])){
                    grades[i] += 1;
                }
            }
        }

        for(int i = 0; i <= students.length - 1; i++){
            System.out.println(students[i] + " = " + grades[i] + " points");
        }

    }
}
