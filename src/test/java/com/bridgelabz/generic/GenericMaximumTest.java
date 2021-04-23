package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericMaximumTest {

    GenericMaximum maxGenericObject;

    //Refactor-2 Refactor to create Generic Class to take in 3 variables of Generic Type
    // Integer
    @Test
    public void givenThreeInteger_shouldReturnMaxPositionGeneric(){
        maxGenericObject = new GenericMaximum(7,10,5);
        Integer maxInt = (Integer) maxGenericObject.maximumGeneric();
        Assert.assertEquals(Integer.valueOf(10),maxInt);
    }

    //Float
    @Test
    public void givenThreeFloats_shouldReturnMaxPositionGeneric(){
        maxGenericObject = new GenericMaximum(7.5,5.5,10.5);
        Double maxDouble = (Double) maxGenericObject.maximumGeneric();
        Assert.assertEquals(Double.valueOf(10.5),maxDouble);
    }

    //String
    @Test
    public void givenThreeStrings_shouldReturnMaxPositionGeneric(){
        maxGenericObject = new GenericMaximum("Apple","Watermelon","Banana");
        String maxString = (String) maxGenericObject.maximumGeneric();
        Assert.assertEquals(String.valueOf("Watermelon"),maxString);
    }
}