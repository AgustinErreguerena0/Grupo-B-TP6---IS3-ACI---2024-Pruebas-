package tp6.grupob;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import tp6.grupob.modelo.Calculadora;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void unitariaSumar()
    {
        assertEquals(Calculadora.sumar(5,5), 10);
    }


}
