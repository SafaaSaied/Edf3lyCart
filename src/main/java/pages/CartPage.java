package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"cart-basic-box\"]/div[2]/div[2]/div[2]/input")
	WebElement urlTextBox;
	
	@FindBy(xpath="//*[@id=\"sb-site\"]/div[1]/div[1]/div[2]/div/div[2]/form/div[2]/div/div[2]/input[1]")
	WebElement addItemBtn;
	
	@FindBy(xpath = "//*[@id=\"cart-basic-box\"]/div[3]/div[5]/div[3]/div/select")
	WebElement sizeDroplist;
	
	@FindBy(css="label.visibility.ng-binding.ng-scope")
	public WebElement msg;
	
	public void addingProductUrl(String url,String size) {
		SetTxtElemetTxt(urlTextBox, url);
		SelectFromList(size, sizeDroplist);
		ClickBtn(addItemBtn);
	}
	
	
	
	public void addingProhibitedProduct(String url) {
	 SetTxtElemetTxt(urlTextBox, url);
		
	}
	
	
	
	
	
}
