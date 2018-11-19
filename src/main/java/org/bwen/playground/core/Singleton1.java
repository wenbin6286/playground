package org.bwen.playground.core;

public class Singleton1 {
    //what if there is an exception in the constructor
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1() {}; //make default constructor private


}

