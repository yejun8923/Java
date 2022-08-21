package exam;

import java.util.Scanner;

public class minority {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int cnt = 0;
        int cnt2 = 0;
        if(N >= 2 && N <= 200000){
            for (int i=2; i<=N; i++){
                for(int j=2; j<=i; j++){
                    if(i%j==0){
                        cnt++;
                    }
                }
                if(cnt==1){
                    cnt2++;
                    System.out.print(i+" ");
                }
                cnt=0;
            }
            System.out.println();
            System.out.println(cnt2);
        } else {
            System.out.println("false");
        }
    }
}
