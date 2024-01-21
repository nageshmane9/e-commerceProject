package BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{

	public static WebDriver driver;
	public static Properties prop;
	
	public static String projectpath=System.getProperty("user.dir");

	public static void Inialization() throws IOException
	{
		
		 driver= new ChromeDriver();
		
		FileInputStream file= new FileInputStream(projectpath+"\\src\\main\\resources\\config.properties");
		
		 prop= new Properties();
		
		prop.load(file);
		
		driver.get(prop.getProperty("WebURL"));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
}
