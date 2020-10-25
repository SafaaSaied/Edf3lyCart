package tests;

import org.testng.annotations.Test;

import pages.CartPage;

public class addingAutomatedProductTest extends TestBase {

	CartPage cartObj;
	String url="https://www.shein.com/CUCCOO-The-Everyone-Sneakers-p-1187851-cat-1913.";
	String size="EUR36";
	
	
	@Test
	public void userCanAddAutomatedProductSuccessfully() {
		cartObj=new CartPage(driver);
		cartObj.addingProductUrl(url,size);
		System.out.print("The product link added successfully to the cart.");
				
	}
	
	
	
	
}
