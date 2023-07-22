 
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

 
public class UrlSelenium {
   private int screenshotNum=0;
   private WebDriver driver=null;
 
   public UrlSelenium(int screenshotNum, WebDriver driver) {
       this.driver = driver;
       this.screenshotNum = screenshotNum;
   }
   public void initDriver()
     {
        //   System.setProperty("webdriver.chrome.driver", "chromedriver");
        //   this.driver=new ChromeDriver();
        //   this.driver.manage().window().setPosition(new Point(-2000, 0));
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

     }
 

     public void capture(String site) throws IOException
     {
          this.screenshotNum++;
          this.driver.get(site);
          File scrFile = ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(scrFile, new File("selenium-"+screenshotNum+".png"));
          System.out.println("Took Screenshot for "+site+" and saved as "+"site"+screenshotNum+".png");
     }
 
     public void destroy()
     {
          this.driver.quit();
     }
}