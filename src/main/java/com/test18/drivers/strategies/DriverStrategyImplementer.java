package com.test18.drivers.strategies;


import com.test18.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case Constants.CHROME:
                return new Chrome();
            case Constants.FIREFOX:
                return new Firefox();
            default:
                return null;
        }
    }
}
