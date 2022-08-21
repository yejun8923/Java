package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class dice_game {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> Int_List = new ArrayList<>();
        ArrayList<Integer> sum_List = new ArrayList<>();
        for(int i=1; i<=N; i++){
            for(int j=0; j<3; j++) {
                Int_List.add(scn.nextInt());
            }
            Int_List.sort(Collections.reverseOrder());
            sum_List.add(regulation(Int_List));
            Int_List.clear();
        }
        sum_List.sort(Comparator.reverseOrder());
        System.out.println(sum_List.get(0));
    }

    public static int regulation(ArrayList<Integer> List){
        int sum = 0;

            if(List.get(0).equals(List.get(1)) && List.get(1).equals(List.get(2))) {
                    sum = 10000 + List.get(0) * 1000;
            }
            //3개해야되는데 귀찮
            if(!List.get(0).equals(List.get(1)) && List.get(1).equals(List.get(2))) {
                    sum = 1000 + List.get(1) * 100;
            }

            if(!List.get(0).equals(List.get(1)) && !List.get(1).equals(List.get(2))) {
                    sum =  List.get(0) * 100;
            }

        return sum;
    }
}
