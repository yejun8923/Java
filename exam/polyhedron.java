package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class polyhedron {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        ArrayList<Integer> highlist = new ArrayList<>();
        int max = 0;
        int min = 0;
        if(N % 2 == 0 && M % 2 == 0){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=M; j++){
                    highlist.add(i+j);
                }
                if(i == 1) max = Collections.max(highlist);
                if(i == N) min = Collections.min(highlist);
                highlist.clear();
            }
            if(N <= M) {
                for (int i = min; i <= max; i++) {
                    System.out.println(i);
                }
            }else {
                for (int i = max; i <= min; i++) {
                    System.out.println(i);
                }
            }


        }else System.out.println("false");

    }
}
