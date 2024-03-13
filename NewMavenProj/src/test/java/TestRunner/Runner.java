package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:/Users/Mohan/IdeaProjects/NewMavenProj/src/main/java/features/test.feature"},
        tags = "@login",
        glue = {"stepDefinition"},
        plugin = {"pretty", "html:target/cucumber/html"})

public class Runner {


}
