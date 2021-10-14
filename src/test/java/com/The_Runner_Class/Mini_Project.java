package com.The_Runner_Class;

import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Project_Class.Base_Class_Methods;

public class Mini_Project extends Base_Class_Methods {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = get_Driver("chrome");

		geturl("http://automationpractice.com/index.php");

		singlewindow("Single window", null);

		imwait(10);
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		click(login);

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		inputelement(email, "prithiviraj.15@mail.com");

		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		inputelement(password, "prithiviraj");

		WebElement sub = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		click(sub);

		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		click(dress);
		imwait(10);

		WebElement evedress = driver.findElement(By.xpath("(//a[normalize-space()='Evening Dresses'])[3]"));
		click(evedress);

		WebElement quickview = driver.findElement(
				By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=4&controller=product'])[2]"));

		jsclick(quickview);
		imwait(10);

		WebElement Qty = driver.findElement(By.cssSelector("[class$='quantity_up']"));
		for (int i = 0; i < 9; i++) {
			click(Qty);
		}

		WebElement size = driver.findElement(By.id("group_1"));
		drop_down(size, "index", "2");

		WebElement colcr = driver.findElement(By.xpath("//a[@name='Pink']"));
		click(colcr);
		sleep(3000);

		WebElement ok = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		actionsmethod(ok, "click");

		imwait(10);

		screenshot("snap2.png");
		sleep(3000);
		
		WebElement sub2 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		click(sub2);
		
		WebElement first = driver.findElement(By.xpath("//th[contains(text(),'Description')]"));
		scroll(first);
		
		screenshot("snap3.png");

		WebElement submitt = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		click(submitt);
		
		WebElement second = driver.findElement(By.xpath("//h3[contains(text(),'Your delivery address')]"));
		scroll(second);

		imwait(10);
		screenshot("snap4.png");

		WebElement sub1 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		click(sub1);

		WebElement third = driver.findElement(By.xpath("//p[contains(text(),'Choose a shipping option for this address: My addr')]"));
		scroll(third);

		imwait(10);

		screenshot("snap5.png");

		WebElement orde = driver.findElement(By.xpath("//input[@type='checkbox']"));
		click(orde);

		WebElement ore1 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		click(ore1);

		WebElement forth = driver.findElement(By.xpath("//th[contains(text(),'Description')]"));
		scroll(forth);

		imwait(10);

		screenshot("snap6.png");

		WebElement ore2 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		click(ore2);

		WebElement ore3 = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		click(ore3);

		WebElement fifth = driver.findElement(By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]"));
		scroll(fifth);

		imwait(10);
		screenshot("snap7.png");
	}
}
