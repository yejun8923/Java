package exam;

import java.util.Scanner;

import static java.lang.Math.*;

public class Ex09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        int[] score = new int[N];
        int count = 0;
        double z = 0;
        if(N >= 5 && N <= 100){
            for(int i=0; i<N; i++){
                S[i] = scanner.nextInt();
                z += S[i];
            }
            int x = Integer.parseInt(String.format("%.0f", z / N));
            for(int i=0; i<N; i++){
                score[i] = abs(S[i] - x);
            }
            int min = score[0];
            int max = score[0];
            for(int i=0; i<N; i++){
                if(score[i] < min){
                    min = score[i];
                }
                if (S[i] > max && score[i] <= min) {
                    max = S[i];
                }
            }
            for(int i=0; i<N; i++){
                count++;
                if(S[i] >= x && score[i] <= min){
                    break;
                } else if(S[i] <= x && score[i] <= min ){
                    if(S[i] >= max && score[i] <= min){
                        break;
                    }
                }
            }
            System.out.println(x+" "+count);
        } else{
            System.out.println("N을 다시 입력");
        }
    }
}
