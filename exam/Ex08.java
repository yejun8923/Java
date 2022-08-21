package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> IntList = new ArrayList<>();
        if(3<=n && n <=100 && 1<=k && k<=50) {
            for(int i=0; i<n; i++){
                a.add(sc.nextInt());

            }
            for(int i=0; i<n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a.get(i).equals(a.get(j))) {
                        a.remove(j);
                    }
                }
            }
            a.sort(Collections.reverseOrder());
            // - Collections.sort(a,Collections.reverseOrder());
            // - a.sort(Comparator.reverseOrder());
            for(int i=0; i<a.size(); i++){
                for(int j=i+1; j<a.size(); j++){
                    for(int h=j+1; h<a.size(); h++){
                        IntList.add(a.get(i) + a.get(j) + a.get(h));
                    }
                }
            }

            System.out.println(IntList.get(k-1));
        }else{
            System.out.println("false");
        }
    }
}
