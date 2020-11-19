package KinCart.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Navigate {
    @Test
    public void firstStep() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Alexa");
        WebElement clickButtton =driver.findElement(By.id("nav-search-submit-text"));
        clickButtton.click();
        Thread.sleep(1000);
        WebElement thirdItem = driver.findElement(By.xpath("//div/h2/a/span[@dir='auto']"));
        thirdItem.click();
        Assert.assertTrue(thirdItem.isSelected());

    }

}
