package Number;

import java.util.Random;

public class Number_Exam {
    public static void main(String[] args){
        //숫자와 관련된 클래스
        //Math 클래스

        System.out.println(Math.abs(-1189));
        System.out.println(Math.max(25,29));
        System.out.println(Math.min(18,11));
        System.out.println(Math.random());

        // Random 클래스

        Random rand = new Random();
        System.out.println(rand.nextInt(10));

        int min = 10;
        int max = 30;
        int ab = max-min+1;
        System.out.println(rand.nextInt(min,max+1));
        System.out.println(rand.nextInt(ab)+min);
    }
}
