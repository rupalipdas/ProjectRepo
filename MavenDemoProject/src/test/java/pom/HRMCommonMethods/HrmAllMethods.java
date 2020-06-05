package pom.HRMCommonMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HrmAllMethods {
	WebDriver driver;
	public void insertapp(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Library\\S2020\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//Maximize  the window
		driver.manage().window().maximize();
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	public void enterbyid(String val,String name) {
			driver.findElement(By.id(val)).sendKeys(name); 
}
	public void clickbyxpath(String val1) {
		driver.findElement(By.xpath(val1)).click();
}
	public void clickbylinktext(String val2) {
		driver.findElement(By.linkText(val2));
}
	public void checkbox(String val3) {
		WebElement option1 = driver.findElement(By.id(val3));
		option1.click();
}
	public void selectdropdown(String id, String text) {
		Select month=new Select(driver.findElement(By.id(id)));
		month.selectByVisibleText(text);
}
	public void takesnap(String path) throws IOException {
		//Convert web driver object to TakeScreenshot
		TakesScreenshot ts = ((TakesScreenshot)driver);
		//Call getScreenshotAs methods to create image file
		File source = ts.getScreenshotAs(OutputType.FILE);
		//Copy file to Desired Location
		FileUtils.copyFile(source, new File(path));
		
	}

}

