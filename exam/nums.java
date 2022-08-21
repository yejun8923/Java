package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class nums {
    public static void main(String[] args) {
        ArrayList<Integer> num_list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int M = scn.nextInt();
        int cnt = 0;
        for (int i=0; i<N; i++){
            num_list.add(scn.nextInt());
        }

        int s=0,e=0,i=0,sum=0;
        while (true){
            if(i==0){
                sum = num_list.get(s);
            }else{
                for(int j=s; j<=e; j++){
                    sum += num_list.get(j);
                }
            }

            if(sum==M){
                cnt++;
            } if(sum<=M){
                e++;
            } if(sum>=M){
                s++;
            }
            sum = 0;
            i++;
            if(e==num_list.size()){
                break;
            }
        }
        System.out.println(cnt);
    }
}
