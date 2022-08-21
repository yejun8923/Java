package exam;

public class Ex03 {
    public static void main(String[] args) {

        String[] strings = new String[5];
        strings[0] = "hello";
        strings[2] = "";
        strings[4] = "Java";

        int countA = 0, countB = 0;
        for (String str : strings) {
            if (str != null && !str.isEmpty()) {
                countA++;
            } else {
                countB++;
            }
        }
        System.out.println(countB);
    }
}
