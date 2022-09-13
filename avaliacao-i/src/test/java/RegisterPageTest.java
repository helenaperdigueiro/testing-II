import Pages.RegisterPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegisterPageTest {

    private static RegisterPage registerPage = new RegisterPage();

    @BeforeEach
    public void setUp() {
        registerPage.openApp();
    }

    @Test
    public void register() throws InterruptedException{
        registerPage.goToRegister();
        Thread.sleep(2000);
        //Se for rodar mais de 1 vez, é necessário trocar o email
        registerPage.insertRegisterData("Helena", "Perdigueiro", "helena.teste.1@gmail.com", "12345678", "helena", "helena");
        registerPage.register();
        Thread.sleep(2000);
        String registerMessage = registerPage.getRegisterMessage();
        Assertions.assertTrue(registerMessage.contains("Congratulations! Your new account has been successfully created!"));
    }

    @AfterEach
    public void closeApp() {
        registerPage.closeApp();
    }

}
