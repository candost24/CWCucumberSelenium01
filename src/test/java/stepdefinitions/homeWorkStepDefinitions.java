package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomeWorkPage;
import utilitis.Driver;

public class homeWorkStepDefinitions {
    @Given("Magellanic google a gider")
    public void magellanicGoogleAGider() {
        Driver.getDriver().get("https://www.google.com/");

    }

    @When("Cucumber i aratir")
    public void cucumberIAratir() {
        HomeWorkPage wp=new HomeWorkPage(Driver.getDriver());
        wp.arananKelime("Cucumber");



    }

    @Then("Title da cucumber yazildigini dogrular")
    public void titleDaCucumberYazildiginiDogrular() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Cucumber"));
Driver.closeDriver();
    }
}
