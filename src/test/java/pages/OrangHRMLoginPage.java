package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangHRMLoginPage {
    WebDriver driver;

    public OrangHRMLoginPage(WebDriver driver){

        this.driver=driver;

        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")

WebElement textUsername;
    @FindBy(name = "password")
WebElement textPassword;
    @FindBy(xpath = "//button[@type='submit']")
WebElement btnlogin;
    @FindBy(className = "oxd-text oxd-text")
WebElement errMessage;
public void typeUsername(String text){

    textUsername.sendKeys(text);
}
public void typePassword(String text){
    textPassword.sendKeys(text);

}
    public void clickLogin(){
        btnlogin.click();
    }
    public void loginAsAdmin(){
        typeUsername("Admin");
        typePassword("admin123");
        clickLogin();
    }


    public void verifyErrMessageContains(String message){
        Assert.assertTrue(errMessage.getText().contains(message));
    }
}



