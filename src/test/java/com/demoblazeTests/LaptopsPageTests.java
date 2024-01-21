package com.demoblazeTests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base;
import POMPackage.HomePage;
import POMPackage.LaptopsPage;
import POMPackage.Login;

public class LaptopsPageTests extends Base
{
	

	HomePage home;
    LaptopsPage laptop;
    Login login;
	@BeforeMethod
	public void SetUp() throws IOException  
	{
			Inialization();
			home = new HomePage();
			login= new Login();
			home.ClickOnLoginLink();
			login.EnterUsername("Delphitest");
			login.EnterPassword("Delphi@123");
			login.ClickOnLoginButton();
			laptop=home.ClickOnLaptopsLink();
				
	}
	
	@Test
	public void ValidateMacbooklink()
	{
		boolean actual=laptop.CheckMacBookAirEnabled();
		System.out.println(actual);
		
		assertTrue(actual);
	}

}
