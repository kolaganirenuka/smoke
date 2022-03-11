package com_vtiger_Tc;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_Create_Contact_org {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		WebElement sat=(driver.findElement(By.xpath("//select[@name='salutationtype']")));
		Select sel=new Select(sat);
		sel.selectByValue("Mrs.");
		String fname="Renu";
		String lname="K";
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		driver.findElement(By.xpath("//input[@name='account_name']/../img")).click();
		Set<String> wins=driver.getWindowHandles();
		Iterator<String> it=wins.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys("Renuka");
		driver.findElement(By.xpath("//input[@name='search']"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='1']")).click();

		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(fname);
		WebElement insel=driver.findElement(By.xpath("//select[@id='bas_searchfield']"));
		Select sel1=new Select(insel);
		sel1.selectByValue("firstname");
		driver.findElement(By.xpath("//input[@class='crmbutton small create']")).click();
		String val=driver.findElement(By.xpath("//a[.='Renu']")).getText();
		if(val.equalsIgnoreCase(fname)) {
			System.out.println("TC pass");
		}
		else {
			System.out.println("Tc fail");
		}

		Actions action =new Actions(driver);
		WebElement path=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		action.moveToElement(path).build().perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}

}
