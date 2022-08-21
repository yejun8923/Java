package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Alive {
    public static int getSurvivingIndex(int n, int k) {
        // 코드를 입력 하세요.
        ArrayList<Integer> IntList = new ArrayList<>();
        for(int i=0; i<n; i++){
            IntList.add(i+1);
        }
        int v = k - 1;
        for(int i=0; i<n-1; i++) {
                System.out.println(IntList.remove(v) + "번 군사가 죽습니다.");
                v += k - 1;
                if (v >= IntList.size()) {
                    v = v - IntList.size();
                    if(v >= IntList.size()){
                        v -= IntList.size();
                    }
                }
        }
        return IntList.get(0);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println("김장군 은 " + getSurvivingIndex(n, k) + "번 자리에 서 있으면 됩니다.");
    }
}