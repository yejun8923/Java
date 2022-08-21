package exam;

import java.util.Scanner;

public class number_in {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        str = str.replaceAll("[^0-9]", "");

        int num = Integer.parseInt(str);

        int cnt = 0;

        for (int i=1; i<=num; i++){
            for (int j=1; j<=num; j++){
                if(i*j==num){
                    cnt++;
                }
            }
        }
        System.out.println(num+"\n"+cnt);
    }
}
