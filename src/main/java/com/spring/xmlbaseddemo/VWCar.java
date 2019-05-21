package com.spring.xmlbaseddemo;

public class VWCar implements Car {

    private String modelName;
    private String emailAddress;
    private String wheelSize;

    public VWCar(String modelName) {
        this.modelName = modelName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String drive() {
        return "\nDriving VW " + this.modelName + " Car, my wheelsize is : " + this.wheelSize + " and my email address is: " + this.emailAddress;
    }

    public String reverse() {
        return "\nReversing  VW " + this.modelName + " Car, my wheelsize is : " + this.wheelSize + " and my email address is: " + this.emailAddress;
    }
}
