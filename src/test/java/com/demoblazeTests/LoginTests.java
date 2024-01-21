package com.demoblazeTests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base;
import POMPackage.HomePage;
import POMPackage.Login;

public class LoginTests extends Base
{

	HomePage home;
    Login login;
	@BeforeMethod
	public void SetUp() throws IOException  
	{
			Inialization();
			home = new HomePage();
			login=home.ClickOnLoginLink();
	}
	
	@Test
	public void ValidateLoginLink()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String expectedTitle=prop.getProperty("Logintitle");
		
		Assert.assertEquals(title, expectedTitle);
	}
	
	@Test
	public void ValidateXmark()
	{
		boolean actual=login.ClickOnXmark();
		
		assertTrue(actual);
	}
	
	@Test
	public void LoginWithValidCredential() 
	{
	    
	      
		login.EnterUsername("Delphitest");
		login.EnterPassword("Delphi@123");
		login.ClickOnLoginButton();
		
		String actual = driver.getTitle();    System.out.println(actual);
		String expected=prop.getProperty("Logintitle");
		
		Assert.assertEquals(actual,expected); 
		
	}
	
	@Test
	public void LoginWithBlanckUsername()
	{
		login.EnterUsername("");
		login.EnterPassword("");
		login.ClickOnLoginButton();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();	
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
