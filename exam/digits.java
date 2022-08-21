package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> sum_list = new ArrayList<>();
        if(3<= N && N <= 100)
        for(int i=0; i<N; i++){
            list.add(scn.nextInt());
            sum_list.add(digit_sum(list.get(i)));

        }
        int m = Collections.max(sum_list);
        for(int i=0; i<sum_list.size(); i++){
            if(sum_list.get(i).equals(m)){
                System.out.println(list.get(i));
                break;
            }
        }
    }
    public static int digit_sum(int x){
        int z=0;
        while (x != 0){
           z += x % 10;
           x /= 10;
        }
        return z;
    }
}

