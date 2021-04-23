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

}