package com.test18.utils;

public enum TestScenarios {
    T1("Input user name password valid"),
  ;

    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
