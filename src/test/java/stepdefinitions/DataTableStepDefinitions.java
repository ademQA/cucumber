package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTableStepDefinitions {
    DataTablePage dataTablePage = new DataTablePage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablePage.newButonu.click();
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablePage.createButonu.click();
    }

    @And("{string},{string},{string},{string},{string},{string},{string} bilgilerini girer")
    public void bilgileriniGirer(String ad, String soyad, String pozisyon, String ofis, String tel, String tarih, String maas) {
        dataTablePage.firstNameElement.sendKeys(ad);
        dataTablePage.lastNameElement.sendKeys(soyad);
        dataTablePage.position.sendKeys(pozisyon);
        dataTablePage.ofis.sendKeys(ofis);
        dataTablePage.tel.sendKeys(tel);
        dataTablePage.tarih.sendKeys(tarih);
        dataTablePage.maas.sendKeys(maas);
    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String ad) {
        dataTablePage.searchButonu.sendKeys(ad);
    }
    @Then("isim bolumunde {string} isminin oldugunu dogrular")
    public void isimBolumundeIsmininOldugunuDogrular(String ad) {
        String actualSonuc = dataTablePage.sonucElementi.getText();
        System.out.print(actualSonuc);
        Assert.assertTrue(actualSonuc.contains(ad));
    }
}