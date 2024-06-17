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
        assertEquals(10,Calculadora.sumar(5,5));
    }
    @Test
    public void integracionSumarRestar(){
        int resulRest = Calculadora.restar(5, 1);
        assertEquals(8,Calculadora.sumar(resulRest,4));
    }
    
    

}
