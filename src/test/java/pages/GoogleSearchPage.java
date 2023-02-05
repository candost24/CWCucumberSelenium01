package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {



    public GoogleSearchPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "q")
    private WebElement searchText;


    public void searchFor(String key){
        searchText.sendKeys(key + Keys.ENTER);
    }




}
