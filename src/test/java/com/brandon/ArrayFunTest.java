package com.brandon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunTest {

    @Test
    void testCanBalance() {
        ArrayFun af = new ArrayFun();
        assertTrue(af.canBalance(new int[] { 1, 1, 1, 2, 1 }));
        assertFalse(af.canBalance(new int[] { 2, 1, 1, 2, 1 }));
        assertTrue(af.canBalance(new int[] { 10, 10 }));
    }

    @Test
    void testLinearIn() {
        ArrayFun af = new ArrayFun();
        assertTrue(af.linearIn(new int[] { 1, 2, 4, 6 }, new int[] { 2, 4 }));
        assertFalse(af.linearIn(new int[] { 1, 2, 4, 6 }, new int[] { 2, 3, 4 }));
        assertTrue(af.linearIn(new int[] { 1, 2, 4, 4, 6 }, new int[] { 2, 4 }));
        assertTrue(af.linearIn(new int[] { 2, 2, 4, 4, 6, 6 }, new int[] { 2, 4 }));
        assertTrue(af.linearIn(new int[] { 2, 2, 2, 2, 2 }, new int[] { 2, 2 }));
        assertFalse(af.linearIn(new int[] { 2, 2, 2, 2, 2 }, new int[] { 2, 4 }));
        assertTrue(af.linearIn(new int[] { 2, 2, 2, 2, 4 }, new int[] { 2, 4 }));
        assertTrue(af.linearIn(new int[] { 1, 2, 3 }, new int[] { 2 }));
        assertFalse(af.linearIn(new int[] { 1, 2, 3 }, new int[] { -1 }));
        assertTrue(af.linearIn(new int[] { 1, 2, 3 }, new int[] { }));
        assertTrue(af.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { -1, 0, 3, 12 }));
        assertFalse(af.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { 0, 3, 12, 14 }));
        assertFalse(af.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { -1, 10, 11 }));
    }

}