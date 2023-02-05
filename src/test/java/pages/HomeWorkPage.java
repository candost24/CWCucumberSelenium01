package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeWorkPage {


   public HomeWorkPage(WebDriver driver) {
       PageFactory.initElements(driver, this);

   }

   @FindBy(name = "q")
   public WebElement ara;

   public void arananKelime(String value) {
       ara.sendKeys(value + Keys.ENTER);

    }


}
