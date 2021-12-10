package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import configuration.PageFactory;

public class EnterInsuranceDataPage extends PageFactory {

	@FindBy(how = How.ID, using ="firstname")
	public WebElement FldFirstName;
	
	@FindBy(how = How.ID, using ="lastname")
	public WebElement FldLastName;
	
	@FindBy(how = How.ID, using ="birthdate")
	public WebElement FldBirthdate;
	
	@FindBy(how = How.NAME, using ="Gender")
	public List<WebElement> RdGender;
	
	@FindBy(how = How.ID, using ="streetaddress")
	public WebElement FldStreetAddress;
	
	@FindBy(how = How.ID, using ="country")
	public WebElement CmbCountry;
	
	@FindBy(how = How.ID, using ="zipcode")
	public WebElement FldZipCode;
	
	@FindBy(how = How.ID, using ="city")
	public WebElement FldCity;
	
	@FindBy(how = How.ID, using ="occupation")
	public WebElement FldOccupation;
	
	@FindBy(how = How.XPATH, using ="//input[@name='Hobbies']")
	public List<WebElement> ChkHobbies;
	
	@FindBy(how = How.ID, using ="website")
	public WebElement FldWebsite;
	
	@FindBy(how = How.ID, using ="picturecontainer")
	public WebElement FldUpload;
	
	@FindBy(how = How.ID, using="nextenterproductdata")
	public WebElement BtnNext;
}
