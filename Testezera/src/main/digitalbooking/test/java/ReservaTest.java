import Base.BasePage;
import Pages.LoginPage;
import Pages.SearchPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ReservaTest {

    private static WebDriver driver;

    @BeforeEach
    public void setUp() {
        BasePage basePage = new BasePage();
        basePage.openApp();
        driver = basePage.getDriver();
    }

    @Test
    public void testSearch() throws InterruptedException {

        LoginPage login = new LoginPage();
        login.irParaIniciarSessao();
        Thread.sleep(2000);
        login.inserirDadosLogin("tgomes@digitalhouse.com","turma01");
        Thread.sleep(2000);
        login.fazerLogin();
        Thread.sleep(2000);

        SearchPage search = new SearchPage();
        search.buscarCidade("Tigre");
        Thread.sleep(2000);
        search.buscar();
        Thread.sleep(2000);
        search.verDetalhe();
        Thread.sleep(2000);
        search.iniciarReserva();
        Thread.sleep(2000);
        search.preencherCidade("Buenos Aires");
        Thread.sleep(2000);
        search.confirmaReserva();
        Thread.sleep(2000);
        String mensagemErro = search.getMensagemErro();

        assertTrue(mensagemErro.contains("Falta completar campos obligatorios"));

        System.out.println("Resultado:" + mensagemErro);
    }

    @Test
    public void testSearch2() throws InterruptedException {

        SearchPage page = new SearchPage();
        page.inserirData("20/04/2023 - 22/04/2023");
        page.buscar();
        Thread.sleep(2000);
        String resultadoBusca = page.getResultado();

        assertTrue(resultadoBusca.contains("Hermosa"));
        assertTrue(resultadoBusca.contains("Exclusivo"));
        assertTrue(resultadoBusca.contains("Kantounes"));
        assertTrue(resultadoBusca.contains("Soñada"));
        Thread.sleep(2000);
        System.out.println("Resultado:" + resultadoBusca);
    }

    @Test
    public void testSearch3() throws InterruptedException {

        SearchPage page = new SearchPage();
        page.buscarCidade("Carilo");
        page.buscar();
        String resultadoBusca = page.getResultado();

        assertTrue(resultadoBusca.contains("Increíble Casa c/ Piscina, WiFi, Bosque y Playa en Carilo"));

        System.out.println("Resultado:" + resultadoBusca);
        Thread.sleep(2000);

    }

    @Test
    public void testSearch4() throws InterruptedException {

        SearchPage page = new SearchPage();
        page.buscarCidade("Tigre");
        page.buscar();
        String resultadoBusca = page.getResultado();

        assertTrue(resultadoBusca.contains("La Carmelita"));

        System.out.println("Resultado:" + resultadoBusca);
        Thread.sleep(2000);

    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
