package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class PageBase {
	protected WebDriver driver;
	public Select select;


	public PageBase(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}


	protected static void ClickBtn(WebElement btn) {
		btn.click();
	}


	protected static void SetTxtElemetTxt(WebElement txtElment,String value) {
		txtElment.sendKeys(value);
	}


	protected static void SelectFromList(String option,WebElement listName) {
		Select selectOption=new Select(listName);
		selectOption.selectByVisibleText(option);
		Assert.assertFalse(selectOption.isMultiple());
	}





}
