package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1B {

    public static void main(String[] args) {
        String data = "";
        int floor = 0;
        try {
            File myObj = new File("Day1/day1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              data = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for(int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if(c == '('){
                floor++;
            }
            else if(c ==')') {
                floor--;
            }
            if(floor == -1) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
