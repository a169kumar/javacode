import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validate_textpresent_inprimusBank {

	public static void main(String[] args) throws IOException {
		String actdata, expdata;
		FileReader fr= new FileReader("G:\\Selenium Automation\\Test File Reading\\src\\primusbank.txt");
		BufferedReader br= new BufferedReader(fr);
		expdata=br.readLine();
		WebDriver driver= new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		actdata=driver.findElement(By.xpath("//tr[4]/td/table/tbody/tr[2]/td[1]/p[1]")).getText();
		if (expdata.equalsIgnoreCase(actdata))
		{
			System.out.println("content test passed");
		}else
		{
			System.out.println("Content test not passed");
		}
		br.close();
		fr.close();
		
	}

}
