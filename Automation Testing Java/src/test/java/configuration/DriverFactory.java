package configuration;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;


public final class DriverFactory {

	public static WebDriver driver;
	public static JSONObject testParameters;
		
	public static void InitializeWebDriver() {
		GetParameters();
		DriverConfiguration();
	}
	
	private static void DriverConfiguration() {
		
		switch(Browser()) {
			
		case "chrome":
			WebDriverManager.getInstance(DriverManagerType.CHROME).setup(); 
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(TimeOut(), TimeUnit.SECONDS);
			driver.manage().window().maximize();
			break;
			
		case "firefox":
			WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup(); 
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(TimeOut(), TimeUnit.SECONDS);
			driver.manage().window().maximize();
			break;
			
		default:
			driver = null;
			throw new WebDriverException("WebDriver não instanciado - informar o browser nos parametros de configuração do projeto. Opções: chrome/firefox");
		}
	}

	public static WebDriver GetDriver() {
		return driver;
	}
	
	public static void QuitDriver() {
		if( driver != null) {
			driver.quit();
		} else {
			throw new WebDriverException("Instância de WebDriver não encontrado...");
		}
	}

	private static void GetParameters(){
		JSONParser parser = new JSONParser();
		try 
		{
			Object obj = parser.parse(new FileReader("src/test/java/configuration/testparameters.json"));
			testParameters = (JSONObject) obj;
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static String Browser() {
		return testParameters.get("browser").toString();
	}
	
	public static String BaseUrl() {
		return testParameters.get("baseurl").toString();
	}
	
	private static long TimeOut() {
		return Long.parseLong(testParameters.get("timeout").toString());
	}
	
	public static String Screenshot() {
		return testParameters.get("screenshot").toString();
	}
	
}
