package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put() (DONE)
 *  get() (DONE)
 *  putAll() (DONE)
 *  size() (DONE)
 *  contains() (DONE)
 *  keySet() (DONE)
 *  entrySet() (DONE)
 *  putIfAbsent() (DONE)
 *  remove() (DONE)
 *  replace() (DONE)
 *  forEach() (DONE)
 *  clear() (DONE)
 *
 */
class Exercise_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> fbScores = new HashMap<>();
        HashMap<String, Integer> bbScores = new HashMap<>();

        bbScores.put("Twins", 2);
        bbScores.put("Diamondbacks", 5);

        fbScores.put("Vikings", 7);
        fbScores.put("Bears", 4);
        fbScores.put("Packers", 1);

        fbScores.get("Vikings");

        fbScores.putAll(bbScores);

        int listSize = fbScores.size();

        boolean hasTigers = bbScores.containsKey("Tigers");

        System.out.println(fbScores.keySet());

        System.out.println(bbScores.entrySet());

        bbScores.putIfAbsent("Cubs", 3);

        fbScores.remove("Packers");

        fbScores.replace("Bears", 2);

        System.out.println(fbScores);

        fbScores.forEach((key, value) -> value = value + 10);

        System.out.println(fbScores);

        bbScores.clear();





    }
}