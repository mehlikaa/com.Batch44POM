package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelProjePage04 {

    public HotelProjePage04(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement hotelLoginButton;

    @FindBy(id="UserName")      ////input[@id='UserName']
    public WebElement hotelUsername;

    @FindBy(id="Password")
    public WebElement hotelPassword;

    @FindBy(id="btnSubmit")
    public WebElement hotelManagerLogin;

    @FindBy(xpath = "//span[text()='System Management']")
    public WebElement systemManagementLink;

    //@FindBy(linkText = "Hotel Management")
    //    @FindBy(xpath = "(//i[@class='icon-users'])[2]")
    //@FindBy(xpath = "(//span[@class='arrow'])[2]")

    //@FindBy(xpath = "//a[@id='menuHotels']")
    //@FindBy(xpath = "//span[text()='Hotel Management']")
    //public WebElement hotelManagementLink;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagerButonuWebElement;

    //(//span[@class='arrow'])[2]
    //@FindBy(xpath = "(//a/i[@class='icon-calendar'])[1]")
    @FindBy(xpath = "//i[@class='icon-calendar'])[2]")
    //@FindBy(xpath = "(//a/i[@class='icon-calendar'])[1]")
    public WebElement hotelListLink;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement hotelEkleButton;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeInputBox;



    //        @FindBy(xpath = "//span[text()=‘Hotel Management’]")
    //        public WebElement hotelManagementLinki;
    //
    ////        @FindBy(xpath = "//a[text()='Hotel List']")
    ////        public WebElement hotelListLinki;
    //
    //        @FindBy(xpath = "(//a/i[@class='icon-calendar'])[1]")
    //        public WebElement hotelListLink;
    //
    //        @FindBy(xpath = "//a[@href='/admin/userAdmin/Create']")
    //        public WebElement addHotelLinki;

    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
