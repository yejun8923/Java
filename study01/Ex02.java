package study01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){

        // null
        // java에서 비어잇음을 뜻함
        // 참조형 변수에만 널 값을 넣을 수 있음

        //Person p1 = null;
        //System.out.println(p1);

        // null을 보관하고 있는 변수의 메소드 호출
        //p1.getName();
        Person[] people = new Person[5];

        people[0] = new Person("유재석", 54);
        people[2] = new Person("박명수",57);
        people[3] = new Person("정준하",56);
        people[4] = new Person("하동훈",49);

        for(int i=0; i< people.length; i++){
            if(people[i] != null) {
                System.out.println(people[i].getName());
            }
            else {
                System.out.println(i + "번 자리가 비어있습니다");
            }
        }
    }
}
