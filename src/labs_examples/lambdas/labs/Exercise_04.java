package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 * <p>
 * Stream API Labs
 * <p>
 * 1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive) (DONE)
 * 2) Demonstrate the use of the sum function to determine the range of a set of numbers. (DONE)
 * 3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 * to get the sum of the modified list (DONE)
 * 4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 * function to average the remaining numbers, assign this result to an int variable. (DONE)
 * 5) Demonstrate the reduce() function to determine the sum of a list of Integers
 * 6) Demonstrate how to Stream a text file and print out each line (DONE)
 * 7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the element at the 1 index for each array. (DONE)
 * 8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the sum of all elements at index 2. (DONE)
 * 9) Demonstrate the anyMatch() function. (DONE)
 * 10) Demonstrate the allMatch() function. (DONE)
 * 11) Demonstrate the collect() terminal operation to store resulting values into a List (DONE)
 */

class Example {
    public static void main(String[] args) throws IOException {
        IntStream.range(1, 16).forEach(System.out::println);   // 1.

        System.out.println(IntStream.range(7, 34343).sum());   // 2.

        System.out.println(Arrays.stream(new int[]{334, 45, 565, 76, 87}).map(x -> x + 7).sum());  // 3.

        int result = (int) Arrays.stream(new int[]{45, 7, 2, 3, 190, 78, 5}).filter(x -> x > 10).average().getAsDouble();  // 4.

        List<Integer> numbers = Arrays.asList(56, 7, 3, 2, 89, 100);
        int sum = numbers.stream().reduce(0, (x, y) -> x + y);     // 5.
        System.out.println(sum);


        String bandsFile = "src/labs_examples/lambdas/examples/stream_api/example_files/bands.txt";
        String dataFile = "src/labs_examples/lambdas/labs/stream_text_lab.csv";

        Stream<String> groups = Files.lines(Paths.get(bandsFile));     // 6.
        groups.forEach(System.out::println);
        groups.close();

        Stream<String> rows = Files.lines(Paths.get(dataFile));
        rows.map(x -> x.split(",")).filter(x -> x[1].length() > 0).forEach(x -> System.out.println(x[1]));
        rows.close();                                                                                                 // 7.

        Stream<String> rows1 = Files.lines(Paths.get(dataFile));
        double sum1 = rows1.map(x -> x.split(",")).filter(x -> Double.parseDouble(x[2]) > 0).mapToDouble(x -> Double.parseDouble(x[2])).sum();    // 8.
        System.out.println(sum1);
        rows1.close();

        List<Integer> nums = Arrays.asList(5, 6, 3, 2, 8, 9, 90, 12, 67, 98, 45, 343, 454, 7676, 232, 3454);    // 9.
        boolean ans = nums.stream().anyMatch(n -> n / 3 + 4 == 6);
        System.out.println(ans);

        boolean ans2 = nums.stream().allMatch(n -> n / 4 + 12 == 11);    // 10.
        System.out.println(ans2);

        List<Integer> evens = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());    // 10.
        System.out.println(evens);
    }

}