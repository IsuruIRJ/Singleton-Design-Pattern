package com.company;

/**
 * Created by isuru on 10/24/2016.
 */

public class Singleton5 {

    //static variable to hold instance of class singleton
    private static volatile Singleton5 uniqueInstance = null;

    //other useful instance variable here

    //constructor is declare as private, only Singleton1 can instantiate this class
    private Singleton5() {

    }

    //static method to return the unique instance
    public static Singleton5 getInstance() {

        if (uniqueInstance == null) {
            synchronized (Singleton5.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton5();
                }
            }
        }
        return uniqueInstance;
    }

    //other useful methods here
}