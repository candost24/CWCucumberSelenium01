package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ParameterizedStepsExampleStepDefinitions {

    private int int1,int2,sonuc;
    @Given("ilk sayi {int}")
    public void ilkSayi(int sayi1) {
        int1=sayi1;
    }

    @And("ikinci sayi {int}")
    public void ikinciSayi(int sayi2) {
        int2=sayi2;
    }

    @When("Bu sayilari {word} operatorune sokarsam")
    public void buSayilariOperatoruneSokarsam(String operator) {
        switch (operator){
            case"+":
                sonuc= int1+int2;
                break;
            case"-":
                sonuc= int1-int2;
                break;
            case"*":
                sonuc= int1*int2;
                break;
            case"/":
                sonuc= int1/int2;
                break;

        }
    }

    @Then("sonuc {int} olmadir")
    public void sonucOlmadir(int sayi) {
        Assert.assertEquals(sayi,sonuc);
    }


}
