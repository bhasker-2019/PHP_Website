package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjTestNG {
  
   
  @Test(priority=0)
  public void verifytitle() throws InterruptedException {
  
	ChromeDriver d = new ChromeDriver();
	  
	
	d.get("http://35.234.208.155");
	Thread.sleep(5000);
	//d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	d.manage().window().maximize(); 
	String actualTitle = d.getTitle();
	String expectedTitle = "Home | Simple PHP Website";
	Assert.assertEquals(actualTitle,expectedTitle);
	d.quit();
  }
  
  @Test(priority=1)
  public void verifytext() throws InterruptedException {
	ChromeDriver d = new ChromeDriver();
	d.get("http://35.234.208.155");
	Thread.sleep(5000);
	//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.manage().window().maximize(); 
	d.findElement(By.linkText("About Us")).click();
	String s = d.findElement(By.id("PID-ab2-pg")).getText();
	Assert.assertEquals("This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", s);
	d.quit();
	  }
}


