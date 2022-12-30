package _6_BigDecimal;

import java.math.BigDecimal;

public class BigDecimals {
    public static void main(String[] args) {

        // Prueba de impresicion:
        System.out.println(0.1f + 0.1f + 0.1f +0.1f +0.1f +0.1f +0.1f +0.1f +0.1f +0.1f);

        // lo que requere altisima pesicion como en finanzas se usan los tipo de dato BigDecimal:
        // no es un problema de Java sino de todos los leguajes.

        BigDecimal valorA = new BigDecimal(0.1);
        BigDecimal valorB = new BigDecimal(4);

        System.out.println("Valor A: " + valorA);
        System.out.println("Valor B: " + valorB);

        BigDecimal resultado1 = valorA.multiply(valorB);
        BigDecimal resultado2 = valorA.add(valorB);

        System.out.println(resultado1.toString());
        System.out.println(resultado2.toString());


    }
}
