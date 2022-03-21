package com.company;

public class Phone2 extends Phone{
    private String name;
    private int number;
    private String model;
    private String weight;

    public Phone2(String name, int number, String model, String weight) {
        this.name = name;
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }
}
