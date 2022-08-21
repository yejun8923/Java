package exam;

import java.util.Scanner;

public class Ex05_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        if(x > 1 && 10000 >= x && z >= 1 && x >= z) {
            int c = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    c++;
                }
                if (c == z){
                    System.out.println(i);
                    break;
                }
            }
            if(c < z) System.out.println("-1");
            
        } else {
            System.out.println("숫자를 다시 입력 하세요");

        }
    }
}
