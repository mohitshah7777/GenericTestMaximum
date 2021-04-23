package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericMaximumTest {

    GenericMaximum maxObj;

    @Before
    public void classObject() {
        maxObj = new GenericMaximum();
    }

    //UC-1 Given 3 Integers find the maximum //TC--1.1 // Integer
    @Test
    public void givenMaxIntegerAtFirstPosition_shouldReturnSame(){
        Integer maxInteger = maxObj.maxPositionInteger(9,5,2);
        Assert.assertEquals(Integer.valueOf(9),maxInteger);
    }

    //TC--1.2
    @Test
    public void givenMaxIntegerAtSecondPosition_shouldReturnSame(){
        Integer maxInteger = maxObj.maxPositionInteger(5,9,2);
        Assert.assertEquals(Integer.valueOf(9),maxInteger);
    }

    //TC--1.3
    @Test
    public void givenMaxIntegerAtThirdPosition_shouldReturnSame(){
        Integer maxInteger=maxObj.maxPositionInteger(2,5,9);
        Assert.assertEquals(Integer.valueOf(9),maxInteger);
    }

    //UC-2 Given 3 Floats find the maximum //TC--2.1 //Floats
    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnSame(){
        Double maxDouble = maxObj.maxPositionDouble(2.5,2.3,2.1);
        Assert.assertEquals(Double.valueOf(2.5),maxDouble);
    }

    //TC--2.2
    @Test
    public void givenMaxFloatAtSecondPosition_shouldReturnSame(){
        Double maxDouble = maxObj.maxPositionDouble(2.3,2.5,2.1);
        Assert.assertEquals(Double.valueOf(2.5),maxDouble);
    }

    //TC--2.3
    @Test
    public void givenMaxFloatAtThirdPosition_shouldReturnSame(){
        Double maxDouble=maxObj.maxPositionDouble(2.1,2.3,2.5);
        Assert.assertEquals(Double.valueOf(2.5),maxDouble);
    }

    //UC-3 Given 3 Strings find the maximum //TC--3.1 //String
    @Test
    public void givenMaxStringAtFirstPosition_shouldReturnSame(){
        String maxString = maxObj.maxPositionString("PineApple","Apple","Banana");
        Assert.assertEquals(String.valueOf("PineApple"),maxString);
    }

    //TC--3.2
    @Test
    public void givenMaxStringAtSecondPosition_shouldReturnSame(){
        String maxString = maxObj.maxPositionString("Apple","PineApple","Banana");
        Assert.assertEquals(String.valueOf("PineApple"),maxString);
    }

    //TC--3.3
    @Test
    public void givenMaxStringAtThirdPosition_shouldReturnSame(){
        String maxString=maxObj.maxPositionString("Apple","Banana","PineApple");
        Assert.assertEquals(String.valueOf("PineApple"),maxString);
    }
}