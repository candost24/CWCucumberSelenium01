package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleSearchPage;
import utilitis.Driver;

public class PareameterizedStepDefinition {

    @When("Kullanici {string} arattiginda")
    public void kullaniciArattiginda(String key) {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);


    }

    @Then("Kullanici title da {string} gormelidir")
    public void kullaniciTitleDaGormelidir(String key) {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);
        Driver.closeDriver();

    }
}
