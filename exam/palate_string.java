package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class palate_string {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> St_List = new ArrayList<>();
        ArrayList<String> re_List = new ArrayList<>();
        int N  = scn.nextInt();
        for(int i=0; i<N; i++){
            St_List.add(scn.next().toLowerCase());
            StringBuffer sb = new StringBuffer(St_List.get(i));
            re_List.add(sb.reverse().toString().toLowerCase());
        }

        for (int i=0; i<St_List.size(); i++){
            if(St_List.get(i).equals(re_List.get(i))){
                System.out.println("#"+(i+1)+" YES");
            } else{
                System.out.println("#"+(i+1)+" NO");
            }
        }
    }
}
