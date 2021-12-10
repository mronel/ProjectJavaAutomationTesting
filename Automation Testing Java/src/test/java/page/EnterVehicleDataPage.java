package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import configuration.PageFactory;

public class EnterVehicleDataPage extends PageFactory {
	
	@FindBy(how = How.ID, using="make")
	public WebElement CmbMake;
	
	@FindBy(how = How.ID, using="model")
	public WebElement CmbModel;
	
	@FindBy(how = How.ID, using="cylindercapacity")
	public WebElement FldCylinderCapacity;
	
	@FindBy(how = How.ID, using="engineperformance")
	public WebElement FldEnginePerformance;
	
	@FindBy(how = How.ID, using="dateofmanufacture")
	public WebElement FldDateOfManufacture;
	
	@FindBy(how = How.ID, using="numberofseats")
	public WebElement CmbNumberOfSeats;
		
	@FindBy(how = How.XPATH, using="//input[@name='Right Hand Drive']")
	public List<WebElement> FldRightHandDriveOption;
	
	@FindBy(how = How.ID, using="numberofseatsmotorcycle")
	public WebElement CmbNumberOfSeatsMotorcycle;
	
	@FindBy(how = How.ID, using="fuel")
	public WebElement CmbFuelType;
	
	@FindBy(how = How.ID, using="payload")
	public WebElement FldPayload;
	
	@FindBy(how = How.ID, using="totalweight")
	public WebElement FldTotalWeight;
	
	@FindBy(how = How.ID, using="listprice")
	public WebElement FldListPrice;
	
	@FindBy(how = How.ID, using="licenseplatenumber")
	public WebElement FldLicensePlateNumber;
	
	@FindBy(how = How.ID, using="annualmileage")
	public WebElement FldAnnualMileage;
	
	@FindBy(how = How.ID, using="nextenterinsurantdata")
	public WebElement BtnNext;
	
}
