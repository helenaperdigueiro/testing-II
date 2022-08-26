package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    protected static final String usernameInputSelector = "user-name"; //id
    protected static final String passwordInputSelector = "password"; //id
    protected static final String loginBtnSelector = "login-button"; //id
    protected static final String pageTitleSelector = "//*[@id=\"header_container\"]/div[2]/span"; //XPath

    public void insertLoginData(String username, String password) {
        WebElement usernameInput = getWebElement(By.id(usernameInputSelector));
        usernameInput.clear();
        usernameInput.sendKeys(username);
        WebElement passwordInput = getWebElement(By.id(passwordInputSelector));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void login() {
        WebElement loginBtn = getWebElement(By.id(loginBtnSelector));
        loginBtn.click();
    }

    public String getPageTitle() {
        WebElement pageTitle = getWebElement(By.xpath(pageTitleSelector));
        return pageTitle.getText();
    }

}
