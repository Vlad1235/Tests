package com.basics;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AddTest {
    @Test
    public void add() {
        assertEquals(5,new Add().add(2,3));
    }
}