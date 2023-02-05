package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonTaskPage;

public class AmazonTaskStepdefinitions {
    @Given(":Amazon sitesi açilir.")
    public void amazonSitesiAçilir() {

        AmazonTaskPage url=new AmazonTaskPage();
        url.geturl();
    }

    @When("Anasayfanın acildigi kontrol edilir.")
    public void anasayfanınAcildigiKontrolEdilir() {
AmazonTaskPage  kontrol=new AmazonTaskPage();
kontrol.verifyHomePge();



    }

    @And("Cerez tercihlerinden cerezleri kabul et secilir")
    public void cerezTercihlerindenCerezleriKabulEtSecilir() {

AmazonTaskPage cerezler=new AmazonTaskPage();
cerezler.setCerezKabulEt();



    }

    @And("siteye login olunur")
    public void siteyeLoginOlunur() {
        AmazonTaskPage login=new AmazonTaskPage();
        login.setGirisyap();
        login.loginOl();



    }



    @Then("Login islemi kontrol edilir")
    public void loginIslemiKontrolEdilir() {
    }

    @And("Arama butonu yanındaki kategoriler tabından bilgisayar secilir")
    public void aramaButonuYanındakiKategorilerTabındanBilgisayarSecilir() {
    }

    @Then("Bilgisayar kategorisi secildiği kontrol edilir.")
    public void bilgisayarKategorisiSecildiğiKontrolEdilir() {
    }

    @And("Arama alanına {string} yazılır ve arama yapılır.")
    public void aramaAlanınaYazılırVeAramaYapılır(String arg0) {
    }

    @Then("Arama yapildigi kontrol edilir")
    public void aramaYapildigiKontrolEdilir() {
    }

    @And("Arama sonuçları sayfasından {int}. sayfa acılır.")
    public void aramaSonuçlarıSayfasındanSayfaAcılır(int arg0) {
    }

    @Then("{int}. sayfanın acıldıgı kontrol edilir.")
    public void sayfanınAcıldıgıKontrolEdilir(int arg0) {
    }

    @And("Sayfadaki {int}. ürün favorilere eklenir.")
    public void sayfadakiÜrünFavorilereEklenir(int arg0) {

    }

    @Then("{int}. Ürünün favorilere eklendiği kontrol edilir.")
    public void ürününFavorilereEklendiğiKontrolEdilir(int arg0) {
    }

    @And("Hesabım > Favori Listem sayfasına gidilir.")
    public void hesabımFavoriListemSayfasınaGidilir() {
    }

    @Then("Favori Listem sayfası açıldığı kontrol edilir.")
    public void favoriListemSayfasıAçıldığıKontrolEdilir() {
    }

    @And("Eklenen ürün favorilerden silinir.")
    public void eklenenÜrünFavorilerdenSilinir() {
    }

    @Then("Silme işleminin gerçekleştiği kontrol edilir.")
    public void silmeIşlemininGerçekleştiğiKontrolEdilir() {
    }

    @And("Üye çıkış işlemi yapılır")
    public void üyeÇıkışIşlemiYapılır() {
    }

    @Then("Cıkıs isleminin yepildigi kontrol edilir")
    public void cıkısIslemininYepildigiKontrolEdilir() {
    }
}
