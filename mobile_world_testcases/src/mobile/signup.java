package mobile;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signup extends reusepage {
	
	/*
	@Test(dataProvider="sign_up_data_firstname")
	public void sign_up_firstname(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
	{
		actionspage.clicksignin();
		actionspage.signup();
		actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
	
	@Test(dataProvider="sign_up_data_lastname")
	public void sign_up_lastname(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
	{
		actionspage.clicksignin();
		actionspage.signup();
		actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
	
	@Test(dataProvider="sign_up_data_email")
	public void sign_up_email(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
	{
		actionspage.clicksignin();
		actionspage.signup();
		actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
		driver.switchTo().alert().accept();
		driver.quit();
		
	} */
	
	@Test(dataProvider="sign_up_data_password")
	public void sign_up_password(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
	{
		actionspage.clicksignin();
		actionspage.signup();
		actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
	
	@Test(dataProvider="sign_up_data_mobilenumber")
	public void sign_up_mobilenumber(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
	{
		actionspage.clicksignin();
		actionspage.signup();
		actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
	/*
	@Test(dataProvider="sign_up_data_bio")
	public void sign_up_bio(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
	{
		actionspage.clicksignin();
		actionspage.signup();
		actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
	
	@Test(dataProvider="sign_up_data_integration")
	public void sign_up_integration(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
	{
		actionspage.clicksignin();
		actionspage.signup();
		actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
	
	//..............................dataproviders.........................//
	@DataProvider
	public Object[][] sign_up_data_firstname()
	
	{
		return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"qwertyuiopqwertyuiop","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aj","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"qwertyuiopasdqwertyuiopasd","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"@@","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"123","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja123","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"}};
		
	}
	
	
	@DataProvider
	public Object[][] sign_up_data_lastname()
	{
		return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","qwertyuiopqwertyuiop","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","aj","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","qwertyuiopasdqwertyuiopasd","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","@@","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","123","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","abc1","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","","abc@gmail.com","abc123","18-09-2002","9701574760","bio"}};
	}
	
	@DataProvider
	public Object[][] sign_up_data_email()
	{
		return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio"},{"aja","abc","a@b","abc123","18-09-2022","9701574760","bio"},{"aja","abc","","abc123","18-09-2022","9701574760","bio"}};
	}
	*/
	@DataProvider
	public Object[][] sign_up_data_password()
	{
		return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","abcdefg123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","a3","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","abcdefgh123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","18-09-2022","9701574760","bio"}};
			
	}
	
	@DataProvider
	public Object[][] sign_up_data_mobilenumber()
	{
		return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","970157","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","970157476000","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","mob","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","m@@","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","bio"}};
	}
	/*
	@DataProvider
	public Object[][] sign_up_data_bio()
	{
		return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio123"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760",""}};
	}
	
	
	
	@DataProvider
	public Object[][] sign_up_data_integration()
	{
		return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio123"}};
	}
	*/

}
