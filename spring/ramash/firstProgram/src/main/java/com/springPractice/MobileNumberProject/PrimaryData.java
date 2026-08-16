package com.springPractice.MobileNumberProject;

public class PrimaryData {
    private String mobilenumber;
    private String name;

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrimaryData{" +
                "mobilenumber='" + mobilenumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
