package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.Guru99Page;
import utilities.ConfigReader;
import utilities.Driver;

public class Guru99StepDefinitions {
    Guru99Page guru99Page=new Guru99Page();
    Faker faker=new Faker();
    Actions actions;
    WebDriver driver;

    @Given("kullanici {string} payment adresine gider")
    public void kullanici_payment_adresine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("guru99Url1"));
    }

    @Given("kullanici guru99 Telecom anasayfaya gider.")
    public void kullanici_guru99_telecom_anasayfaya_gider(String url) {

    }

    @Then("sayfanin title inin Telecom icerdigini test eder")
    public void sayfanin_title_inin_telecom_icerdigini_test_eder() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedIcerik="Telecom";
        Assert.assertTrue(actualTitle.contains(expectedIcerik));

    }
    @Then("add costumer sayfasina gider")
    public void add_costumer_sayfasina_gider() {
        guru99Page.addCostumer.click();
        Driver.getDriver().switchTo().frame((guru99Page.iframe));
        guru99Page.reklamKapat.click();
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("formu doldurup submit butonuna basar")
    public void formu_doldurup_submit_butonuna_basar() {
        guru99Page.done.click();
        guru99Page.firstName.sendKeys(faker.name().firstName());
        guru99Page.lastName.sendKeys(faker.name().lastName()+Keys.TAB);
        guru99Page.email.sendKeys(faker.internet().emailAddress()+Keys.TAB);
        guru99Page.address.sendKeys(faker.address().cityName());
        guru99Page.phoneNumber.sendKeys("2365489752");
        guru99Page.submit.click();
    }
    @Then("kaydin basarili oldugunu dogrular")
    public void kaydin_basarili_oldugunu_dogrular() {
        String actuelVerify=guru99Page.details.getText();
        String expectedString="Access Details";
        Assert.assertTrue(actuelVerify.contains(expectedString));
    }
    @Then("costumer id numarasini yazdirir")
    public void costumer_id_numarasini_yazdirir() {
        String customerIdNumber=guru99Page.costumerID.getText();
        System.out.println("\nCustomer ID:"+customerIdNumber);
    }

    @Given("kullanici guru99 payment adresine gider")
    public void kullaniciGuruPaymentAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("guru99Url2"));
    }

    @Then("kullanici sayfanin basliginin Payment icerdigini dogrular")
    public void kullaniciSayfaninBasligininPaymentIcerdiginiDogrular() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedIcerik3="Payment";
        Assert.assertTrue(actualTitle.contains(expectedIcerik3));
    }

    @Then("kullanici kredi karti uretme sayfasina gider")
    public void kullaniciKrediKartiUretmeSayfasinaGider() {

        guru99Page.cardcreate.click();
    }

    @Then("Uretilen kartin bilgilerini yazdirir")
    public void uretilenKartinBilgileriniYazdirir() throws InterruptedException {
        String ilkWHD = Driver.getDriver().getWindowHandle();
        String ikinciWHD ;
        for (String eachWHD: Driver.getDriver().getWindowHandles()
        ) {
            if (!eachWHD.equals(ilkWHD)){
                ikinciWHD=eachWHD;
                Driver.getDriver().switchTo().window(ikinciWHD);
            }
        }
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // jsExecutor.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(2000);
        String cardNumber=guru99Page.CardNumber.getText();
        String cvv=guru99Page.CVVNumber.getText();
        String expdate=guru99Page.ExpDate.getText();
        String limit=guru99Page.CrediLimit.getText();
        System.out.println("\n Card Information\n"+cardNumber+"\n"+cvv+"\n"+expdate+"\n"+limit);

    }
}