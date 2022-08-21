package String;

public class String_Exam {
    public static void main(String[] args){

        //자바 인스 턴스 생성 방법
        //1. new 연산 자를 이용 하지 않고 인스 턴스를 만드는 경우
        String str1 = "hello";
        String str2 = "hello";
        // - "hello" 라는 문자열 이 메모리 중에 상수가 저장 되는 영역에 저장됨.
        // - String str2 = "hello"; 이 문장이 실행될 때 hello 라는 문자열 상수는 이미 만들 어져 있으 므로 str1이
        //참조 하는 인스 턴스를 str2도 참조 한다
        System.out.println(str1 == str2);

        // new 연산자 를 이용 해서 인스 턴스를 생성 하는 경우

        String str3 = new String("hello");
        String str4 = new String("hello");
        // - new 연산자 를 이용 하여 인스 턴스를 만들면 인스 턴스는 무조건 새롭게 만들어 진다.
        // - String str4 = new String("hello") 이 문장이 실행될 때도 새롭게 만들게 되므로 str3 과 str4는 서로 다른 인스 턴스를 참조 한다
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        // - String 은 다른 클래스 와 다르게 new 연산자 를 사용 하지 않고 쓸 수 있다.
        // - 메모리 를 아끼 려면 String 은 new 를 사용 하지 않고 사용 하는 것이 좋다.
        // - String 은 불변 클래스 이다 불변은 String 이 인스 턴스가 될 때 가지고 있던 값을 수정할 수 없다.
        // - String 이 가지고 있는 메소드 중 String 을 반환 하는 메소드 는 모두 새로운 String 을 생성 해서 반환 한다.

        String str10 = "hi";
        str10 = "hi2";
        System.out.println(str10);
        // - 문자열 자르기
        String str5 = "hello world";
        String str6 = str5.substring(3);

        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str5);
        //대소문자 변환 toUpperCase(), toLowerCase();
        String myString = "aBc";

        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
        System.out.println(myString);

        // 문자열 비교 equals()

        String str11 = "aBc";
        System.out.println(str11.toLowerCase().equals("abc"));




    }
}
