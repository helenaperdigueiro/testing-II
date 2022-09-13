package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

    protected static final By searchInputSelector = By.cssSelector("#search > input");
    protected static final By searchBtnSelector = By.cssSelector("#search > span > button");
    protected static final By addToCartBtnSelector = By.cssSelector("#content > div:nth-child(8) > div > div > div:nth-child(2) > div.button-group > button:nth-child(1)");
    protected static final By addedToCartMessageSelector = By.cssSelector("#product-search > div.alert.alert-success.alert-dismissible");

    public void searchProduct(String product) {
        WebElement searchInput = getWebElement(searchInputSelector);
        searchInput.clear();
        searchInput.sendKeys(product);
        WebElement searchBtn = getWebElement(searchBtnSelector);
        searchBtn.click();
    }

    public void addProductToCart() {
        WebElement addToCartBtn = getWebElement(addToCartBtnSelector);
        addToCartBtn.click();
    }

    public String getAddedProductToCartMessage() {
        WebElement addedToCartMessage = getWebElement(addedToCartMessageSelector);
        return addedToCartMessage.getText();
    }

}
