package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericMaximumTest {

    GenericMaximum maxGenericObject;

    //UC-4 Extend the max method to take more than three parameters
    // Integer
    @Test
    public void givenMoreThanThreeParameters_Integer(){
        Integer[] intArray={1,2,3,4,5};
        maxGenericObject = new GenericMaximum();
        Integer maxInt = maxGenericObject.max(intArray);
        Assert.assertEquals(Integer.valueOf(5),maxInt);
    }

    //Float
    @Test
    public void givenMoreThanThreeParameters_Float(){
        Double[] doubleArray={1.1, 2.1, 3.3, 4.5, 5.6};
        maxGenericObject = new GenericMaximum();
        Double maxDouble = maxGenericObject.max(doubleArray);
        Assert.assertEquals(Double.valueOf(5.6),maxDouble);
    }

    //String
    @Test
    public void givenMoreThanThreeParameters_String(){
        String[] stringArray={"Apple","Orange","Banana","PineApple","Kiwi"};
        maxGenericObject = new GenericMaximum();
        String maxString = maxGenericObject.max(stringArray);
        Assert.assertEquals(String.valueOf("PineApple"),maxString);
    }
}