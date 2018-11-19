package org.bwen.playground.core;

public class Singleton2 {
    public static final Singleton2 instance;
    static {
        //can catch exceptions
        try {
            instance = new Singleton2();
        }
        finally {

        }
    }
    private Singleton2 () {};
}
