package stepdefinition;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import configuration.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.EnterInsuranceDataPage;
import page.EnterVehicleDataPage;
import page.Menus;
import support.Extensions;

public class VehicleInsuranceApplicationStepDefinition extends Extensions {

	private Menus menus;
	private EnterVehicleDataPage vehicleDataPage;
	private EnterInsuranceDataPage insuranceDataPage;
	
	List<String> hobbies = new ArrayList<String>();
	
	public VehicleInsuranceApplicationStepDefinition() {
		menus = new Menus();
		vehicleDataPage = new EnterVehicleDataPage();
		insuranceDataPage = new EnterInsuranceDataPage();
	}
	
	/* ========================  Enter Vehicle Data ================================================*/
	
	@Given("I am on the Enter Vehicle Data screen")
	public void i_am_on_the_enter_vehicle_data_screen() {
		DriverFactory.driver.navigate().to(DriverFactory.BaseUrl());
	    Assert.assertTrue("[Error] Verify application access.", menus.MnuVehicleData.isDisplayed());
	}

	@Given("the Enter Vehicle Data is selected")
	public void the_enter_vehicle_data_is_selected() {
		Assert.assertTrue("[Error] Element is not displayed...", menus.MnuVehicleData.isDisplayed());
	    menus.MnuVehicleData.click();
	}

