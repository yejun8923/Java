package test2;

public class GreatestDifferenceFinder {

    public int greatestDifference(int[] intArray){

        if(intArray.length <2){
            return 0;
        }

        for (int j = 1; j < intArray.length; j++) {
            for (int i = 0; i < intArray.length - 1; i++) {
                int temp = 0;
                if (intArray[j] < intArray[i]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        int x = intArray[intArray.length-1]-intArray[0];
        return x;
    }
}
