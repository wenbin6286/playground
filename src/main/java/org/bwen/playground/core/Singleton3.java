package org.bwen.playground.core;

public class Singleton3 {
    private Singleton3 () {};
    private static class Holder {
        private static final Singleton3 instance = new Singleton3();
    }

    public Singleton3 getInstance() {
        return Holder.instance;
    }
}
