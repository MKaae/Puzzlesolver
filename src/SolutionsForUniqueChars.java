import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class SolutionsForUniqueChars {
    public void UniqueLetters() {
        ArrayList<String> tempArr = new ArrayList<>();
        ArrayList<String> solutions = new ArrayList<>();
        try {
            File fl = new File("NewFile3Words.txt");
            Scanner sc = new Scanner(fl);
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                tempArr.add(temp);
            }
        } catch (FileNotFoundException FNFE) {
            System.out.println("File not found.");
        }
        for(String str : tempArr){
            boolean isDuplicate = false;
            for (String solution : solutions) {
                if (str.charAt(0) == solution.charAt(0) ||
                        str.charAt(1) == solution.charAt(1) ||
                        str.charAt(2) == solution.charAt(2)) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                solutions.add(str);
            }
        }
        System.out.println(solutions.size());
        System.out.println(solutions);
    }
}