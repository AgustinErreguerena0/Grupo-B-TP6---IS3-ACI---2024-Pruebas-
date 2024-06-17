package tp6.grupob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tp6.grupob.modelo.Calculadora;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void unitariaSumar()
    {
        assertEquals(10,Calculadora.sumar(5,5));
    }

    @Test
    public void integracionSumarRestar()
    {
        int resulRest = Calculadora.restar(5, 1);
        assertEquals(8,Calculadora.sumar(resulRest,4));
    }

    @Test
    public void testMultiplicar() 
    {
        int num01 = 2;
        int num02 = 6;

        int esperado = 12;
        int resultado = Calculadora.multiplicar(num01, num02);
        assertEquals(esperado, resultado);
    }

    @Test
    public void integracionSumarRestarMultiplicar() {
        int num01 = Calculadora.sumar(8, 2);
        int num02 = Calculadora.restar(4, 1);

        int esperado = 30;
        int resultado = Calculadora.multiplicar(num01, num02);
        assertEquals(esperado, resultado);
    }
}