	@When("I select the value {string} on Make field")
	public void i_select_the_value_on_make_field(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.CmbMake.isDisplayed());
	    selectElementOnDropDownWebElement(vehicleDataPage.CmbMake, value);
	}

	@When("I select the value {string} on Model field")
	public void i_select_the_value_on_model_field(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.CmbModel.isDisplayed());
		selectElementOnDropDownWebElement(vehicleDataPage.CmbModel, value);
	}

	@When("I fill the input Cylinder Capacity with value {string}")
	public void i_fill_the_input_cylinder_capacity_with_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.FldCylinderCapacity.isDisplayed());
	    vehicleDataPage.FldCylinderCapacity.sendKeys(value);
	}

	@When("I fill the input Engine Performance with value {string}")
	public void i_fill_the_input_engine_performance_with_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.FldEnginePerformance.isDisplayed());
		vehicleDataPage.FldEnginePerformance.sendKeys(value);
	}

	@When("I fill the input Date of Manufacture with currenty date")
	public void i_fill_the_input_date_of_manufacture_with_currenty_date() {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.FldDateOfManufacture.isDisplayed());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		vehicleDataPage.FldDateOfManufacture.sendKeys(LocalDateTime.now().format(formatter));
	}

	@When("I select the value {string} on Number of Seats field")
	public void i_select_the_value_on_number_of_seats_field(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.CmbNumberOfSeats.isDisplayed());
	    selectElementOnDropDownWebElement(vehicleDataPage.CmbNumberOfSeats, value);
	}
	
	@When("I check a value {string} on Right Hand Drive field")
	public void i_check_a_value_on_right_hand_drive_field(String option) {
		clickRadioButton(vehicleDataPage.FldRightHandDriveOption,option);
	}

	@When("I select the value {string} on Number of Seats Motorcycle field")
	public void i_select_the_value_on_number_of_seats_motorcycle_field(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.CmbNumberOfSeatsMotorcycle.isDisplayed());
		selectElementOnDropDownWebElement(vehicleDataPage.CmbNumberOfSeatsMotorcycle, value);
	}

	@When("I fill the input Fuel Type with value {string}")
	public void i_fill_the_input_fuel_type_with_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.CmbFuelType.isDisplayed());
	    selectElementOnDropDownWebElement(vehicleDataPage.CmbFuelType,value);
	}

	@When("I fill the input Payload with value {string}")
	public void i_fill_the_input_payload_with_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.FldPayload.isDisplayed());
	    vehicleDataPage.FldPayload.sendKeys(value);
	}

	@When("I fill the input Total Weight with value {string}")
	public void i_fill_the_input_total_weight_with_value(String value) {
	    vehicleDataPage.FldTotalWeight.sendKeys(value);
	}

	@When("I fill the input List Price with value {string}")
	public void i_fill_the_input_list_price_with_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.FldListPrice.isDisplayed());
		vehicleDataPage.FldListPrice.sendKeys(value);
	}

	@When("I fill the input License Plate Number with value {string}")
	public void i_fill_the_input_license_plate_number_with_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.FldLicensePlateNumber.isDisplayed());
		vehicleDataPage.FldLicensePlateNumber.sendKeys(value);
	}

	@When("I fill the input Annual Mileage with value {string}")
	public void i_fill_the_input_annual_mileage_with_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.FldAnnualMileage.isDisplayed());
	    vehicleDataPage.FldAnnualMileage.sendKeys(value);
	}

	@Then("I press the Next button")
	public void i_press_the_next_button() {
		Assert.assertTrue("[Error] Element is not displayed...", vehicleDataPage.BtnNext.isEnabled());
	    vehicleDataPage.BtnNext.click();
	}

	/* ========================  Enter Insurance Data ================================================*/
	
	@When("I am on the Enter Insurance Data screen")
	public void i_am_on_the_enter_insurance_data_screen() {
		Assert.assertTrue("[Error] Verify application access.", menus.MnuInsurantData.isDisplayed());
	}

	@When("I fill the input first name with the value {string}")
	public void i_fill_the_input_first_name_with_the_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.FldFirstName.isDisplayed());
	    insuranceDataPage.FldFirstName.sendKeys(value);
	}

	@When("I fill the input last name with the value {string}")
	public void i_fill_the_input_last_name_with_the_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.FldLastName.isDisplayed());
	    insuranceDataPage.FldLastName.sendKeys(value);
	}

	@When("I fill the input date of birth with the value {string}")
	public void i_fill_the_input_date_of_birth_with_the_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.FldBirthdate.isDisplayed());
	    insuranceDataPage.FldBirthdate.sendKeys(value);
	}

	@When("I select the value {string} on Gender field")
	public void i_select_the_value_on_gender_field(String option) {
	    clickRadioButton(insuranceDataPage.RdGender, option);
	}

	@When("I fill the input street address with the value {string}")
	public void i_fill_the_input_street_address_with_the_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.FldStreetAddress.isDisplayed());
	    insuranceDataPage.FldStreetAddress.sendKeys(value);
	}

	@When("I select the value {string} on Country field")
	public void i_select_the_value_on_country_field(String option) {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.CmbCountry.isDisplayed());
	    selectElementOnDropDownWebElement(insuranceDataPage.CmbCountry, option);
	}

	@When("I fill the input zip code with the value {string}")
	public void i_fill_the_input_zip_code_with_the_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.FldZipCode.isDisplayed());
	    insuranceDataPage.FldZipCode.sendKeys(value);
	}

	@When("I fill the input city with the value {string}")
	public void i_fill_the_input_city_with_the_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.FldCity.isDisplayed());
	    insuranceDataPage.FldCity.sendKeys(value);
	}

	@When("I fill the input occupation with the value {string}")
	public void i_fill_the_input_occupation_with_the_value(String option) {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.FldOccupation.isDisplayed());
	    selectElementOnDropDownWebElement(insuranceDataPage.FldOccupation, option);
	}
	
	@When("I select the some options on the Hobbies field")
	public void i_select_the_some_options_on_the_hobbies_field() {
		hobbies.add("BungeeJumping");
	    hobbies.add("CliffDiving");
		selectCheckBoxes(insuranceDataPage.ChkHobbies,hobbies);
	}

	@When("I fill the input website with value {string}")
	public void i_fill_the_input_website_with_value(String value) {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.FldWebsite.isDisplayed());
	    insuranceDataPage.FldWebsite.sendKeys(value);
	}

	@When("I upload in the input picture the {string}")
	public void i_upload_in_the_input_picture_the(String image) {
		File file = new File("src/test/resources/file/"+image);
		insuranceDataPage.FldUpload.sendKeys(file.getAbsolutePath());
	}

	@Then("I press the Next button to Product Data")
	public void i_press_the_next_button_to_product_data() {
		Assert.assertTrue("[Error] Element is not displayed...",insuranceDataPage.BtnNext.isDisplayed());
	    insuranceDataPage.BtnNext.click();
	}

	
}
