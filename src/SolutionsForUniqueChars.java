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
        for(int i = 0; i < tempArr.size(); i++){
            for(int j = 0; i < tempArr.size(); i++){
                if(tempArr.get(i).charAt(2) != tempArr.get(j).charAt(2)){
                    if(tempArr.get(i).charAt(1) != tempArr.get(j).charAt(1)){
                        if(tempArr.get(i).charAt(0) != tempArr.get(j).charAt(0)){
                            solutions.add(tempArr.get(i));
                        }
                    }
                }
            }
        }
        System.out.println(solutions.size());
        System.out.println(solutions);
    }
}
