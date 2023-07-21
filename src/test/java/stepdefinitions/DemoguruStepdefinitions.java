package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DemoguruPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DemoguruStepdefinitions {
    DemoguruPage demoguruPage = new DemoguruPage();

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("demoguruUrl"));
    }

    @Given("Sayfanın title’ında Telecom yazdığını dogrular")
    public void sayfanin_title_inda_telecom_yazdigini_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Telecom"));

    }

    @Given("Add Costumer sayfasına gitmek icin linki tiklar")
    public void add_costumer_sayfasina_gitmek_icin_linki_tiklar() {
        demoguruPage.costumerLinki.click();
    }

    @Given("Formu doldurup müşteri ekler")
    public void formu_doldurup_musteri_ekler() {

    Driver.getDriver().switchTo().frame(demoguruPage.iframe);

        demoguruPage.reklamKapat.click();
        Driver.getDriver().switchTo().defaultContent();
        demoguruPage.name.sendKeys("adem");
        demoguruPage.surname.sendKeys("tek");
        demoguruPage.email.sendKeys("ademtekinel@gmail.com");
        demoguruPage.adres.sendKeys("gebze");
        demoguruPage.tel.sendKeys("123456789");
        demoguruPage.submit.click();

    }

    @Given("Kaydın başarıyla yapıldığı dogrular")
    public void kaydin_basariyla_yapildigini_dogrular() {
Assert.assertTrue(demoguruPage.basariliEklendi.isDisplayed());
    }

    @Given("Kullanıcının costumer id’sini yazdırır")
    public void kullanicinin_costumer_id_sini_yazdirir() {
        System.out.println(demoguruPage.customerId.getText());
    }


}
