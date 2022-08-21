package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class SurviveKim {
    public static int getSurvivingIndex(int n, int k) {
        // 코드를 입력 하세요.
        ArrayList<Integer> soldiers = new ArrayList<>();
        for(int i=1; i<=n; i++){
            soldiers.add(i);
        }

        ArrayList<Integer> corpse_List = new ArrayList<>();

        while(soldiers.size()>=2){
            for(int i=1; i<=k-1; i++){
                    soldiers.add(soldiers.get(0));
                    soldiers.remove(0);
            }
            corpse_List.add(soldiers.get(0));
            soldiers.remove(0);
        }
        for(int i : corpse_List){
            System.out.println(i+"번째 군사가 죽습니다 ");
        }
        return soldiers.get(0);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println("김장군 은 " + getSurvivingIndex(n, k) + "번 자리에 서 있으면 됩니다.");
    }
}