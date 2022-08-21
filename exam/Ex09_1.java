package exam;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Ex09_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        int score, count =0, score2 = 0;
        double z = 0;
        if(N >= 5 && N <= 100){
            for(int i=0; i<N; i++){
                S[i] = scanner.nextInt();
                z += S[i];
            }
            int x = Integer.parseInt(String.format("%.0f", z / N));
            for(int i=0; i<N; i++){
                score = abs(S[i] - x);
                if(score <  z){
                    z = score;
                    score2 = S[i];
                    count = i+1;
                }
                else if(score == z) {
                    if(S[i] > score2) {
                        score2 = S[i];
                        count = i+1;
                    }
                }
            }
            System.out.println(x+" "+count);
        } else{
            System.out.println("N을 다시 입력");
        }
    }
}
