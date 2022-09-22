package mobile;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class contactus extends reusepage{

	@Test(dataProvider="contact_us_data_username")
	public void contact_us_username(String username,String email,String mobilenumber,String message) throws InterruptedException
	{
		actionspage.clicksupport();
		actionspage.contactusclick();
		actionspage.contactus(username,email,mobilenumber,message);
		driver.quit();

	}
	
	
	@Test(dataProvider="contact_us_data_email")
	public void contact_us_email(String username,String email,String mobilenumber,String message) throws InterruptedException
	{
		actionspage.clicksupport();
		actionspage.contactusclick();
		actionspage.contactus(username,email,mobilenumber,message);
		driver.quit();

	}
	
	@Test(dataProvider="contact_us_data_phonenumber")
	public void contact_us_phonenumber(String username,String email,String mobilenumber,String message) throws InterruptedException
	{
		actionspage.clicksupport();
		actionspage.contactusclick();
		actionspage.contactus(username,email,mobilenumber,message);
		driver.quit();
		
	}
		
	@Test(dataProvider="contact_us_data_message")
	public void contact_us_message(String username,String email,String mobilenumber,String message) throws InterruptedException
	{
		actionspage.clicksupport();
		actionspage.contactusclick();
		actionspage.contactus(username,email,mobilenumber,message);
		driver.quit();
	
	}
		
	@Test(dataProvider="contact_us_data_integration")
	public void contact_us_integration(String username,String email,String mobilenumber,String message) throws InterruptedException
	{
		actionspage.clicksupport();
		actionspage.contactusclick();
		actionspage.contactus(username,email,mobilenumber,message);
		driver.quit();
	}
	
	
	
	//............................dataproviders....................//
	@DataProvider
	public Object[][] contact_us_data_username()
	{
		return new Object[][] {{"abc","abc@gmail.com","9701574760","msg"},{"abcdefghijklmnopqrst","abc@gmail.com","9701574760","msg"},{"a","abc@gmail.com","9701574760","msg"},{"abcdefghijklmnopqrstuv","abc@gmail.com","9701574760","msg"},{"","abc@gmail.com","9701574760","msg"}};
	}
	
	
	@DataProvider
	public Object[][] contact_us_data_email()
	{
		return new Object[][] {{"abc","abc@gmail.com","9701574760","msg"},{"abc","a@b","9701574760","msg"}};
	}
	
	@DataProvider
	public Object[][] contact_us_data_phonenumber()
	{
		return new Object[][] {{"abc","abc@gmail.com","9701574760","msg"},{"abc","abc@gmail.com","970157","msg"},{"abc","abc@gmail.com","970157476000","msg"},{"abc","abc@gmail.com","abc","msg"},{"abc","abc@gmail.com","@@","msg"},{"abc","abc@gmail.com","","msg"}};
	}
	
	@DataProvider
	public Object[][] contact_us_data_message()
	{
		return new Object[][] {{"abc","abc@gmail.com","9701574760","m"},{"abc","abc@gmail.com","9701574760","msg1000"},{"abc","abc@gmail.com","9701574760","msgmore1000"},{"abc","abc@gmail.com","9701574760","msg123"},{"abc","abc@gmail.com","9701574760",""}};
			
	}
	
	@DataProvider
	public Object[][] contact_us_data_integration()
	{
		return new Object[][] {{"abc","abc@gmail.com","9701574760","m"}};
	}
	

}
