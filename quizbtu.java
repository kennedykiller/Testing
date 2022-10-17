import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class Tests {

    WebDriver driver;

    public Tests() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
public class LoginUsingSelenium {
    @Test public void login() {
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");

        WebElement username=driver.findElement(By.id("test123"));
        WebElement password=driver.findElement(By.id("automation@123"));
        WebElement login=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        username.sendKeys(test123); password.sendKeys("automation@123");
        login.click(); String actualUrl="\"https://demoqa.com/login\"";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl); }   }






@test
public void bookDetails() {
    driver.get("https://demoqa.com/books");
    driver.manage().window().maximize();

    WebElement details = driver.findElement(By.xPath("//*[@id="app"]/div/div/div[2]/div[2]/div[2])");
    details.click();

}


@test
public void gitpocket() {
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();


        WebElement books = driver.findElement(By.xPath("https://demoqa.com/books"));
        books.click();
        }

        @test
        public void collection() {
            driver.get("https://demoqa.com/books?book=9781449325862");
            driver.manage().window().maximize();

            WebElement addBook = driver.findElement(By.Xpath("//*[@id="addNewRecordButton"]");
            addBook.click();
        }
        @test
        public void backToBookstore() {
            driver.get("https://demoqa.com/books?book=9781449325862");
            driver.manage().window().maximize();
            WebElement goBack = driver.findElement(By.xPath("//*[@id=\"addNewRecordButton\"]");
            goBack.click();

        }

