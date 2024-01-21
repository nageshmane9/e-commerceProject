package com.demoblazeTests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base;
import POMPackage.HomePage;



public class HomePageTests extends Base
{
	
	HomePage home;

	@BeforeMethod
	public void SetUp() throws IOException  
	{
			Inialization();
			home = new HomePage();
			
	}
	
	@Test
	public void ValidateHomeTitle()
	{
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected=prop.getProperty("HomeTitle");
		
		Assert.assertEquals(actual, expected);	
	}
	
	@Test
	public void ValidateHomeURL()
	{
		String actual=driver.getCurrentUrl();
		System.out.println(actual);
		String expected=prop.getProperty("HomeURL");
		
		Assert.assertEquals(actual, expected);	
	}
	
	@Test
	public void ValidateLoginLink()
	{
		boolean actual=home.ClickOnLoginlink();
		
		assertTrue(actual);
	}
	
	@Test
	public void Validatelaptopslink()
	{
		boolean actual=home.CheckLaptopLinkEnabled();
		System.out.println(actual);
		assertTrue(actual);
	}
	

	@Test
	public void ValidatePhoneslink()
	{
		boolean actual=home.CheckPhonesLinkEnabled();
		System.out.println(actual);
		assertTrue(actual);
	}
	

	@Test
	public void ValidateMonitorslink()
	{
		boolean actual=home.CheckMonitorsLinkEnabled();
		System.out.println(actual);
		assertTrue(actual);
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
}
