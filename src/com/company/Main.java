package com.company;

public class Main {

    public static void main(String[] args) {

        Phone1 phone1 = new Phone1("Nikita", 1, "MTS", "hello");
        Phone2 phone2 = new Phone2("Sasha", 2, "LIFE", "Dinner");
        Phone3 phone3 = new Phone3("Alina", 3, "MTS", "Work");
        Phone[] phones = {phone1, phone2, phone3};
        for (Phone phone : phones ) {
            System.out.println("Name "+phone.getName());
            System.out.println("Number "+phone.getNumber());
            System.out.println("Model "+phone.getModel());
            System.out.println("Weight "+phone.getWeight());
            System.out.println();
        }
        for (Phone phone : phones) {
            System.out.println(phone.receiveCall("receiveCall"));
            System.out.println("Call Number "+phone.getNumber());
            System.out.println();
        }
        Phone phone = new Phone(1,"MTS");
        System.out.println(phone.receiveCall("Nikita",1));

    }
}