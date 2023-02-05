package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilitis.ConfigReader;
import utilitis.Driver;

import java.time.Duration;

public class homeWork03StepDefinition {
    @Given("clinician {string} sayfasina gider")
    public void clinicianSayfasinaGider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(arg0));
    }

    @And("sayfa basliginin {string}icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
