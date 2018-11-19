package org.bwen.playground.tests;

import org.bwen.playground.careercup.ValidBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidBracketsTest {

    @Test
    public void TestCase1() {
        assertTrue(ValidBrackets.isValid("{}"));


    }
    @Test
    public void TestCase2() {
        assertTrue(ValidBrackets.isValid("{()}"));
    }
    @Test
    public void TestCase3() {
        assertTrue(ValidBrackets.isValid("{(}"));
    }
}