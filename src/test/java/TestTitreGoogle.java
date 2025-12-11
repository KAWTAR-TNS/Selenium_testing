import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestTitreGoogle {

    @Test
    public void testTitreGoogle() {

        System.setProperty("webdriver.edge.driver",
                "D:\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

        Assert.assertTrue(driver.getTitle().contains("Google"));

        driver.quit();
    }
}
