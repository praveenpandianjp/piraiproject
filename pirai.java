import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class pirai {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\automationbrowserdrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://piraiinfo.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("(//a[text()='Cloud Services'])[3]")).click();

		File praveenscreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(praveenscreenshot, new File("C:\\Users\\dell\\OneDrive\\Pictures\\task\\praveen" + ".jpeg"));

		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		String text1 = "Infra Monitoring Tools";
		String pirai = driver.findElement(By.xpath("(//h5[@class=\"et_pb_toggle_title\"])[1]")).getText();
		System.out.println("piraitext" + pirai);
		if (text1.equalsIgnoreCase(pirai)) {
			System.out.println("correct text1 is displayed");

		} else {
			System.out.println("wrong text is Displayed" + pirai);
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='DevOps Services']")).click();
		String text11 = "DevOps Services";
		String devops = driver.findElement(By.xpath("//h1[text()='DevOps Services']")).getText();
		File praveenscreenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(praveenscreenshot1, new File("C:\\Users\\dell\\OneDrive\\Pictures\\task\\praveen1" + ".jpeg"));

		System.out.println("piraitext" + devops);
		if (text11.equalsIgnoreCase(devops)) {
			System.out.println("correct text2 is displayed");

		} else {
			System.out.println("wrong text is Displayed" + devops);
		}
	}
}
