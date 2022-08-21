package test;

public class Ex01 {
    public static void main(String[] args) {

        AverageFinder finder = new AverageFinder();


        int[] testArray1 = {3,7,3};
        System.out.println(finder.computeAverage(testArray1));


        int[] testArray2 = {1, 3, 4, 7};
        System.out.println(finder.computeAverage(testArray2));


        int[] testArray3 = {4};
        System.out.println(finder.computeAverage(testArray3));


        int[] testArray4 = {1,2,3,4,5};
        System.out.println(finder.computeAverage(testArray4));



    }
}
