import java.io.*;
import java.util.Scanner;

public class InputReader {
    public void ReaderAndSorter() {
        try {
            File fl = new File("3WordOGFile.txt");
            PrintStream output = new PrintStream(new FileOutputStream("NewFile3Words.txt", true));
            Scanner sc = new Scanner(fl);
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                if (Character.isLetter(temp.charAt(0)) && Character.isLetter(temp.charAt(1)) && Character.isLetter(temp.charAt(2))) {
                    String newStr = temp.toLowerCase();
                    output.println(newStr);
                }
            } output.close();
        } catch (FileNotFoundException FNFE) {
            System.out.println("File not found.");
        }
    }
}

