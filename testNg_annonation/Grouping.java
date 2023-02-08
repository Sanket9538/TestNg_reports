package testNg_annonation;


import org.testng.annotations.Test;

public class Grouping {
    @Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email.");
	}
    @Test(priority=2,groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("this is login by Facebook.");
	}
    @Test(priority=3,groups= {"sanity"})
	void LoginByTwitter() {
		System.out.println("this is login by Twitter.");
	}
    @Test(priority=4,groups= {"sanity","regression"})
	void signUpbyemail() {
		System.out.println("this is signup  by email.");
	}
    @Test(priority=5,groups= {"regression"})
	void signupByFacebook() {
		System.out.println("this is signup  by facebook.");
	}
    @Test(priority=6,groups= {"regression"})
	void signUpByTwitter() {
		System.out.println("this is signup  by Twitter.");
	}
	 @Test(priority=8,groups= {"sanity"})
	void paymentInDollar() {
    System.out.println("this is payment by dolllar method ");
	}
	 @Test(priority=7,groups= {"sanity","regression"})
	void paymentInRupees() {
		 System.out.println("this is payment by rupees method ");
	}
	 @Test(priority=9,groups= {"regression"})
	void paymentReturnbyBank() {
		System.out.println("payment return by bank");
	}
	

	
	
}
