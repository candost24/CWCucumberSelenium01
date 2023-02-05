package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomeWorkPage;
import utilitis.Driver;

public class homeWork02StepDefinition {
    @Given("Kullanici google a gider")
    public void kullaniciGoogleAGider() {

        Driver.getDriver().get("https://www.google.com/");

    }

    @When("selenium u aratir")
    public void seleniumUAratir() {
        HomeWorkPage work02Page=new HomeWorkPage(Driver.getDriver());
        work02Page.arananKelime("selenium");


    }

    @Then("Title da selenium yazildigini dogrular")
    public void titleDaSeleniumYazildiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
        Driver.closeDriver();
    }
}
