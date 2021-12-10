package support;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import configuration.DriverFactory;

public class Extensions {
	
	private JavascriptExecutor executor = (JavascriptExecutor)DriverFactory.driver;
	
	public void selectElementOnDropDownWebElement(WebElement dropdown, String selectValue) {
		Select select = new Select(dropdown);
		select.selectByValue(selectValue);
	}
	public void clickRadioButton(List<WebElement> elements, String selectByValue) {		
		
		for(int i = 0; i <= elements.size(); i++) {
			if(elements.get(i).getAttribute("value").equals(selectByValue)) {
				executor.executeScript("arguments[0].click();", elements.get(i));
				break;
			}
		}
	}
	
	public void selectCheckBoxes(List<WebElement> elements, List<String> selectByValue) {

		 elements.forEach(element -> { 
			 selectByValue.forEach(val -> {
				 if(element.getAttribute("value").equals(val)) {
					 executor.executeScript("arguments[0].click();",element); 
				 } 
			 }); 
		 });
	}

}
