package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;


public class CSV_Parse_Guitar {
    public static void main(String[] args) {


        File guitarCSV = new File("src/labs_examples/input_output/files/guitars.csv");

        ArrayList<Guitar> guitars = new ArrayList<>();


        try (BufferedReader br =
                     new BufferedReader(new FileReader(guitarCSV))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                guitars.add(mapValuesToGuitarObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Guitar g : guitars) {
            System.out.println(g.toString());
        }
        int i;
        try (FileWriter fw = new FileWriter("src/labs_examples/input_output/files/guitarsWrite.csv");
             BufferedWriter bw = new BufferedWriter(fw);
             FileReader fr = new FileReader("src/labs_examples/input_output/files/guitars.csv");
             BufferedReader br = new BufferedReader(fr)) {


            do {
                i = br.read();
                if (i != -1) {
                    bw.write(i);
                }

            } while (i != -1);

        } catch (IOException ex) {
            System.out.println("Something came up when writing to guitarsWrite.csv....");
            ex.printStackTrace();

        }


    }

    private static Guitar mapValuesToGuitarObject(String[] values) {

        Guitar guitar = new Guitar();

        guitar.setSerialNumber(Integer.parseInt(values[0]));
        guitar.setManufacturer(values[1]);
        guitar.setModel(values[2]);
        guitar.setColor(values[3]);
        guitar.setStrings(Integer.parseInt(values[4]));
        guitar.setElectric(Boolean.parseBoolean(values[5]));

        return guitar;

    }

}
