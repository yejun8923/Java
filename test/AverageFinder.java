package test;

public class AverageFinder {


    public double computeAverage(int[] a) {
        double temp = 0;
        for(int i=0; i<a.length; i++) {
            temp += a[i];
        }
        temp = temp/a.length;

        return temp;
    }
}
