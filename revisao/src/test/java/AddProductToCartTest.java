import Base.BasePage;
import Pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddProductToCartTest {

    private static HomePage homePage = new HomePage();

    @BeforeEach
    public void setUp() {
        homePage.openApp();
    }

    @Test
    public void addProductToCartTest() throws InterruptedException {
        LoginTest.loginForOtherTests();
        homePage.addProductToCart();
        homePage.goToCart();
        String productTitle = homePage.getProductTitle();
        Assertions.assertEquals("Sauce Labs Backpack", productTitle);
    }

    @AfterEach
    public void closeApp() {
        BasePage.driver.close();
    }

}
