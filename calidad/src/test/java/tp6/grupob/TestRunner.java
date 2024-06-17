package tp6.grupob;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/Calculadora.feature", // Ruta a tus características
    glue = "tp6.grupob" // Paquete donde residen las Step Definitions
)
public class TestRunner {
}