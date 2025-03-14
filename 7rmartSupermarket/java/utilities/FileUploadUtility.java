package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	public void fileuploadusingsendkeys(WebElement element,String filepath)
	 {
	
		 element.sendKeys(filepath);
		 }
	 public void fileuploadusingrobotkey(WebElement element,String filepath) throws AWTException {
		 
	     element.click();
		 StringSelection ss=new StringSelection(filepath);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		 Robot robot=new Robot();
		 robot.delay(500);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.delay(500);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.delay(500);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
	 }
	
}




