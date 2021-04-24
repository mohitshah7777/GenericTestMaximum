package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericMaximumTest {

    GenericMaximum maxGenericObject;

    //UC-5 Extend the max method to also print the max to std out using Generic Method
    // Integer
    @Test
    public void givenMoreThanThreeParameters_Integer(){
        Integer[] intArray={1,2,3,4,5};
        maxGenericObject = new GenericMaximum();
        Integer maxInt = maxGenericObject.max(intArray);
        maxGenericObject.printmax(maxInt);
        Assert.assertEquals(Integer.valueOf(5),maxInt);
    }

    //Float
    @Test
    public void givenMoreThanThreeParameters_Float(){
        Double[] doubleArray={1.1, 2.1, 3.3, 4.5, 5.6};
        maxGenericObject = new GenericMaximum();
        Double maxDouble = maxGenericObject.max(doubleArray);
        maxGenericObject.printmax(maxDouble);
        Assert.assertEquals(Double.valueOf(5.6),maxDouble);
    }

    //String
    @Test
    public void givenMoreThanThreeParameters_String(){
        String[] stringArray={"Apple","Orange","Banana","PineApple","Kiwi"};
        maxGenericObject = new GenericMaximum();
        String maxString = maxGenericObject.max(stringArray);
        maxGenericObject.printmax(maxString);
        Assert.assertEquals(String.valueOf("PineApple"),maxString);
    }
}