package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;

public class addingProhibitedProductTest extends TestBase{

	CartPage cartObj;
	String url="https://www.goat.com/sneakers/shane-sb-premium-light-orewood-brown-cv5500-200";
	
	
	@Test
	public void userCanAddProhibitedProductSuccessfully() {
		cartObj=new CartPage(driver);
		cartObj.addingProhibitedProduct(url);
		Assert.assertTrue(cartObj.msg.getText().contains("we apologize, store is not available at this moment"));
		System.out.println("This product cannot be added.");
			
	}
	
	
	
}
