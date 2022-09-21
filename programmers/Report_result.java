package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Report_result {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        HashMap<String, HashSet<String>> s_map = new HashMap<String, HashSet<String>>();

        for(int i=0; i< id_list.length; i++) {
            map.put(id_list[i], i);
            s_map.put(id_list[i],new HashSet<>());
        }


        for(int i=0; i< report.length; i++){
            String[] key = report[i].split("\\s");
            s_map.get(key[1]).add(key[0]);
        }

        for (int i=0; i< id_list.length; i++) {
            HashSet<String> set = s_map.get(id_list[i]);
            if(set.size() >= k){
                for(String name : set){
                    answer[map.get(name)]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Report_result result = new Report_result();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        String[] id_list1 = {"con", "ryan"};
        String[] report1 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k1 = 3;


        System.out.println(Arrays.toString(result.solution(id_list, report, k)));
        System.out.println(Arrays.toString(result.solution(id_list1, report1, k1)));
    }
}