package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoguruPage {
    public DemoguruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//a[text()='Add Customer']")
    public WebElement costumerLinki;

    @FindBy(id = "fname")
    public WebElement name;

    @FindBy(id = "lname")
    public WebElement surname;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "//textarea[@placeholder='Enter your address']")
    public WebElement adres;

    @FindBy(id = "telephoneno")
    public WebElement tel;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']")
    public WebElement iframe;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement reklamKapat;

    @FindBy(xpath = "//header[@class='align-center']")
    public WebElement basariliEklendi;

    @FindBy(xpath = "(//td[@align='center'])[2]")
    public WebElement customerId;
}
