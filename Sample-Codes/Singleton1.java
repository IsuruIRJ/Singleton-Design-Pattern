package com.company;

/**
 * Created by isuru on 10/23/2016.
 */

public class Singleton1 {

    //static variable to hold instance of class singleton
    private static Singleton1 uniqueInstance = null;

    //other useful instance variable here

    //constructor is declare as private, only Singleton1 can instantiate this class
    private Singleton1() {

    }

    //static method to return the unique instance
    public static Singleton1 getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }

    //other useful methods here
}