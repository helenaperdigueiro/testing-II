package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    protected static final By usernameInputSelector = By.id("user-name");
    protected static final By passwordInputSelector = By.id("password");
    protected static final By loginBtnSelector = By.id("login-button");
    protected static final By pageTitleSelector = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public void insertLoginData(String username, String password) {
        WebElement usernameInput = getWebElement(usernameInputSelector);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        WebElement passwordInput = getWebElement(passwordInputSelector);
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void login() {
        WebElement loginBtn = getWebElement(loginBtnSelector);
        loginBtn.click();
    }

    public String getPageTitle() {
        WebElement pageTitle = getWebElement(pageTitleSelector);
        return pageTitle.getText();
    }

}
