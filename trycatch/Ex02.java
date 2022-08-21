package trycatch;

public class Ex02 {
    public static void main(String[] args) {
        int[] smallArray = new int[3];
        int x = 100;


            for (int i = 0; i <10; i++) {
                try {
                    smallArray[i] = x;
                    x++;

                }catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("i가 " + i + "일때 배열의 범위를 초과 합니다");
                    }
            }
            for(int i : smallArray){
                System.out.println(i);
            }

    }
}
