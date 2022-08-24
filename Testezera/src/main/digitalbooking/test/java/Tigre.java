import Base.BasePage;
import Pages.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Tigre {

    private static WebDriver driver;

    @BeforeAll
    static void setUp() {
        BasePage basePage = new BasePage();
        basePage.openApp();
        driver = basePage.getDriver();
    }

    @Test
    public void testSearch() throws InterruptedException {

        SearchPage page = new SearchPage();
        page.buscarCidade("Tigre");
        page.buscar();
        String resultadoBusca = page.getResultado();

        assertTrue(resultadoBusca.contains("La Carmelita"));

        System.out.println("Resultado:" + resultadoBusca);
        Thread.sleep(5000);

    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
