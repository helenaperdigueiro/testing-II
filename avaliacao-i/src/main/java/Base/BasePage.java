package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver = new ChromeDriver();
    protected static final String URL = "https://opencart.abstracta.us/index.php?route=common/home";

    public WebDriver getDriver() {
        return this.driver;
    }

    public void openApp() {
        getDriver().get(URL);
        getDriver().manage().window().maximize();
    }

    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try {
            element = this.driver.findElement(locator);
        } catch (Exception exc) {
            System.out.println("Elemento nao encontrado!");
            System.out.println("Mensagem de erro: " + exc);
        }
        return element;
    }

    public void closeApp() {
        getDriver().quit();
    }
}
