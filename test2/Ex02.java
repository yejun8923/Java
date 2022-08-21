package test2;

public class Ex02 {
    public static void main(String[] args){

        GreatestDifferenceFinder finder = new GreatestDifferenceFinder();

        int[] testArray1 = {-2, 7, 3};
        System.out.println(finder.greatestDifference(testArray1));

        int[] testArray2 = {8, 3, 14, 1};
        System.out.println(finder.greatestDifference(testArray2));

        int[] testArray3 = {4, 2, 3, 1};
        System.out.println(finder.greatestDifference(testArray3));

        int[] testArray4 = {};
        System.out.println(finder.greatestDifference(testArray4));

        int[] testArray5 = {1 ,2, -3, 4, 5};
        System.out.println(finder.greatestDifference(testArray5));

        int[] testArray6 = {1};
        System.out.println(finder.greatestDifference(testArray6));
    }
}
