package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guru99Page {
    public Guru99Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@href='addcustomer.php'])[1]")
    public WebElement addCostumer;

    @FindBy(xpath = "//*[@for='done']")
    public WebElement done;

    @FindBy(xpath="//input[@id='fname']")
    public WebElement firstName;

    @FindBy(xpath="//input[@id='lname']")
    public WebElement lastName;

    @FindBy(xpath="//input[@id='email']")
    public WebElement email;

    @FindBy(xpath="//*[@name='addr']")
    public WebElement address;

    @FindBy(xpath="//input[@id='telephoneno']")
    public WebElement phoneNumber;

    @FindBy(xpath="//input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//h1")
    public WebElement details;

    @FindBy(xpath = "(//h3)[1]")
    public WebElement costumerID;

    @FindBy(xpath = "//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']")
    public WebElement iframe;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement reklamKapat;

    @FindBy(xpath = "(//*[@href='cardnumber.php'])[1]")
    public WebElement cardcreate;

    @FindBy(xpath = "(//h4)[1]")
    public WebElement CardNumber;

    @FindBy(xpath = "//*[@id='three']/div/h4[2]")
    public WebElement CVVNumber;

    @FindBy(xpath = "(//h4)[3]")
    public WebElement ExpDate;

    @FindBy(xpath = "(//h4)[4]")
    public WebElement CrediLimit;

}