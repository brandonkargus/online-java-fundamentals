package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.             (COMPLETE, see "encryptionExample.txt")
 * <p>
 * Then, read back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?           (YES)
 */

public class Exercise_02 {
    public static void main(String[] args) {
        int i;

        try (FileWriter fw = new FileWriter("src/labs_examples/input_output/files/encryptionExample.txt");
             BufferedWriter bw = new BufferedWriter(fw);
             FileReader fr = new FileReader("src/labs_examples/input_output/files/char_data_2.txt");
             BufferedReader br = new BufferedReader(fr)) {


            do {
                i = br.read();
                if (i != -1) {
                    if ((char) i == 'a')
                        i = '-';
                    if ((char) i == 'e')
                        i = '~';
                    bw.write(i);
                }

            } while (i != -1);

        } catch (IOException ex) {
            System.out.println("You clearly aren't understanding this...seek help.");
            ex.printStackTrace();

        }

        try (FileReader fr = new FileReader("src/labs_examples/input_output/files/encryptionExample.txt");
             BufferedReader br = new BufferedReader(fr)) {

            do {
                i = br.read();
                if (i != -1) {
                    if ((char) i == '-')
                        i = 'a';
                    if ((char) i == '~')
                        i = 'e';
                    System.out.print((char) i);
                }

            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("This happened during the second portion...");
            exc.printStackTrace();
        }
    }


}


