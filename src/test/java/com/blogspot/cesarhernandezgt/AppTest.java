package com.blogspot.cesarhernandezgt;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class AppTest {

    @Test
    public void sumarTest() {
        assertTrue(App.sumar(1, 1) == 2);
    }

    @Test
    public void restarTest() {
        assertTrue(App.restar(1, 1) == 0);
    }

    @Test
    public void multiplicarTest() {
        assertTrue(App.multiplicar(1, 1) == 1);
    }

    @Test
    public void dividirTest() {
        assertTrue(App.dividir(8, 2) == 4);
    }

}
