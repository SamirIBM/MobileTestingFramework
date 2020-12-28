package Practice.AppiumFramework;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class TC_01 extends Capabilbity{
	AndroidDriver<AndroidElement> driver;
//	TC_01(){
//		
//		try {
//		
//		this.driver=capability(appPackage, appActivity, deviceName, chromedriverExecutable);
//		}
//		
//		catch(Exception ex) {
//			
//			ex.printStackTrace();
//		}
//	}

	
	
	@BeforeTest
	public void bt() throws IOException, InterruptedException {
//		startserver();
//		
//		driver=capability(appPackage, appActivity, deviceName, chromedriverExecutable);
//		try {
//		
//		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
//		
//		}
//		
//		catch(Exception ex) {
//			
//			ex.printStackTrace();
//		}
       // Thread.sleep(5000);
		
	}
	
	@Test(enabled=false)
	public void testCase1() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Niharika");
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		
		//Thread.sleep(2000);
		
		String country=driver.findElement(By.xpath("//*[@text='India']")).getText();
		
		Assert.assertEquals(country, "India");
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	}
	
	@Test(enabled=false)
	public void testCase3() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Niharika");
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"))").click();
		
		//Thread.sleep(2000);
		
		String country=driver.findElement(By.xpath("//*[@text='Angola']")).getText();
		
		Assert.assertEquals(country, "Angola");
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		Thread.sleep(1000);
		
//		boolean isDisplayed=driver.findElement(By.xpath("//*[contains(text()'Please enter your name')]")).isDisplayed();
//		
//		if(isDisplayed) {
//			
//			System.out.println("pass");
//		}
		
		//To identify the error popups , u need ot use class name
		
		String errorMsg=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		
		System.out.println(errorMsg);
		
		String expected="Please enter your name";
		
		Assert.assertEquals(errorMsg, expected);
	}
	
	@Test(enabled=false)
	public void testCase4() throws InterruptedException, IOException {
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Niharika");
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"))").click();
		
		//Thread.sleep(2000);
		
		String country=driver.findElement(By.xpath("//*[@text='Angola']")).getText();
		
		Assert.assertEquals(country, "Angola");
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		Thread.sleep(3000);
		
		int noOfProducts=driver.findElementsByClassName("android.widget.ImageView").size();
		
		System.out.println("NO of products: "+noOfProducts);
//		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(textMatches(\"Jordan 6 Rings\").instance(0))");
		
//		int noOfProducts=driver.findElementsById("com.androidsample.generalstore:id/productName").size();
		
		System.out.println("NO of products: "+noOfProducts);
		
		for(int i=0;i<noOfProducts;i++) {
			
			String productName=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			
			if(productName.equals("Jordan 6 Rings")) {
				
				System.out.println("NO of products: "+productName);
				
				Thread.sleep(2000);
				
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(textMatches(\"ADD TO CART\").instance(2))");
				
				driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(i).click();
				
				//driver.findElement(By.xpath("//*[@text='ADD TO CART']")).click();
			}
			
			
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		Thread.sleep(2000);
		
		String checkOutName=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		
		Assert.assertEquals(checkOutName, "Jordan 6 Rings");
	
	}
	
	@Test
	public void testCase5() throws InterruptedException, IOException {
		
		//AndroidDriver driver=new AndroidDriver();
		//driver=capability(appPackage, appActivity, deviceName, chromedriverExecutable);
		
		
		 //Set Capabilities
		//AndroidDriver<AndroidElement> driver=new AndroidDriver(cap);
	
		//service=startserver();
		try {
			
			service=startserver();
			
			FileReader fis=new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\global.properties");
			
			Properties pro=new Properties();
			
			pro.load(fis);
			
			appPackage=pro.getProperty("appPackage");
			
			appActivity=pro.getProperty("appActivity");
			
			deviceName=pro.getProperty("deviceName");
			
			chromedriverExecutable=pro.getProperty("chromedriverExecutable");
			
			DesiredCapabilities cap=new DesiredCapabilities();
			
			//cap.setCapability(MobileCapabilityType.APP, fp.getAbsolutePath());
			
			   File fp=new File(System.getProperty("user.dir")+"\\src\\main\\java\\General-Store.apk");
			
			
			
			 cap.setCapability(MobileCapabilityType.APP, fp.getAbsolutePath());
			
			//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);
//			
			//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity);
			
			cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, chromedriverExecutable);
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			
			if(deviceName.contains("samir")) {
				
				startEmulator();
			}
			
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			
			AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
			

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Niharika");
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Angola\"))").click();
		
		//Thread.sleep(2000);
		
		String country=driver.findElement(By.xpath("//*[@text='Angola']")).getText();
		
		Assert.assertEquals(country, "Angola");
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		int noOfElements=driver.findElements(By.xpath("//*[@text='ADD TO CART']")).size();
		
		System.out.println("NO of Elements: "+noOfElements);
		
		for(int i=0;i<noOfElements;i++) {
				
			AndroidElement addTwoCart=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productAddCart")).get(i);
			
			addTwoCart.click();
			
			Thread.sleep(2000);
				
		}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);
		
		String amount1=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		
		String amount2=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		
		System.out.println(amount1);
		
		System.out.println(amount2);
		
		amount1=amount1.substring(1);
		
		amount2=amount2.substring(1);
		
		double amount1_value=Double.parseDouble(amount1);
		
		double amount2_value=Double.parseDouble(amount2);
		
		System.out.println("Converted to double: "+amount1_value);
		
		System.out.println("Converted to double: "+amount2_value);
		
		double total_amount=amount1_value+amount2_value;
		
		System.out.println("Total Amount: "+total_amount);
		
		String finalAmount=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		
		finalAmount=finalAmount.substring(1);
		
		double finalAmount_vlaue=Double.parseDouble(finalAmount);
		
		Assert.assertEquals(finalAmount_vlaue, total_amount);
		
		//=========================================================================//
		
		Thread.sleep(2000);
		
		AndroidElement checkBox=driver.findElementsByClassName("android.widget.CheckBox").get(0);
		
		TouchAction t=new TouchAction(driver);
		 
		 t.tap(tapOptions().withElement(element(checkBox))).perform();
		 
		// driver.findElementByAccessibilityId("1. Custom Adapter").click();
		 
		 AndroidElement lp=driver.findElements(By.xpath("//*[@text='Please read our terms of conditions']")).get(0);
		 
		 t.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(3))).release().perform();
		 
		// String text=driver.findElements(MobileBy.id("android:id/title")).get(1).getText();
		 
		 driver.switchTo().alert().accept();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		 
		 Thread.sleep(8000);
		 
		 //To shift from Native App to Web App in Hybrid Applications
		 
		 Set<String> contextNames = driver.getContextHandles();
		 for (String contextName : contextNames) {
		     System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		 }
		 
		 driver.context("WEBVIEW_com.androidsample.generalstore");
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("IBM");
		 
		 driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.RETURN);
		 
		 driver.pressKey(new KeyEvent(AndroidKey.BACK));
		 
		 Thread.sleep(3000);
		 
		 driver.context("NATIVE_APP");
		 
		service.stop();
		
		}
		
		catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}
	

}
