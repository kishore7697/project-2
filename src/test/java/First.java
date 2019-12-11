import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get(" http://www.amazon.com/");
		WebElement txt=driver.findElement(By.xpath("//input[@type='text']"));
		txt.sendKeys("iphone");
		WebElement txt1=driver.findElement(By.xpath("//input[@type='submit']"));
		txt1.click();
		java.util.List<WebElement> btn1=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

for (WebElement x : btn1) {
	String t=x.getText();
	System.out.println(t);
}



	}

	
	
}
