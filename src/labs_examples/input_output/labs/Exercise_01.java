package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;
        BufferedInputStream buffIn = null;
        BufferedOutputStream buffOut = null;                       //successfully used BufferedInput/Output to write data from "KtoD.txt" to "exampleBIS.txt
                                                                    // ( also wrote to "char_data.txt" before I realized I needed to create a new file myself :| )

        try {
            buffIn = new BufferedInputStream(new FileInputStream("src/labs_examples/input_output/files/KtoD.txt"));
            buffOut = new BufferedOutputStream(new FileOutputStream("src/labs_examples/input_output/files/exampleBIS.txt"));

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while((bytesRead = buffIn.read(buffer)) != -1){
                buffOut.write(buffer, 0, bytesRead);
            }

        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            try {
                buffIn.close();
                buffOut.close();
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }

    }
}