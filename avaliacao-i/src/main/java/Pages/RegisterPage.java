package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {

    protected static final By btnMyAccountSelector = By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md");
    protected static final By btnRegisterSelector = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a");
    protected static final By firstNameInputSelector = By.cssSelector("#input-firstname");
    protected static final By lastNameInputSelector = By.cssSelector("#input-lastname");
    protected static final By emailInputSelector = By.cssSelector("#input-email");
    protected static final By telephoneInputSelector = By.cssSelector("#input-telephone");
    protected static final By passwordInputSelector = By.cssSelector("#input-password");
    protected static final By passwordConfirmInputSelector = By.cssSelector("#input-confirm");
    protected static final By newsletterRadioBtnSelector = By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(2) > input[type=radio]");
    protected static final By privacyPolicyCheckboxSelector = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
    protected static final By continueBtnSelector = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
    protected static final By registerMessageSelector = By.cssSelector("#content");

    public void goToRegister() {
        WebElement btnMyAccount = getWebElement(btnMyAccountSelector);
        btnMyAccount.click();
        WebElement btnRegister = getWebElement(btnRegisterSelector);
        btnRegister.click();
    }

    public void insertRegisterData(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        WebElement firstNameInput = getWebElement(firstNameInputSelector);
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);

        WebElement lastNameInput = getWebElement(lastNameInputSelector);
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);

        WebElement emailInput = getWebElement(emailInputSelector);
        emailInput.clear();
        emailInput.sendKeys(email);

        WebElement telephoneInput = getWebElement(telephoneInputSelector);
        telephoneInput.clear();
        telephoneInput.sendKeys(telephone);

        WebElement passwordInput = getWebElement(passwordInputSelector);
        passwordInput.clear();
        passwordInput.sendKeys(password);

        WebElement passwordConfirmInput = getWebElement(passwordConfirmInputSelector);
        passwordConfirmInput.clear();
        passwordConfirmInput.sendKeys(passwordConfirm);

        WebElement newsletterRadioBtn = getWebElement(newsletterRadioBtnSelector);
        newsletterRadioBtn.click();

        WebElement privacyPolicyCheckbox = getWebElement(privacyPolicyCheckboxSelector);
        privacyPolicyCheckbox.click();
    }

    public void register() {
        WebElement continueBtn = getWebElement(continueBtnSelector);
        continueBtn.click();
    }

    public String getRegisterMessage() {
        WebElement registerMessage = getWebElement(registerMessageSelector);
        return registerMessage.getText();
    }
}
