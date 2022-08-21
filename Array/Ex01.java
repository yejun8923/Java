package Array;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i=0; i<10; i++){
            nums.add(i);
        }

        for(int i=0; i<nums.size(); i++){
            System.out.println(i+": "+nums.get(i));
        }

        nums.remove(0);

        for(int i=0; i<nums.size(); i++){
            System.out.println(i+": "+nums.get(i));
        }

        nums.remove(5);

        for(int i=0; i<nums.size(); i++){
            System.out.println(i+": "+nums.get(i));
        }
    }
}
