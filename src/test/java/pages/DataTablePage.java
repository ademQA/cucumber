package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablePage {
    public DataTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@class=\"dt-button buttons-create\"]")
    public WebElement newButonu;
    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameElement;
    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameElement;
    @FindBy(id = "DTE_Field_position")
    public WebElement position;
    @FindBy(id = "DTE_Field_office")
    public WebElement ofis;
    @FindBy(id = "DTE_Field_extn")
    public WebElement tel;
    @FindBy(id = "DTE_Field_start_date")
    public WebElement tarih;
    @FindBy(id = "DTE_Field_salary")
    public WebElement maas;
    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createButonu;
    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchButonu;
    @FindBy(xpath = "//td[@class=\"sorting_1\"]")
    public WebElement sonucElementi;
}