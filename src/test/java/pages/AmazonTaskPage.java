package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.ConfigReader;
import utilitis.Driver;

public class AmazonTaskPage {

/*

Amazon Senaryosu
o https://www.amazon.com.tr/ sitesi açılır.
o Ana sayfanın açıldığı kontrol edilir.
o  Çerez tercihlerinden Çerezleri kabul et seçilir.
o  Siteye login olunur.
o Login işlemi kontrol edilir.
o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
o Bilgisayar kategorisi seçildiği kontrol edilir.
o Arama alanına MSI yazılır ve arama yapılır.
o Arama yapıldığı kontrol edilir.
o Arama sonuçları sayfasından 3. sayfa açılır.
o 3. sayfanın açıldığı kontrol edilir.
o Sayfadaki 2. ürün favorilere eklenir.
o 2. Ürünün favorilere eklendiği kontrol edilir.
o Hesabım > Favori Listem sayfasına gidilir.
o "Favori Listem" sayfası açıldığı kontrol edilir.
o Eklenen ürün favorilerden silinir.
o Silme işleminin gerçekleştiği kontrol edilir.
o Üye çıkış işlemi yapılır.
o Çıkış işleminin yapıldığı kontrol edilir.

 */

    public AmazonTaskPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void geturl() {
        Driver.getDriver().get("https://www.amazon.com.tr/");
    }

    public void verifyHomePge() {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("amazon"));


    }

    @FindBy(id = "sp-cc-accept")
    private WebElement cerezKabulEt;

    public void setCerezKabulEt() {
        cerezKabulEt.click();

    }

    @FindBy(id = "nav-link-accountList")
    private WebElement accountList;

    @FindBy(linkText = "Giriş yap")
    private WebElement girisyap;

    public void setGirisyap() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(accountList).moveToElement(girisyap).click().perform();


    }
    @FindBy(id = "ap_email")
    private WebElement email;
    @FindBy(id="ap_password")
private WebElement password;


public void loginOl(){
    email.sendKeys("cebo24@hotmail.com.tr"+ Keys.ENTER);
    password.sendKeys("CANIMBABAM24"+Keys.ENTER);


}


}


