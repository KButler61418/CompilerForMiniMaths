import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;

/* public class MAIN{
    public static void main(String[] args) {

        int count = 0;
        String fileName = "C:\\Users\\karl\\CompilerForMiniMaths\\src\\MiniMaths.txt";
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split(" ");
                for (String w : words) {

                    if (count == 0 && w.equals("Int")) {
                        Declare();
                    } else if (count == 0 && w.equals("Out")) {
                        Output();
                    } else
                        System.out.println("Error on Outputting or declaring a variable: ");
                }

                bufferedReader.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");

        }
    }

    public static void Declare() {

        System.out.println("Thanks for declaring a variable");

        /*String fileName = "C:\\Users\\karl\\CompilerForMiniMaths\\src\\MiniMaths.txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split(" ");
                for (String w : words) {

                    if (count == 0 && w.equals("Int")) {
                        Declare();
                    } else if (count == 0 && w.equals("Out")) {
                        Output();
                    } else
                        System.out.println("Error on Outputting or declaring a variable: ");


                    if (count == 0 && w.equals("Int") || (count == 0 && w.equals("Out"))) {
                        count = count + 1;
                    } else if (count == 1 && w.length() == 1) {
                        System.out.println(w);
                        count = count + 1;
                    } else if (count == 2 && w.equals("=")) {
                        System.out.println(w);
                        count = count + 1;
                    } else if (count == 3 && parseInt(w) < 10) {
                        System.out.println(w);
                        count = count + 1;
                    } else if (count == 4 && w.equals(";")) {
                        System.out.println(w);
                        count = 0;
                    } else {
                        System.out.println("Error on line: " + line);
                    }

                }
            }
            System.out.println("Code Compiled!! ");
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'"); */





