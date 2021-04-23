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

}
