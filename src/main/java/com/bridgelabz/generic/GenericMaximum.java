package com.bridgelabz.generic;

public class GenericMaximum {

    //UC-5 Extend the max method to also print the max to std out using Generic Method
    public <E extends Comparable> E max(E[] inputArray) {

        for (E element: inputArray ) {
            System.out.println(element);
        }

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

    public <E> void printmax(E maxPosition){
        System.out.println("Maximum value is = "+ maxPosition);
    }
}