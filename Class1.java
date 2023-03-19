import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://183.82.103.245/nareshit/login.php");//navigate to particicular URL in Browser

		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("nareshit");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
		System.out.println("Login Completed");

		//To Perform Mouse Hover Actions
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[@class='drop current']"))).perform();
		Thread.sleep(3000);
		System.out.println("Mouse Hover Actions Completed");

		driver.findElement(By.xpath("//span[normalize-space()='Add Employee']")).click();
		Thread.sleep(2000);
		System.out.println("Select AddEmploy");
		
		/*Actions acc = new Actions(driver);
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"))).perform();
		
		//driver.switchTo().frame("rightMenu");

		driver.findElement(By.cssSelector("body > div:nth-child(4) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(10) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(1)")).click();*/
		
		

		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("Ejanthkar");
		driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("Naveen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
		System.out.println("New Employe Detailes are add sucessfull");

		driver.close();

	}


}
