import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RechercheGoogle {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver",
                "D:\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://image.google.com");
        driver.manage().window().maximize();

        WebElement champRecherche = driver.findElement(By.name("q"));

        champRecherche.sendKeys("The weeknd");

        champRecherche.submit();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        System.out.println("Titre après recherche : " + driver.getTitle());

        driver.quit();
    }
}
