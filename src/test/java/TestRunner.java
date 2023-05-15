import org.example.RegisterForm;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        //Set the Chrome driver
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        //Facem un obiect de tip
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    //Aici facem testele pentru site, prin crearea unui nou obiect de tip RegisterForm
    public void runTests(){

        RegisterForm registerPage = new RegisterForm(driver);
        registerPage.HomePage();
        registerPage.EnterFirstName("Adrian");
        registerPage.EnterLastName("Inculet");
        registerPage.Adress("Iasi,Romania");
        registerPage.Email("adrian.inculet2@gmail.com");
        registerPage.phoneNumber("0741429568");
        registerPage.selectGender("Male");
        registerPage.selectHobies();
        registerPage.selectLanguage();
        registerPage.selectSkills("Java");
        registerPage.selectCountry("Japan");
        registerPage.setDateOfBirth("September", "1998", "11");
        registerPage.setPassword("AvadaKadavra","AvadaKadavra");
        //registerpage.selectRefresh();
        registerPage.clickSubmit();
    }



}

