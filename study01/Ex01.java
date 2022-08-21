package study01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){

        // 기본형과 참조형
        // 기본데이터타입 = 변수가 값을 저장하고 있다.
        int a = 3;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        a = 4;

        System.out.println(a);
        System.out.println(b);

        //참조데이터타입 값을 저장하는 것이 아니라, 변수가 값을 가리킨다 혹은 변수는 주소값을 가지고 있다
        //배열은 참조형

        int[] z = new int[3];
        int[] x = z;
        //같은 곳을 가르킨다

        z[0] = 1;
        x[0] = 2;

        System.out.println(z[0]);
        System.out.println(x[0]);

        //=========================
        /* 정수형(byte,short,int,long) 기본(int)
           실수형(float,double) 기본(double)
           문자형(char)
           논리형(boolean) 이걸제외한 나머지는 참조형데이터타입

           ==String
         */
        /*
        String str = "hello";
        int num = 10;
        char chr = 'a';

        Scanner sc = new Scanner(System.in);

        String a1 = new String();
        a1 = "hi";
        */
        String a1 = new String();
        String a2 = a1;

        a1="hello";
        a2="hi";

        System.out.println(a1);
        System.out.println(a2);
        //String은 다른 참조형과 달리 값을 보관가능

        String s1 ="hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);//주소번지비교
        System.out.println(s3.equals(s4));//순수 값 비교


    }
}
