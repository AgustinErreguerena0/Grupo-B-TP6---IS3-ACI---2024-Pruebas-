package tp6.grupob;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tp6.grupob.modelo.Calculadora;
public class StepDefinitions {
    private int a;
    private int b;
    private int result;

    @Given("que tengo dos números {int} y {int}")
    public void que_tengo_dos_numeros_y(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @When("los sumo")
    public void los_sumo() {
        result = Calculadora.sumar(a, b);
    }

    @Then("el resultado debe ser {int}")
    public void el_resultado_debe_ser(int esperado) {
        assertEquals(esperado, result);
    }
}
