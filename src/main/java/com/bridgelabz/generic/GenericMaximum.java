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

    //Float
    public Double maxPositionDouble(Double firstDoublePosition, Double secondDoublePosition, Double thirdDoublePosition) {
        Double maxDouble = firstDoublePosition;
        if (secondDoublePosition.compareTo(maxDouble) > 0)
            maxDouble = secondDoublePosition;
        if (thirdDoublePosition.compareTo(maxDouble) > 0)
            maxDouble = thirdDoublePosition;
        return maxDouble;
    }
}
