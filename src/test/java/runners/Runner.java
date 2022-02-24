package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JsonFormat;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(features = "src/test/resources/features",
        glue = "stepdefinitions",  //Runner ile aynı package'da
        tags = "@wip",
        dryRun = false
)

//dryRun false iken tags'daki ilgili kodları çalıştırır(Amazona gider). true iken çalıştırmaz ama eksikleri getirir.(amazon'a gitmez)


public class Runner {

// Buraya bir kod yazmıyoruz. Bu Class'taki amaç yukarıdaki 2 notasyondur.



}
