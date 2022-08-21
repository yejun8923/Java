package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){

        System.out.println("숫자를 입력 하세요 : ");
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            System.out.println("입력 받은 값 : "+num);
        }catch (InputMismatchException e){
            System.out.println("숫자만 입력 하세요");
        }

    }
}
