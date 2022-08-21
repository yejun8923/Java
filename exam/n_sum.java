package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class n_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> num_list = new ArrayList<>();
        int N = scn.nextInt();
        int M = scn.nextInt();
        int cnt =0;
        for(int i =1; i<=N; i++){
            num_list.add(i);
        }

        for (int i=0; i<N; i++){
            for (int j=1; j<N; j++){

                if(num_list.get(i)==M){
                    cnt++;
                } else if(num_list.get(i)+num_list.get(j)==M){
                    cnt++;
                } else if(num_list.get(i)+num_list.get(j)==M){
                    cnt++;
                }
            }
        }


    }
}
