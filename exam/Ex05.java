package exam;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        if(x >= 2 && 10000 >= x && z >= 1 && x >= z) {
            int c = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    c++;
                }
            }
            int[] a = new int[c];
            int i = 0;
            for (int v = 1; v <= x; v++) {
                if (x % v == 0) {
                    a[i] = v;
                    i++;
                }
            }
            if (z > c) System.out.println("-1");
            else System.out.print(a[z - 1]);
        } else {
            System.out.println("숫자를 다시 입력 하세요");
        }
    }
}
