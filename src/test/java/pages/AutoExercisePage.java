package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class AutoExercisePage {

    public AutoExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement ilkSignupButonu;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameKutusu;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signUpButonu;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement genderRadioButton;

    @FindBy(xpath = "//*[@href='/products']")
    public WebElement products;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allproducts;

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@class='fa fa-search']")
    public  WebElement searchButton;

    @FindBy(xpath = "//*[@href='/product_details/30']")
    public WebElement productview;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement productName;

    @FindBy(xpath="//*[@id='ad_iframe]")
    public WebElement iframe;

    @FindBy(xpath = "//*[@class='ns-cns63-e-7'")
    public WebElement reklamkapat;
    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement reklam2kapat;


}