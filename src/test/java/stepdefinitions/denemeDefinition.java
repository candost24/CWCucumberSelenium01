package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilitis.Driver;

public class denemeDefinition {
    @Given("Kullanici gogle sayfasına gider")
    public void kullaniciGogleSayfasınaGider() {
        Driver.getDriver().get("https://www.google.com/");


    }



    @When("kullanici meze kelimesini arar")
    public void kullaniciMezeKelimesiniArar() {
        GoogleSearchPage wp=new GoogleSearchPage(Driver.getDriver());
        wp.searchFor("meze");

    }

    @Then("kullnici meze kelimesinin geçtiğini doğrular")
    public void kullniciMezeKelimesininGeçtiğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("meze"));
Driver.closeDriver();

    }

    @When("kullanici su kelimesini arar")
    public void kullaniciSuKelimesiniArar() {
        GoogleSearchPage kp=new GoogleSearchPage(Driver.getDriver());
        kp.searchFor("su");


    }

    @Then("kullnici su kelimesinin geçtiğini doğrular")
    public void kullniciSuKelimesininGeçtiğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("su"));
        Driver.closeDriver();
    }
}
