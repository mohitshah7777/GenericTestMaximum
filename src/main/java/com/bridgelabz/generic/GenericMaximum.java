package com.bridgelabz.generic;

public class GenericMaximum {

    //Refactor-1 Refactor all the 3 to One Generic Method and find the maximum
    public <E extends Comparable> E genericMaximum(E firstPosition, E secondPosition, E thirdPosition){
        E maxPosition=firstPosition;
        if(secondPosition.compareTo(maxPosition) > 0)
            maxPosition=secondPosition;
        if(thirdPosition.compareTo(maxPosition) > 0)
            maxPosition=thirdPosition;
        return maxPosition;
    }

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

    //UC-3 Given 3 Strings find the maximum
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
