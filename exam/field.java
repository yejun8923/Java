package exam;

import java.util.Scanner;

public class field {
    String string;
    public void menu(){
        System.out.println("(I)ntro   (C)ourses   (E)xit");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        string = str;

        if(str.equals("e")) {
            System.out.println("안녕히 가세요.");
            Exit();
        } else if(string.equals("i")){
            intro();
        } else if(string.equals("c")){
            courses();
        }
    }
    public boolean Exit(){
        return false;
    }

    public void intro(){
        if(string.equals("i")  || string.equals("I")){
            System.out.println("안녕하세요!");
            System.out.println("다양한 강좌를 통해 함께 공부합시다!");
            menu();
        }
    }
    public void courses(){
        if(string.equals("c")  || string.equals("C")){
            System.out.println("다음과 같은 코스가 존재합니다");
            System.out.println("(P)ython  (J)ava  (i)os  (B)ack");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine().toUpperCase();

            if(str.equals("P")) {
                python();
            } else if(str.equals("J")){
                java();
            } else if(str.equals("I")){
                ios();
            } else if(str.equals("B")){
                back();
            }
        }
    }
    public void python(){
        System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배운다.\n" +
                "강사: 김인공\n" +
                "추천 선수과목: 컴퓨터일반");
        courses();
    }

    public void java(){
        System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배운다.\n" +
                "강사: 이자바\n" +
                "추천 선수과목: Python");
        courses();
    }

    public void ios(){
        System.out.println("Swift 언어를 통해 iOS 개발을 시작할 수 있다.\n" +
                "강사: 박애플\n" +
                "추천 선수과목: Python, Java");
        courses();
    }

    public void back(){
        menu();
    }
}
