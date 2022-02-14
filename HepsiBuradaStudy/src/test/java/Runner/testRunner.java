package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/java/Features/likeComment.feature",
   
   //path of step definition file
   glue = "stepDefination"
   )

public class testRunner {
}
