package com.bridgelabz.generic;

public class GenericMaximum {

    //UC-1 Given three Integers Find Maximum
    //Integer
    public Integer maxPositionInteger(Integer firstIntPosition, Integer secondIntPosition, Integer thirdIntPosition) {
        Integer maxInt = firstIntPosition;
        if (secondIntPosition.compareTo(maxInt) > 0)
            maxInt = secondIntPosition;
        if (thirdIntPosition.compareTo(maxInt) > 0)
            maxInt = thirdIntPosition;
        return maxInt;
    }

    //UC-1 Given three Floats Find Maximum
    //Float
    public Double maxPositionDouble(Double firstDoublePosition, Double secondDoublePosition, Double thirdDoublePosition) {
        Double maxDouble = firstDoublePosition;
        if (secondDoublePosition.compareTo(maxDouble) > 0)
            maxDouble = secondDoublePosition;
        if (thirdDoublePosition.compareTo(maxDouble) > 0)
            maxDouble = thirdDoublePosition;
        return maxDouble;
    }

    //UC-2 Given 3 Floats find the maximum //TC--2.1 //String
    //String
    public String maxPositionString(String firstStringPosition, String secondStringPosition, String thirdStringPosition) {
        String maxString = firstStringPosition;
        if (secondStringPosition.compareTo(maxString) > 0)
            maxString = secondStringPosition;
        if (thirdStringPosition.compareTo(maxString) > 0)
            maxString = thirdStringPosition;
        return maxString;
    }
}
