package com.haapp.module02;

public class AnimalFactory {

    public static Animal create(String animal) {
        switch(animal.toLowerCase()) {
            case "cow":
                return new Cow();
            case "cat":
                return new Cat();
            default:
                return new Dog();
        }
    }

}
