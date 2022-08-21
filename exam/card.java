package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class card {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> num_list = new ArrayList<>();

        for(int i=1; i<=20; i++){
            num_list.add(i);
        }
        int cnt =0;
        while(cnt <10){
            int A = scn.nextInt();
            int N = scn.nextInt();
            ArrayList<Integer> set_list = new ArrayList<>();
            for(int i=N; i>=A; i--) {
                set_list.add(i);
            }
            for(int i=A; i<=N-1; i++){
                int v = 0;
                num_list.set(i-1,set_list.get(v));
                v++;
            }
            set_list.clear();
            cnt++;
        }
        for (int i : num_list){
            System.out.println(i);
        }
        num_list.set(0,10);
        System.out.println(num_list);
    }
}
