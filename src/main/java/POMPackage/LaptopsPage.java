package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;

public class LaptopsPage extends Base
{

	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy() private WebElement MacbookAir;
	
	public boolean CheckMacBookAirEnabled()
	{
		return MacbookAir.isEnabled();
	}
	
	public void ClickOnMacBookAir()
	{
		MacbookAir.click();
		System.out.println("Clicked on macbookAir");
	}
	

	
	
	
	
}
