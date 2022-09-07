package programmers;

import java.util.Arrays;

public class mock_test {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] user1={1,2,3,4,5};
        int[] user2={2,1,2,3,2,4,2,5};
        int[] user3={3,3,1,1,2,2,4,4,5,5};
        int[] cnt={0,0,0};
        int score1 =0, score2 = 0 ,score3 = 0;

        for (int j : answers) {
            if (user1[cnt[0]++] == j)
                score1++;
            if (user2[cnt[1]++] == j)
                score2++;
            if (user3[cnt[2]++] == j)
                score3++;

            if (cnt[0] >= user1.length)
                cnt[0] = 0;
            if (cnt[1] >= user2.length)
                cnt[1] = 0;
            if (cnt[2] >= user3.length)
                cnt[2] = 0;
        }

        int max = Math.max(score1,Math.max(score2, score3));

        int result =0;


            if(score1 == max){
                result++;
            }
            if(score2 == max){
                result++;
            }
            if(score3 == max){
                result++;
            }


        answer = new int[result];


            if( score1==max )
                answer[0]=1;
            if( score2==max )
                answer[1]=2;
            if( score3==max )
                answer[2]=3;



        return answer;
    }

    public static void main(String[] args) {
        mock_test mock = new mock_test();
        int[] a = {1,2,3,4,5};
        int[] b = {1,3,2,4,2};
        System.out.println(Arrays.toString(mock.solution(a)));
        System.out.println(Arrays.toString(mock.solution(b)));
    }
}
