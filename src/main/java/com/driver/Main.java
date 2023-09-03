package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

//        obj.variable = "some value";
        //java: variable has private access in com.driver.RWOnly
        obj.setVariable("New Value");
        System.out.println(obj.getVariable());
    }

}
