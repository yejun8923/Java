package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class reverse_minority {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int i=1; i<=N; i++){
            reverse(scn.nextInt());
        }
    }
    public static int reverse(int x){
        ArrayList<Integer> Int_List = new ArrayList<>();
        while (x != 0){
            Int_List.add(x % 10);
            x /= 10;
        }
        String str = String.valueOf(0);
        for(int i : Int_List){
            str += String.valueOf(i);
        }
        int k = Integer.parseInt(str);

        return isPrime(k);
    }

    public static int isPrime(int x){
        int cnt=0;
        for (int i=2; i<=x; i++){
            if (x%i == 0){
                cnt++;
            }
        }
        if(cnt == 1){
            System.out.println();
            System.out.print(x+" ");
        }
        return x;
    }
}

