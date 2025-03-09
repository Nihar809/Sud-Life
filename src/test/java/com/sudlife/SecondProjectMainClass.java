package com.sudlife;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SecondProjectMainClass {

	public static void main(String[] args) throws Exception {
		ReadExcelSheet excelSheet=new ReadExcelSheet();
		XSSFSheet sheet =excelSheet.readExcelSheet();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://digiquicktest.sudlife.in/digisalesweb");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		int uname=(int) sheet.getRow(1).getCell(0).getNumericCellValue();
		String username= Integer.toString(uname);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		Thread.sleep(2000);
		int pass=(int) sheet.getRow(1).getCell(1).getNumericCellValue();
		String password =Integer.toString(pass);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//span[text()='NEW BUSINESS']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
		element.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ion-label[@id='lbl-11'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='button button-pendingcases create-btn ng-star-inserted'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='radio-icon'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='text-input text-input-md ng-star-inserted'])[1]")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='text-input text-input-md ng-star-inserted'])[2]")).sendKeys(sheet.getRow(1).getCell(3).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='datetime-text datetime-placeholder ng-star-inserted']")).click();
		Thread.sleep(2000);
		  for (int i = 2023; i >= 1990; i -= 2) { 
			  System.out.println("Now Year is : "+i);
			  driver.findElement(By.xpath("//button[text()=" + i + "]")).click();
			  if (i==1999) {
				  System.out.println("Now year same as 1999 ");
				  break;  
			  }
	        }
		driver.findElement(By.xpath("(//button[text()='03'])[2]")).click();
		String day= driver.findElement(By.xpath("(//button[@class='picker-opt ng-star-inserted picker-opt-selected'])[1]")).getText();
		System.out.println(day);
		int day1=Integer.parseInt(day);
		int expectedday=06;
		if(expectedday!=day1){
			 for(int i=day1;i>1;i--) {
				driver.findElement(By.xpath("(//button[text()="+i+"])[1]")).click();
				String day2 =driver.findElement(By.xpath("(//button[@class='picker-opt ng-star-inserted picker-opt-selected'])[1]")).getText();
				System.out.println(day2);
				int day3=Integer.parseInt(day2);
				if(expectedday==day3) {
					System.out.println("Finally day matches");
					break;
				}
			}
		}
		Thread.sleep(2000);	 
		driver.findElement(By.xpath("(//button[@class='picker-button button button-md button-clear button-clear-md'])[2]")).click();
		Thread.sleep(2000);
		double mob = sheet.getRow(1).getCell(4).getNumericCellValue();
		String mobile = Double.toString(mob);
		System.out.println(mobile);
		driver.findElement(By.xpath("(//input[@class='text-input text-input-md ng-star-inserted'])[3]")).sendKeys(mobile);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Whatsapp Number Same As Mobile Number']")).click();
		Thread.sleep(2000);
		WebElement branch = driver.findElement(By.xpath("//span[text()='Branch Code']"));
		js.executeScript("arguments[0].scrollIntoView();", branch);
		Thread.sleep(1000);
		branch.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='mat-option-text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-md btn-blue ng-star-inserted'])[2]")).click();
		Thread.sleep(2000);
		WebElement personalinformation = driver.findElement(By.xpath("//p[text()='Personal Information ']"));
		js.executeScript("arguments[0].scrollIntoView();", personalinformation);
		Thread.sleep(1000);
		double incomemoney= sheet.getRow(1).getCell(5).getNumericCellValue();
		String income=String.valueOf(incomemoney);
		driver.findElement(By.xpath("(//input[@class='text-input text-input-md ng-star-inserted'])[1]")).sendKeys(income);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
		Thread.sleep(2000);
		WebElement Recommendation = driver.findElement(By.xpath("//p[text()='Recommendation']"));
		js.executeScript("arguments[0].scrollIntoView();", Recommendation);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-md btn-blue ng-star-inserted'])[2]")).click();
		Thread.sleep(2000);
		WebElement Proposer = driver.findElement(By.xpath("//span[text()='Proposer Details']"));
		js.executeScript("arguments[0].scrollIntoView();", Proposer);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-slide-toggle-bar'])[1]")).click();
		Thread.sleep(2000);
		WebElement policyterm  = driver.findElement(By.xpath("(//*[@class='mat-select-value'])[4]"));
		js.executeScript("arguments[0].scrollIntoView();", policyterm);
		policyterm.click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();
		Thread.sleep(2000);
		double premiumvalue=sheet.getRow(1).getCell(6).getNumericCellValue();
		String premium=String.valueOf(premiumvalue);
		driver.findElement(By.xpath("(//input[@class='text-input text-input-md ng-star-inserted'])[7]")).sendKeys(premium);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='mat-select-value'])[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-md btn-blue ng-star-inserted'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-md btn-blue ng-star-inserted'])[2]")).click();
		Thread.sleep(2000);
		WebElement ihaveread = driver.findElement(By.xpath("//p[@class='label gender-font-size']"));
		js.executeScript("arguments[0].scrollIntoView();", ihaveread);
		Thread.sleep(2000);
		ihaveread.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-md btn-blue ng-star-inserted'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='No'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Pay Later'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-md btn-blue ng-star-inserted'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ion-label[text()='CKYC Authentication']")).click();
		Thread.sleep(2000);
		
		
		 // Get the current window handle (parent)
        String parentWindow = driver.getWindowHandle();

        // Get all open window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to the new window
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Now you are in the new window
        System.out.println("Switched to new window: " + driver.getTitle());

        // Close the new window
        Thread.sleep(2000);
        driver.close();

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Switched back to parent window: " + driver.getTitle());
		
        WebElement OCR_Based_Form_filling = driver.findElement(By.xpath("//ion-label[text()='OCR Based Form filling']"));
		js.executeScript("arguments[0].scrollIntoView();", OCR_Based_Form_filling);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ion-label[text()='Aadhar Authentication based - EKYC']")).click();
		Thread.sleep(2000);
        
        for (String window1 : allWindows) {
            if (!window1.equals(parentWindow)) {
                driver.switchTo().window(window1);
                break;
            }
        }
		
        System.out.println("Switched to new window: " + driver.getTitle());
        
        Thread.sleep(2000);
        driver.close();
        
        driver.findElement(By.xpath("//ion-label[text()='OCR Based Form filling']")).click();
		Thread.sleep(2000);
        
        for (String window2 : allWindows) {
            if (!window2.equals(parentWindow)) {
                driver.switchTo().window(window2);
                break;
            }
        }
		
        System.out.println("Switched to new window: " + driver.getTitle());
        
        Thread.sleep(2000);
        driver.close();
		
		driver.quit();
		
	}

}
