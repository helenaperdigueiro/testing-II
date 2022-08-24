package com.digitalbooking.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BasePage;

public class LoginPage extends BasePage {
	protected static final String txtIniciarSesion = "Iniciar sesión";
	protected static final String correo = "email";
	protected static final String password = "password";
	protected static final String usuario = "txt-nombre";
	protected static final String botonIngresar = "btn btn-primario btn-sm";
	protected static final String botonSalir = "salir";
	
	public void iniciarSesion() throws InterruptedException {
		WebElement botonIniciarSesion = getWebElement(By.partialLinkText(txtIniciarSesion));
		botonIniciarSesion.click();
		Thread.sleep(1000);
	}
	
	public void login(String email, String pass) {
		WebElement mail = getWebElement(By.id(correo));
		mail.clear();
		mail.sendKeys(email);
		WebElement psw = getWebElement(By.id(password));
		psw.clear();
		psw.sendKeys(pass);
	}
	
	public void ingresar() {
		//WebElement btnIngresar = getWebElement(By.className(botonIngresar));
		WebElement btnIngresar = getWebElement(By.cssSelector("button[class='"+botonIngresar+"']"));
		btnIngresar.click();
	}
	
	public String getUsuario() {
		WebElement btnIngresar = getWebElement(By.className(usuario));
		return btnIngresar.getText();
	}

}
