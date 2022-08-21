package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();

        for(int i=1; i<=6; i++){
            name.add(scn.next());
        }

        for (String s : name) {
            if (s.substring(0, 1).equals("김")) {
                System.out.println(s);
            }
        }


    }
}
