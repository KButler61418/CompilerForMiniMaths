import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;


    public class CompilerTest {
        public static void main(String [] args) {

            String fileName = "C:\\Users\\karl\\CompilerForMiniMaths\\src\\MiniMaths.txt";
            String line = null;

            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int count = 0;

                while((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    String[] words = line.split(" ");
                    for (String w : words) {

                        if (w.equals("Int")) {
                            System.out.println("The counter = "+ count);
                            System.out.println("The code is " + w);
                            count = count + 1;
                        } else if (w.length() == 0) {
                            System.out.println("The counter = "+ count);
                            System.out.println("The code is " + w);
                            count = count + 1;
                        } else if (w.equals("=")) {
                            System.out.println("The counter = "+ count);
                            System.out.println("The code is " + w);
                            count = count + 1;
                        } else if (parseInt(w) < 10) {
                            System.out.println("The counter = "+ count);
                            System.out.println("The code is " + w);
                            count = count + 1;
                        } else if (w.equals(";")){
                            System.out.println("The counter = "+ count);
                            System.out.println("The code is " + w);
                            count = 0;
                            System.out.println("The counter should equal zero but= "+ count);
                        } else {
                            System.out.println("The counter = "+ count);
                            System.out.println("The code is " + w);
                            System.out.println("Error on line: " + line);
                        }

                        System.out.println("The code is " + w);

                    }
                }

                bufferedReader.close();
            }
            catch(FileNotFoundException ex) {
                System.out.println("Unable to open file '" + fileName + "'");
            }
            catch(IOException ex) {
                System.out.println("Error reading file '" + fileName + "'");

            }
        }
    }

