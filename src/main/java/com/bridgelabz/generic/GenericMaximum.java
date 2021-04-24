package com.bridgelabz.generic;

public class GenericMaximum {

    //UC-4 Extend the max method to take more than three parameters
    public <E extends Comparable> E max(E[] inputArray) {

        for (int i = 0 ; i<(inputArray.length - 1 ); i ++) {
            for ( int j = 0; j<(inputArray.length - 1); j++) {
                if ( inputArray[j].compareTo(inputArray[j + 1]) < 0 ) {
                    E temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j+1] = temp;
                }
            }
        }

        E maxPosition = inputArray[0];
        return maxPosition;
    }
}