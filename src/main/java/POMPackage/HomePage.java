package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;

public class HomePage extends Base
{
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//li//a[text()='Log in']") private WebElement LoginButton;
	@FindBy(xpath="//div[@class='list-group']//a[text()='Phones']") private WebElement Phoneslink;
	@FindBy(xpath="//div[@class='list-group']//a[text()='Laptops']") private WebElement Laptopslink;
	@FindBy(xpath="//div[@class='list-group']//a[text()='Monitors']") private WebElement Monitorslink;
	
	public Login ClickOnLoginLink()
	{
		Actions act= new Actions(driver);
		act.moveToElement(LoginButton).click().perform();
		
		return new Login();
	}
	
	public boolean ClickOnLoginlink()
	{
		return LoginButton.isEnabled();
	}
	
	public boolean CheckPhonesLinkEnabled()
	{
		
		return Laptopslink.isEnabled();
	}
	
	public boolean CheckLaptopLinkEnabled()
	{
		
		return Laptopslink.isEnabled();
	}
	
	public boolean CheckMonitorsLinkEnabled()
	{
		
		return Laptopslink.isEnabled();
	}
	
	public LaptopsPage ClickOnLaptopsLink()
	{
        Actions act= new Actions(driver);
		act.moveToElement(Laptopslink).click().perform();
		System.out.println("Clicked on the Laptops Link");
		return new LaptopsPage();
	}
}
