import Pages.SearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchPageTest {

    private static SearchPage searchPage = new SearchPage();

    @BeforeEach
    public void setUp() {
        searchPage.openApp();
    }

    @Test
    public void searchAndAddProductToCart() throws InterruptedException{
        searchPage.searchProduct("Iphone");
        Thread.sleep(1000);
        searchPage.addProductToCart();
        Thread.sleep(1000);
        String addedProductToCartMessage = searchPage.getAddedProductToCartMessage();
        Assertions.assertTrue(addedProductToCartMessage.contains("Success: You have added iPhone to your shopping cart!"));
    }

    @AfterEach
    public void closeApp() {
        searchPage.closeApp();
    }

}
