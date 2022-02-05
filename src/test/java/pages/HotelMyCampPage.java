package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

    public class HotelMyCampPage {
        public WebElement tryAgain;

        public HotelMyCampPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(xpath = "//a[text()='Log in']")
        public WebElement ilkLoginLinki;

        @FindBy(xpath = "//input[@id='UserName']")
        public WebElement usernameBox;

        @FindBy(xpath = "//input[@id='Password']")
        public WebElement passwordBox;

        @FindBy(xpath = "//input[@id='btnSubmit']")
        public WebElement loginButonu;

        @FindBy(xpath = "//div[@class='validation-summary-errors']")
        public WebElement girisYapilamadiYaziElementi;

        @FindBy(xpath="//span[text()='ListOfUsers']")
        public WebElement basariliGirisYaziElementi;

        @FindBy(xpath = "//span[text()=‘Hotel Management’]")
        public WebElement hotelManagementLinki;

//        @FindBy(xpath = "//a[text()='Hotel List']")
//        public WebElement hotelListLinki;

        @FindBy(xpath = "(//a/i[@class='icon-calendar'])[1]")
        public WebElement hotelListLink;

        @FindBy(xpath = "//a[@href='/admin/userAdmin/Create']")
        public WebElement addHotelLinki;

        @FindBy(xpath = "(//input[@id='Code']")
        public WebElement addHotelCodeBox;

        @FindBy ( xpath="//select[@id='IDGroup']")
        public WebElement addHotelDropDown;

        @FindBy (xpath="//button[@id='btnSubmit']")
        public WebElement addHotelSaveButton;




        public void bekle(int saniye){
            try {
                Thread.sleep(saniye*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public void girisYap(){
            Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
            ilkLoginLinki.click();
            usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
            passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
            loginButonu.click();


        }


    }