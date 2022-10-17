package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature",
		glue = "steps",
		tags = "@moto or @bicicleta or @van or @maisDeUmMetodo or @dadosBranco or @dadosInvalidos or @semAnexo or @BUG",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		
		)

public class Executa  {

	
	
}
