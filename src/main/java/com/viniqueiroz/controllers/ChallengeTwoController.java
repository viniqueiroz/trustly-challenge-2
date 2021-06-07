package com.viniqueiroz.controllers;

public class ChallengeTwoController {

    String name;
    String nationality;
    String biggestDream;

    public ChallengeTwoController(String name, String nationality, String biggestDream) {
        this.name = name;
        this.nationality = nationality;
        this.biggestDream = biggestDream;
    }

    public void getPresentation() {
        System.out.printf("Name: \t\t\t%s", this.name);
        System.out.println();
        System.out.printf("Nationality: \t\t%s", this.nationality);
        System.out.println();
        System.out.printf("Biggest Dream: \t\t%s", this.biggestDream);
        System.out.println();
    }

}
