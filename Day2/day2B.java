package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class day2B {

    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        int totalLength = 0;
        try {
            File myObj = new File("Day2/day2.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              data.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for(int i = 0; i < data.size(); i++) {
            String[] lwh = data.get(i).split("x");
            int length = Integer.parseInt(lwh[0]);
            int width = Integer.parseInt(lwh[1]);
            int height = Integer.parseInt(lwh[2]);

            int perimeter1 = 2*(length+width);
            int perimeter2 = 2*(width+height);
            int perimeter3 = 2*(height+length);
            int smallestPerimeter = Math.min(Math.min(perimeter1, perimeter2), perimeter3);
            int volume = Integer.parseInt(lwh[0]) * Integer.parseInt(lwh[1]) * Integer.parseInt(lwh[2]);

            totalLength += smallestPerimeter + volume;
        }
        System.out.println(totalLength);
    }
    
}
