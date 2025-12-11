import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PremierTestSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver",
                "D:\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

        System.out.println("Titre de la page : " + driver.getTitle());

        driver.quit();
    }
}
