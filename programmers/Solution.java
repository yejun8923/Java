package programmers;

import java.util.HashMap;
public class Solution {
    public String solution(String[] survey, int[] choices){
        // 완성 X
        String answer = "";

        HashMap<String,Integer> sol = new HashMap<>();

        sol.put("R",0);
        sol.put("T",0);
        sol.put("C",0);
        sol.put("F",0);
        sol.put("J",0);
        sol.put("M",0);
        sol.put("A",0);
        sol.put("N",0);


        for(int i=0; i< survey.length; i++){
            if (choices[i] > 4){
                char c = survey[i].charAt(1);
                sol.put(String.valueOf(c), sol.get(String.valueOf(c)) + choices[i] - 4);
            }
            else if (choices[i] < 4) {
                char c = survey[i].charAt(0);
                sol.put(String.valueOf(c), sol.get(String.valueOf(c)) + 4 - choices[i]);
            }
        }

        if(sol.get("R") < sol.get("T")){
            answer += "T";
        } else  {
            answer += "R";
        }

        if(sol.get("C") < sol.get("F")){
            answer += "F";
        } else  {
            answer += "C";
        }

        if(sol.get("J") < sol.get("M")){
            answer += "M";
        } else {
            answer += "J";
        }

        if(sol.get("A") < sol.get("N")){
            answer += "N";
        } else {
            answer += "A";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = new int[survey.length];
        choices[0] = 5;
        choices[1] = 3;
        choices[2] = 2;
        choices[3] = 7;
        choices[4] = 5;


        System.out.println(solution.solution(survey,choices));
    }
}
