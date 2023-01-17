import org.example.anket;

import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)


public class besttest {
    anket anket;

    protected WebDriver driver;
    @BeforeAll
    public void setup(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        System.out.println("testiniz başlanmıştı: ");
        


    }
    @BeforeEach
    public void breforeach(){
        driver=new ChromeDriver();
        driver.get("http://elvanduman.com/");
        anket =new anket(driver);

    }
    @AfterEach
    public void cikis(){
        driver.findElement(By.cssSelector(".form-control[name='secenek']")).click();

        driver.findElement(By.cssSelector("option[value='2']")).click();
        driver.quit();

    }








}
