package org.bwen.playground.tests;

import org.bwen.playground.core.BitOps;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitOpsTest {
    @Test
    public void  testAdd() {
        assert(BitOps.add(1,2)==3);
    }

}