package com.WellsFargo;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class Page1 {
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	
	@FindBy(id="userid")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement PassField;
	
	@FindBy(xpath="//label[@class='lsc']")
	WebElement CheckB;
	
	@FindBy(xpath="//input[@id='btnSignon']")
	WebElement Login;
	
	public Page1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUser(String user) throws IOException {
		Username.clear();
		Username.sendKeys(user);
	}
	
	public void enterPass(String password) throws IOException {
		PassField.clear();
		PassField.sendKeys(password);
	}
	
	public void CheckBox() {
	
		CheckB.click();
		
	}
	
	public void enterLogin() {
		Login.click();
	}
	public void goBack() {
		driver.navigate().back();
	}
	
	
	
	
}
