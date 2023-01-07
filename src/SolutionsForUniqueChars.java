import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class SolutionsForUniqueChars {
    public void UniqueLetters(){
        ArrayList<String> tempArr = new ArrayList<>(1017);
        try{
            File fl = new File("NewFile3Words.txt");
            Scanner sc = new Scanner(fl);
            while(sc.hasNextLine()) {
                String temp = sc.nextLine();
                tempArr.add(temp);
            }
        }catch(FileNotFoundException FNFE){
            System.out.println("File not found.");
        }
        int tempArrSize = tempArr.size();
        for(int i = 1; i < tempArrSize; i++){
            for (int j = 0; j < tempArrSize; j++) {
                if (tempArr.get(i).charAt(0) == tempArr.get(j).charAt(0)){
                    tempArr.remove(i);
                    tempArrSize = tempArrSize-1;
                }
                else if(tempArr.get(i).charAt(1) == tempArr.get(j).charAt(1)){
                    tempArr.remove(i);
                    tempArrSize = tempArrSize-1;
                }
                else if(tempArr.get(i).charAt(2) == tempArr.get(j).charAt(2)){
                    tempArr.remove(i);
                    tempArrSize = tempArrSize-1;
                }
            }
        }
        System.out.println(tempArr.size());
        System.out.println(tempArr);
    }
}
