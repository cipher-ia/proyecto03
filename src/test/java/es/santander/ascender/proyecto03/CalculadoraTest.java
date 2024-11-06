package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestCalculadora() {
      Calculadora calculadora = new Calculadora();

      long resultadosuma = calculadora.sumar (5,10);

        assertEquals(15, resultadosuma, "me tiene que dar 15");

        long resultadoresta = calculadora.restar(10,5);

        assertEquals(5, resultadoresta, "me tiene que dar 5");


        long resultadomultiplicar = calculadora.multiplicar (5,10);

        assertEquals(50, resultadomultiplicar, "me tiene que dar 50");

        long resultadodividir = calculadora.dividir (10,5);

        assertEquals(2, resultadodividir, "me tiene que dar 2");
    }
}

