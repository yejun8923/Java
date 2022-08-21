package ArrayList;

public class ArrayList_Exam {
    public static void main(String[] args){
        String[] nameArray = new String[5];
        nameArray[0] = "유재석";
        nameArray[2] = "박명수";
        nameArray[3] = "정준하";
        nameArray[4] = "하하";

        for(String name : nameArray){
            System.out.println(name);
        }

    }
}
