package ArrayList;

import java.util.ArrayList;

public class ArrayList_Exam2 {
    public static void main(String[] args){

        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("유재석");
        nameList.add("박명수");
        nameList.add("정준하");
        nameList.add("정형돈");

        System.out.println(nameList.size());
        System.out.println(nameList.get(0));

        nameList.remove(1);
        System.out.println(nameList.size());
        System.out.println(nameList);
    }
}
