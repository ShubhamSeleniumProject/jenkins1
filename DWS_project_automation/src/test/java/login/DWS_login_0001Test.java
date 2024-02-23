package login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.tyss.genericUtility.BaseClass;
import com.tyss.objectRepository.HomePage;


public class DWS_login_0001Test extends BaseClass{
	
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		
		HomePage hp=new HomePage(driver);
		
		String title = eu.getDataFromExcel("login",2,2);
		
		Assert.assertEquals(driver.getTitle(),title,"login not succesfully");
		test.log(Status.PASS,"homepage should display");
		
		hp.getElec_link().click();
		
		String elec = eu.getDataFromExcel("electronics",1,0);
		Assert.assertEquals(driver.getTitle(),elec,"not navigated to electronics page");
		
		test.log(Status.PASS,"navigated properly");
		
	}

}
