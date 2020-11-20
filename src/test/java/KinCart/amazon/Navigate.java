package KinCart.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class Navigate {
    @Test
    public void firstStep() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Alexa");


        WebElement searchButton=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']/input"));
        searchButton.click();

        WebElement nextButton=driver.findElement(By.xpath("//a[.='Next→']"));
        nextButton.click();

        WebElement thirdItem=driver.findElement(By.xpath("(//div[@data-component-type=\"s-search-result\"]//h2//a)[3]"));
        String actual=thirdItem.getText();
        thirdItem.click();


        WebElement productTitle=driver.findElement(By.id("productTitle"));
        String expected=productTitle.getText();
        Assert.assertEquals(actual,expected);









    }

}
