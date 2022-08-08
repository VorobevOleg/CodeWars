package com.codewars;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestKyu {
    @Test
    public void test1() {
        assertEquals(51659, ASum.findNb(1780495179842880900L));
    }
    @Test
    public void test2() {
        assertEquals(-1, ASum.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, ASum.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, ASum.findNb(40539911473216L));
    }
}
