package com.company;

/**
 * Created by isuru on 10/24/2016.
 */

public class Singleton3 {

    //static variable to hold instance of class singleton
    private static Singleton3 uniqueInstance = null;

    //other useful instance variable here

    //constructor is declare as private, only Singleton1 can instantiate this class
    private Singleton3() {
    }

    //static method to return the unique instance
    public static Singleton3 getInstance() {

        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                uniqueInstance = new Singleton3();
            }
        }
        return uniqueInstance;
    }

    //other useful methods here
}