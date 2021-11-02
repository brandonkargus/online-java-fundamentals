package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 * <p>
 * 1) Demonstrate the usage of at least two additional Byte Streams         (DONE ByteArrayInputStream, and ByteArrayOutputStream)
 * 2) Demonstrate the usage of at least two additional Character Streams    (DONE StringWriter, and StringReader)
 * 3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams (DONE StringBuffer on StringWriter, and BufferedInputStream on ByteArrayInputStream)
 * 4) Demonstrate the use of the DataInputStream and DataOutputStream (DONE DataInputStream in readFile(), DataOutputStream in writeFile())
 */

class Exercise_03 {
    String s = "I'm using this string to demonstrate reading and/or writing to files";

    public void readFile() {
       try  (FileInputStream fIs = new FileInputStream("src/labs_examples/input_output/files/encryptionExample.txt");
             DataInputStream dIs = new DataInputStream(fIs)) {

           int i;
           while ((i=dIs.read()) != -1){
               System.out.print((char) i);
           }

       } catch (IOException ex){
           System.out.println("Something went wrong with the DataInputStream");
           ex.printStackTrace();
       }

    }
    public void writeFile(){
       try (FileOutputStream fOs = new FileOutputStream("src/labs_examples/input_output/files/dataOutputExample.txt");
            DataOutputStream dOs = new DataOutputStream(fOs)) {

            byte[] b = s.getBytes();
            dOs.write(b);
            dOs.flush();
           System.out.println("Check dataOutputExample.txt to verify successful file write....");

       } catch (Exception e){
           System.out.println("Issue with DataOutputStream...");
           e.printStackTrace();
       }

    }
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
            while ((i = s.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException exc) {
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

        try (BufferedInputStream bIS = new BufferedInputStream(new ByteArrayInputStream(bytes))) {
            for (byte b = 0; b < bytes.length / 2; b++) {
                bytes[b] = b;
            }

            System.out.println("Bytes from input stream (first half): ");

            for (int a = 0; a < bytes.length / 2; a++) {
                a = bIS.read();
                System.out.print(a + ", ");
            }

        } catch (IOException ex) {
            System.out.println("Something went wrong with BufferedInputStream");
            ex.printStackTrace();
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        Exercise_03 dis = new Exercise_03();
        dis.readFile();

        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        dis.writeFile();

    }

}


