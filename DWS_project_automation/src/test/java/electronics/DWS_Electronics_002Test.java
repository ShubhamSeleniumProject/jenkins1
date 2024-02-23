package electronics;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tyss.genericUtility.BaseClass;
import com.tyss.objectRepository.CameraPAge;
import com.tyss.objectRepository.ElectronicsPage;
import com.tyss.objectRepository.HomePage;

public class DWS_Electronics_002Test extends BaseClass{
	 
	@Test
	public void clickElectronics() throws EncryptedDocumentException, IOException
	{
		
		HomePage hp=new HomePage(driver);
		hp.getElec_link().click();
		
		ElectronicsPage ep=new ElectronicsPage(driver);
		
		
		ep.getCamera_link().click();
		
		String camera = eu.getDataFromExcel("electronics",1,1);
		
		Assert.assertEquals(driver.getTitle(),camera,"camera page is not displayed");
		
		
		CameraPAge cp=new CameraPAge(driver);
		Select sel=new Select(cp.getSortBy());
		sel.selectByVisibleText("Name: A to Z");
		boolean displaysort = cp.getSortBy().isDisplayed();
		Assert.assertEquals(displaysort, true,"sort is not working");
	System.out.println(displaysort);
		
		
		Select sel1=new Select(cp.getDisplay_sort());
		 sel1.selectByVisibleText("4");
		boolean dissort = cp.getDisplay_sort().isDisplayed();
		Assert.assertEquals(dissort, true,"size sort is not working");
		
		
		
		
		Select sel2=new Select(cp.getView_sort());
		sel2.selectByVisibleText("Grid");
		
		cp.getHandycam().click();
		
	}

}
