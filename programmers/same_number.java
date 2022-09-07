package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class same_number {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        int a = 10;
        for(int i : arr){
            if(a != i){
                list.add(i);
            }
            a = i;
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        same_number same_number = new same_number();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(same_number.solution(arr)));

    }
}
