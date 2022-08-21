package class_test;

class Person {
    static int count; //클래스 변수

    public Person(){
        count++;
    }
}

class Math {
    public static final double PI = 3.141592;
    public static final String THIS_IS_HOW_TO_CONSTATNT_VAR = "hello";
    public static final int MIN_VALUE = 6;
    public static final int MAX_VALUE = 13;

    public static int abs(int i) {
        i *= i;
        return i;
    }
}

public class ClassVar {
    public static void main(String[] args){

        //클래스 변수와 인스 턴스 변수

        //Person.count++;

        Person p1 = new Person();


        Person p2 = new Person();

        //p2.count = p1.count;

        Person p3 = new Person();


        Person p4 = new Person();

        System.out.println(Person.count);

        System.out.println(Math.abs(-10));
    }
}
