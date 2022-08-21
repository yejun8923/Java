package Wrapper;

public class Wrapper_Exam {
    public static void main(String[] args){
        /*
          Wrapper 클래스 는 기본 자료형 을 객체 형식 으로 감싸는 역할을 한다
          Integer 클래스 는 int 형을, Double 클래스 는 double 형을 Boolean 클래스 는 boolean 을 감싼다
          기본 자료형 을 참조형 처럼 다루 어야 할 때 사용 한다
         */

        Integer i = new Integer(123);
        Integer i2 = 123;

        System.out.println(123 == 123);
        //System.out.println(new Integer(123) = new Integer(123));
        System.out.println(new Integer(123).equals(new Integer(123)));
    }
}
