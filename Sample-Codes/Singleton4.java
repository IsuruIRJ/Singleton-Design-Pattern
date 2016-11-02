package com.company;

/**
 * Created by isuru on 10/24/2016.
 */

public class Singleton4 {

    //static variable to hold instance of class singleton
    private static Singleton4 uniqueInstance = null;

    //other useful instance variable here

    //constructor is declare as private, only Singleton1 can instantiate this class
    private Singleton4() {

    }

    //static method to return the unique instance
    public static Singleton4 getInstance() {

        if (uniqueInstance == null) {
            synchronized (Singleton4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }

    //other useful methods here
}