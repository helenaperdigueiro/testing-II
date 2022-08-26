import Base.BasePage;
import Pages.LoginPage;
import org.junit.jupiter.api.*;

public class LoginTest {

    private static LoginPage loginPage = new LoginPage();

    @BeforeEach
    public void setUp() {
        loginPage.openApp();
    }

    @Test
    public void login() throws InterruptedException{
        loginPage.insertLoginData("standard_user", "secret_sauce");
        loginPage.login();
        String pageTitle = loginPage.getPageTitle();
        Assertions.assertEquals("PRODUCTS", pageTitle);
    }

    @AfterEach
    public void closeApp() {
        BasePage.driver.close();
    }


    public static void loginForOtherTests() throws InterruptedException{
        loginPage.insertLoginData("standard_user", "secret_sauce");
        loginPage.login();
    }

}
