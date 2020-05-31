package runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", tags = "@AdicionarCliente", 
glue = "cliente_steps", monochrome = true, dryRun = false)

public class AdicionarClienteRunner {

}
