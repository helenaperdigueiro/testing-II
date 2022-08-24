package com.digitalbooking.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.base.BasePage;

public class SearchPage extends BasePage {
	
	protected static final String ciudadID = "ciudad";
	protected static final String botonBuscar = "btn-buscador";
	protected static final String resultadoID = "card-list";

	public void buscarCiudad(String ciudad) throws InterruptedException {
		WebElement searchBox = getWebElement(By.id(ciudadID));
		searchBox.clear();
		searchBox.sendKeys(ciudad);
		Thread.sleep(1000);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public String getResultado() {
		WebElement resultado = getWebElement(By.className(resultadoID));
		return resultado.getText();
	}
	
	public void buscar() {
		WebElement buscar = getWebElement(By.id(botonBuscar));
		buscar.click();
	}
	
	
}
