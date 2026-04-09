package practiceMavenProject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotPractice {

	public static void main(String[] args) throws IOException, InterruptedException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd'T'HH_mm_ss");
		
		String screenshotFileName = sdf.format(new Date());
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE); //This is used to take picture/screenshot of screen
		
		String screenshotFilePath = "C:\\Harshali Learn Automation\\ScreenshotPractice\\" + screenshotFileName + ".png";
		
		File destFile = new File(screenshotFilePath);
	
		FileUtils.copyFile(srcFile, destFile);
	}

}
