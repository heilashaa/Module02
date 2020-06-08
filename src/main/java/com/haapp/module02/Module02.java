package com.haapp.module02;

import java.util.Scanner;

public class Module02 {

    private static final String SEPARATOR_LINE = "------------------------------------------------------------------";

    public static void main(String[] args) {

        separate();
        System.out.println("Please, type an animal (dog, cat, cow) and press ENTER:");

        Scanner in = new Scanner(System.in);
        String inComeLineFromConsole = in.nextLine();

        Animal animal = AnimalFactory.create(inComeLineFromConsole);
        animal.say();


        int i = 1_000_000;
        byte b = 16;
        boolean tr = true;

        System.out.println(tr);
    }

    private static void separate (){
        System.out.println(SEPARATOR_LINE);
    }

}
