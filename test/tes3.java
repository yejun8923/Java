package test;

public class tes3 {
    public static void main(String[] args) {

        int[] a = {18, 7, 2, 5, 9, 25, 21, 13, 19};

        for (int j = 1; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                int temp = 0;
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int x = a[a.length-1]-a[0];
        System.out.println(x);
    }
}
