package com.epam.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lesson3Test {

    @Test
    public void calculateSum() {
        Lesson3 lesson3 = new Lesson3();
        boolean actual = lesson3.calculateSum(1221);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}