package day4.browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


        public class FacebookLogin {

        public static void main(String[] args) {
        // TODO Auto-generated method stub

       // String expath = "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http:\\www.facebook.com");


        WebElement element1 = driver.findElement(By.id("email"));
        element1.sendKeys("aakash2000mahjan@gmail.com");

        WebElement element2 = driver.findElement(By.id("pass"));
        element2.sendKeys("aakashas1234");

        WebElement element3 = driver.findElement(By.id("u_0_q"));
        element3.click();

        System.out.println("Login");



        WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
        lstitem.click();
       

        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

        driver.findElement(By.partialLinkText("Log in")).click();

        System.out.println("Log in");
    }

		
}
  







