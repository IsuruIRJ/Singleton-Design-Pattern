package com.company;

/**
 * Created by isuru on 10/24/2016.
 */

public class Singleton2 {

    //static variable to hold instance of class singleton
    private static Singleton2 uniqueInstance = null;

    //other useful instance variable here

    //constructor is declare as private, only Singleton1 can instantiate this class
    private Singleton2() {

    }

    //static method to return the unique instance
    public static synchronized Singleton2 getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }

    //other useful methods here
}