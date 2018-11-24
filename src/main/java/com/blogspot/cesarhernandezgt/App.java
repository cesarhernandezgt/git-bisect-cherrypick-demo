package com.blogspot.cesarhernandezgt;


public class App {
    public static int resultado;

    public static int sumar(int a, int b) {
        resultado = a + b;
        System.out.println(a + "+" + b + " = " + resultado);
        return resultado;
    }

    public static int restar(int a, int b) {
        resultado = a - b;
        System.out.println(a + "-" + b + " = " + resultado);
        return resultado;
    }

    public static int multiplicar(int a, int b) {
        resultado = a * b;
        System.out.println(a + "*" + b + " = " + resultado);
        return resultado;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            resultado = a / b;
            System.out.println(a + "/" + b + " = " + resultado);
            return resultado;
        }else{
            System.out.println(a + "/" + b + " = 0 (DIVISION ENTRE CERO MANEJADA!.");
            return 0;
        }
    }


}
