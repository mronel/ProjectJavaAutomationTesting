package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import configuration.PageFactory;

public class Menus extends PageFactory {

	@FindBy(how = How.ID, using="entervehicledata")
	public WebElement MnuVehicleData;
	
	@FindBy(how = How.ID, using="enterinsurantdata")
	public WebElement MnuInsurantData;
	
	@FindBy(how = How.ID, using="enterproductdata")
	public WebElement MnuProductData;
	
	@FindBy(how = How.ID, using="selectpriceoption")
	public WebElement MnuPriceOption;
	
	@FindBy(how = How.ID, using="sendquote")
	public WebElement MnuSendQuote;
	
}
