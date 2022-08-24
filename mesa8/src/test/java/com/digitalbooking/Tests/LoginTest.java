package com.digitalbooking.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;
import com.digitalbooking.Pages.LoginPage;

public class LoginTest {

	private static WebDriver driver;	
	
	@BeforeAll
	static void setUp() {
		BasePage _basePage = new BasePage();
		_basePage.openApp();
		driver = _basePage.getDriver();		
	}
	
	
	@Test
	public void testLogin() throws InterruptedException {
		
		LoginPage page = new LoginPage();
		page.iniciarSesion();
		Thread.sleep(2000);
		page.login("daniel@test.com","daniel123");
		Thread.sleep(2000);
		page.ingresar();
		Thread.sleep(2000);
		String res = page.getUsuario();
		
		assertTrue(res.contains("Daniel"));
		
		System.out.println("Usuario Logueado: " + res);
	}
	
	@AfterAll
	static void tearDown() {
		driver.quit();
	}
	
}
