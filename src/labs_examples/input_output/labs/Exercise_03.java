package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 * <p>
 * 1) Demonstrate the usage of at least two additional Byte Streams         (USED ByteArrayInputStream, and ByteArrayOutputStream)
 * 2) Demonstrate the usage of at least two additional Character Streams    (USED StringWriter, and StringReader)
 * 3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams (USED StringBuffer on StringWriter, and
 * 4) Demonstrate the use of the DataInputStream and DataOutputStream
 */

public class Exercise_03 {
    public static void main(String[] args) {

        byte[] bytes = new byte[50];
        for (byte i = 0; i < bytes.length; i++) {
            bytes[i] = i;
        }

        try (ByteArrayInputStream bIn = new ByteArrayInputStream(bytes)) {
            System.out.println("Bytes from input stream: ");

            for (int i = 0; i < bytes.length; i++) {
                int a = bIn.read();
                System.out.print(a + ", ");
            }

        } catch (IOException ex) {
            System.out.println("Something went wrong");
            ex.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------");

        String myName = "Brandon John Kargus";
        try (ByteArrayOutputStream bOut = new ByteArrayOutputStream()) {
            byte[] arr = myName.getBytes();

            bOut.write(arr);
            String stream = bOut.toString();
            System.out.println("Output stream: " + stream);
        } catch (IOException ex) {
            System.out.println("Something went wrong in second try/catch");
            ex.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------");


        String str = "This is an example of using the StringReader character stream";
        int i = 0;
        try (StringReader s = new StringReader(str)) {
            while((i = s.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException exc){
            System.out.println("Problem with StringReader");
            exc.printStackTrace();
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        String s = "This is an example of ";
        String s2 = "a StringWriter using a String Buffer";

        StringWriter output = new StringWriter();
        output.write(s);
        System.out.println(output.toString());
        StringBuffer sb = output.getBuffer();
        sb.append(s2);
        System.out.println(output.toString());
        System.out.println("-----------------------------------------------------------------");

    }

}
