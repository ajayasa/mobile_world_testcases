package mobile;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login extends reusepage{
	@Test(dataProvider="login_data_username")
	public void login_valid_username(String username,String password)
	{

		actionspage.clicksignin();
		actionspage.login(username, password);
		driver.quit();	
	}
	 
	 @Test
	 public void username_less_than_3()
		{
			String expect="error message should be displayed";
			String name1="aa";
			String pass1="123";	
			actionspage.clicksignin();
			actionspage.login(name1,pass1);
			Assert.assertEquals(name1,expect);
			driver.quit();
			
		}
	 
	 @Test
	 public void username_more_than_20()
		{
			String expect="error message should be displayed";
			String name2="qwertyuiopasdqwertyuiopasd";
			String pass2="123";	
			actionspage.clicksignin();
			actionspage.login(name2,pass2);
			Assert.assertEquals(name2,expect);
			driver.quit();
			
		}
	 @Test
	 public void username_empty()
		{
			String expect="error message should be displayed";
			String name2="";
			String pass2="123";	
			actionspage.clicksignin();
			actionspage.login(name2,pass2);
			Assert.assertEquals(name2,expect);
			driver.quit();
			
		}
	 
	@Test(dataProvider="login_data_password")
	public void login_valid_password(String username,String password)
	{
		actionspage.clicksignin();
		actionspage.login(username, password);
		driver.quit();
	}
	
    @Test
	public void login_invalid_password()
	{
		String expect="error message should be displayed";
		String name3="abc";
		String pass3="a1";	
		actionspage.clicksignin();
		actionspage.login(name3,pass3);
		Assert.assertEquals(pass3,expect);
		driver.quit();	
	}
    
    @Test
   	public void login_password_empty()
   	{
   		String expect="error message should be displayed";
   		String name3="abc";
   		String pass3="";	
   		actionspage.clicksignin();
   		actionspage.login(name3,pass3);
   		Assert.assertEquals(pass3,expect);
   		driver.quit();	
   	}

		

	@Test(dataProvider="login_data_ntegration")
	public void loginintegration(String username,String password)
	{
		actionspage.clicksignin();
		actionspage.login(username, password);
		driver.quit();
		
	} 

	//...............................dataproviders..................//
	
	@DataProvider
	public Object[][] login_data_username()
	{
		return new Object[][] {{"aja","abc"},{"qwertyuiopqwertyuiop","abc"},{"abc123","abc"}};
	}

	@DataProvider
	public Object[][] login_data_password()
	{
		return new Object[][] {{"aja","abcdef@123"}};
	}
	
	@DataProvider
	public Object[][] login_data_ntegration()
	{
		return new Object[][] {{"aja","abcdef@123"}};
	} 

}
