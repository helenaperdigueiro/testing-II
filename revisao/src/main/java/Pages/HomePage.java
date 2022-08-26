package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    protected static final By sauceLabsBackpackBtnSelector = By.id("add-to-cart-sauce-labs-backpack");
    protected static final By cartBtnSelector = By.className("shopping_cart_link");
    protected static final By productTitleSelector = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    public void addProductToCart() {
        WebElement sauceLabsBackpackBtn = getWebElement(sauceLabsBackpackBtnSelector);
        sauceLabsBackpackBtn.click();
    }

    public void goToCart() {
        WebElement cartBtn = getWebElement(cartBtnSelector);
        cartBtn.click();
    }

    public String getProductTitle() {
        WebElement productTitle = getWebElement(productTitleSelector);
        return productTitle.getText();
    }
}
