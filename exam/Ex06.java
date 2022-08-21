package exam;

import java.util.*;

public class Ex06 {
        public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int t = scanner.nextInt();
            int[] v;
            int[] b;
            int e;
            int k;
         if(t <= 1 || t >= 10){
             System.out.print("t 다시 입력 : ");
             t = scanner.nextInt();
         }
            int[] c= new int[t];
         for(int i=1; i<=t; i++){
             int n = scanner.nextInt();
             if(5 >= n || n >= 500){
                 System.out.print("n 다시 입력 :");
                 n = scanner.nextInt();
             }
             int s = scanner.nextInt();
             e = scanner.nextInt();
             k = scanner.nextInt();
             v = new int[n];
             b = new int[e-1];
             for(int j=0; j<v.length; j++){
                 v[j] = scanner.nextInt();
             }
             for(int x=s-1; x<e-1; x++){
                 b = v;
             }
             Arrays.sort(b);

                 c[i-1] = b[k];

            //int[] b = Arrays.copyOfRange(a,s-1, e);
         }
         for(int i=0; i<t; i++) {
             System.out.println("#"+(i+1)+" "+c[i]);
         }
        }
    }
