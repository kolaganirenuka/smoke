package com_vtiger_Tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Createorganization {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		String orgname="ven";
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys(orgname);
		Select sel=new Select(driver.findElement(By.id("bas_searchfield")));
		sel.selectByVisibleText("Organization Name");
		driver.findElement(By.name("submit"));
		String value=driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
		if(value.equals(orgname)) {


			System.out.println("added");


		}
		else {
			System.out.println("not added");
		}
		Actions action =new Actions(driver);
		WebElement path=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		action.moveToElement(path).build().perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
}
