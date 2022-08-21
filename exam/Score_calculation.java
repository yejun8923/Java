package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Score_calculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int sum = 0;
        int cnt = 0;
        ArrayList<Integer> Int_List = new ArrayList<>();
        for (int i=1; i<= N; i++){
            Int_List.add(scn.nextInt());
        }
        for (int i=0; i< Int_List.size(); i++){
            if (Int_List.get(i) == 1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        System.out.println(sum);
    }
}
