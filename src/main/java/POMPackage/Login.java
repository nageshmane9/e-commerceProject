package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;

public class Login extends Base
{

	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div//input[@id='loginusername']") private WebElement EnterUsernamefield;
	@FindBy(xpath="//div//input[@id='loginpassword']") private WebElement EnterPasswordfield;
	@FindBy(xpath="//div[@id='logInModal']//button[text()='Close']") private WebElement CloseButton;
	@FindBy(xpath="//div[@id='logInModal']//button[text()='Log in']") private WebElement LoginButton;
	@FindBy(xpath="//div[@id='logInModal']//span[@aria-hidden='true']") private WebElement XMark;
	
	public void EnterUsername(String username)
	{
		EnterUsernamefield.sendKeys(username);
		System.out.println("Username Entered");
	}
	
	public void EnterPassword(String pass)
	{
		EnterPasswordfield.sendKeys(pass);
		System.out.println("Password Entered");
	}
	
	public void ClickOnCloseButton()
	{
		CloseButton.click();
		System.out.println("Clicked on the close button");
	}
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
		System.out.println("Clicked on the login button");
	}
	
	public boolean ClickOnXmark()
	{
		return XMark.isEnabled();
	}
}
