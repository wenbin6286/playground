package org.bwen.playground.tests;

import static org.bwen.playground.enumexample.Operation.DIV;


public class OperationTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void apply() {
        double x =2, y=10;
        double r = DIV.apply(x,y);
        assert(r==0.2);
    }
}