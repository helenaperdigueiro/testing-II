package com.digitalbooking.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;

import com.base.BasePage;
import com.digitalbooking.Pages.SearchPage;

public class SearchTest {
	
	private WebDriver driver;
	
	@BeforeAll
	public void setUp() {
		BasePage _basePage = new BasePage();
		_basePage.openApp();
		driver = _basePage.getDriver();		
	}
	
	
	@Test
	public void testSearch() throws InterruptedException {
		
		SearchPage page = new SearchPage();
		page.buscarCiudad("punta del este");
		Thread.sleep(2000);
		page.buscar();
		Thread.sleep(2000);
		String res = page.getResultado();
		
		assertTrue(res.contains("Villa Kantounes Studio Ostria"));
		
		System.out.println("Resultado Card value: " + res);
	}
	
	@AfterAll
	public void tearDown() {
		driver.quit();
	}
	
}
