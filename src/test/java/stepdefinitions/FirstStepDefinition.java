package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinition {

@Given("Ilk feauture icin cucumber indirdim")
public void ılk_feauture_icin_cucumber_indirdim() {
    System.out.println("Given step çalıştı");

        }
@When("Seneryomu calistirdigimda")
public void seneryomu_calistirdigimda() {
    System.out.println("When step çalıştı");
        }
    @Then("Seneryomun calistıgını konsolda görmeliyim")
    public void seneryomun_calistıgını_konsolda_görmeliyim() {
        System.out.println("Then step çalıştı");
    }




        }
