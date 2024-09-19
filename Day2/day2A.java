package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day2A {

    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        int totalArea = 0;
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

            int area1 = length*width;
            int area2 = width*height;
            int area3 = height*length;

            int area = 2*(area1 + area2 + area3);
            int smallest = Math.min(Math.min(area1, area2), area3);
            area += smallest;
            totalArea += area;
        }
        System.out.println(totalArea);
    }
    
}
