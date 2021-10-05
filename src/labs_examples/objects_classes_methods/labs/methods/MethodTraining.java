package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {

    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(a + " and " + b);   //pass by value demo, all primitive types behave this way
        passByValue(a, b);
        System.out.println(a + " and " + b);


        Person brandon = new Person("Brandon", 73, 190);  //pass by reference demo, weight value modified
        System.out.println(brandon.toString());
        passByReference(brandon);
        System.out.println(brandon.toString());


        System.out.println(largest(5, 12, 4, 13));
        System.out.println(countConsonants("aaaaa aaa.09pp09ty"));


        System.out.println(isPrime(24));
        int[] practice = new int[]{6, 7, 56, 188};
        System.out.println(highestAndLowest(practice));


        System.out.println(divisibleList(320, 4, 9));
        System.out.println(divisibleList(320, 4,9).size());


        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        reverseArray(numbers); // reverse array result printed

    }
    static void passByValue(char a, char b){ //pass by value demo, same for all primitive types
        a = 'z';
        b = 'y';
        System.out.println(a + " and " + b);
    }
    public static void passByReference(Person person){ //pass by reference demo, weight value modified
        person.weight = person.weight + 25;
    }
    private int add(int a, int b){
        return a+b;
    }
    private int add(int a, int b, int c){
        return a+b+c;
    }
    private int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    static int largest(int a, int b, int c, int d){
        int largest = a;
        if(b > a){
            largest = b;
        }if(c > largest){
            largest = c;
        }if(d > largest){
            largest = d;
        }
        return largest;
    }
    static int countConsonants(String s){
        String s2 = s.toLowerCase().replaceAll("[^a-z]", "");
        s2 = s2.replaceAll("[aeiou]", "");
        return s2.length();
    }
    static boolean isPrime(int a){
        if (a <= 1){
            return false;
        }for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    static String highestAndLowest(int[] arr){
        Arrays.sort(arr);
        int[]results = new int[2];
        results[0] = arr[arr.length-1];
        results[1] = arr[0];
        return "Highest = " + results[0] + ", Lowest = " + results[1];

    }
    static ArrayList<Integer> divisibleList(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= maxNum; i++){
            if(i % divisor1 == 0 && i % divisor2 == 0){
                nums.add(i);
            }
        }
        return nums;
    }
    static int[] reverseArray(int[] arr){           //method to reverse array
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        String result = Arrays.toString(arr);
        System.out.println(result);
        return arr;
    }

}
