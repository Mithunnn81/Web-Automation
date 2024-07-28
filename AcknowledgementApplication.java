package com.first.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AcknowledgementApplication extends BaseDriver {
	
	@Test
	public void testLocator() throws InterruptedException {
		Driver.manage().window().maximize();
		Driver.get("https://smart-hrms.waltonbd.com/hrms/login");
		//Driver.get("https://member.daraz.com.bd/user/register?spm=a2a0e.home.header.d6.735212f76F6Zsx");
		Thread.sleep(5000);
		
		WebElement userName = Driver.findElement(By.xpath("//form[1]/div[1]/div[1]/input[1]"));
		userName.sendKeys("A-17517");
		Thread.sleep(3000);
		
		WebElement password = Driver.findElement(By.xpath("//form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		password.sendKeys("m1234567890MN/");
		Thread.sleep(3000);
		
		WebElement element = Driver.findElement(By.id("loginButton"));
		JavascriptExecutor executor = (JavascriptExecutor)Driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(5000);
		
		WebElement selfService = Driver.findElement(By.xpath("//body/div[1]/app-root[1]/app-all-modules[1]/app-sidebar[1]/div[1]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]"));
		selfService.click();
		Thread.sleep(3000);
		
		WebElement aknowledgement = Driver.findElement(By.xpath("//perfect-scrollbar[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]"));
		aknowledgement.click();
		Thread.sleep(3000);
		
		WebElement viewAknowledgement = Driver.findElement(By.xpath("//tbody/tr[1]/td[11]/a[1]"));
		viewAknowledgement.click();
		Thread.sleep(3000);
		
		WebElement back = Driver.findElement(By.xpath("//app-ack-view[1]/div[1]/div[1]/div[1]/div[2]/a[1]"));
		back.click();
		Thread.sleep(3000);
		
		WebElement edit = Driver.findElement(By.xpath("//tbody/tr[2]/td[11]/a[2]"));
		edit.click();
		Thread.sleep(3000);
		
		WebElement outPurpose = Driver.findElement(By.xpath("//body/div[1]/app-root[1]/app-all-modules[1]/app-self-service[1]/div[1]/app-ack-edit[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/select[1]"));
		outPurpose.click();
		Thread.sleep(5000);
		
		WebElement outPurposeSelect = Driver.findElement(By.xpath("//option[contains(text(),'Personal')]"));
		outPurposeSelect.click();
		Thread.sleep(5000);
		
		WebElement causedBy = Driver.findElement(By.xpath("//body/div[1]/app-root[1]/app-all-modules[1]/app-self-service[1]/div[1]/app-ack-edit[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/textarea[1]"));
		causedBy.sendKeys("Test Automation");
		Thread.sleep(5000);
		
		WebElement remarks = Driver.findElement(By.xpath("//body/div[1]/app-root[1]/app-all-modules[1]/app-self-service[1]/div[1]/app-ack-edit[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/div[1]/textarea[1]"));
		remarks.sendKeys("For Testing purpose");
		Thread.sleep(5000);
		
		WebElement reset = Driver.findElement(By.xpath("//body/div[1]/app-root[1]/app-all-modules[1]/app-self-service[1]/div[1]/app-ack-edit[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]"));
		reset.click();
		Thread.sleep(5000);
		
	}
}

