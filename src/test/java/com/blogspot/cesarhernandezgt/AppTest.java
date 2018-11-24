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

    @Test //prueba gregada en commit G
    public void sumarNegativoTest() {
        assertTrue(App.sumar(-2, 1) == -1);
    }

    @Test //prueba gregada en commit H
    public void restarNegativoTest() {
        assertTrue(App.restar(-1, 1) == -2);
    }

    @Test //prueba gregada en commit I
    public void multiplicarNegativoTest() {
        assertTrue(App.multiplicar(-1, 3) == -3);
    }

    @Test //prueba gregada en commit J
    public void divisionNegativoTest() {
        assertTrue(App.dividir(-10, 5) == -2);
    }
}
