import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class  RechercheImage {
    @Test
    public void testRechercheValide() {

        System.setProperty("webdriver.edge.driver",
                "D:\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://Image.google.com");

        WebElement champ = driver.findElement(By.name("q"));
        champ.sendKeys("The weeknd");
        champ.submit();

        // Attente explicite
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains("Selenium WebDriver"));

        Assert.assertTrue(driver.getTitle().contains("Selenium WebDriver"));

        driver.quit();
    }
}