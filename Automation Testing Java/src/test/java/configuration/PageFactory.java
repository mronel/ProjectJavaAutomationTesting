package configuration;

public class PageFactory {

	public PageFactory() {
		org.openqa.selenium.support.PageFactory.initElements(DriverFactory.GetDriver(), this);
	}	
}
