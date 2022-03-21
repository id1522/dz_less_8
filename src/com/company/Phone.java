package com.company;

public class Phone {
    private String name;
    private int number;
    private String model;
    private String weight;


    public String receiveCall(String name) {
        this.name = name;
        System.out.println("Boss " + name);
        return this.getName();
    }

    public String receiveCall(String name, int number) {
        this.name = name;
        this.number = number;
        System.out.println("Incoming call "+name+"\nCall Number "+number);
        return getModel();
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

    public Phone(int number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }
}
