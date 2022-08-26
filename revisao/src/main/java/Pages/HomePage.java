package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    protected static final String sauceLabsBackpackBtnSelector = "add-to-cart-sauce-labs-backpack"; //id
    protected static final String cartBtnSelector = "shopping_cart_link"; //className
    protected static final String productTitleSelector = "//*[@id=\"item_4_title_link\"]/div"; //XPath

    public void addProductToCart() {
        WebElement sauceLabsBackpackBtn = getWebElement(By.id(sauceLabsBackpackBtnSelector));
        sauceLabsBackpackBtn.click();
    }

    public void goToCart() {
        WebElement cartBtn = getWebElement(By.className(cartBtnSelector));
        cartBtn.click();
    }

    public String getProductTitle() {
        WebElement productTitle = getWebElement(By.xpath(productTitleSelector));
        return productTitle.getText();
    }
}
