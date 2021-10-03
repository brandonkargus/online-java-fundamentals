package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        String[][] randomNflTeams = {{"Vikings", "Packers", "Bears"}, {"Dolphins", "Cowboys"}, {"Patriots", "Ravens", "Lions", "Jets", "Chargers"}
        };

        for(String[] outer : randomNflTeams){
            for(String team : outer){
                System.out.println(team);
            }
        }
    }
}
