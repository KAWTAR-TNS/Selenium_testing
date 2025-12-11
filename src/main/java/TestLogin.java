import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLogin {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver",
                "D:\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("file:///D:\\S9\\Qualité\\TPs\\TP_Selenium\\src\\main\\java\\login.html");

        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.id("loginBtn"));

        usernameField.sendKeys("user_test");
        passwordField.sendKeys("wrong_password");
        loginButton.click();

        WebElement msgErreur = driver.findElement(By.id("errorMsg"));

        System.out.println("Message : " + msgErreur.getText());

        driver.quit();
    }
}
