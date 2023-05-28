package Java_Program;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reverse_String_Program {
	@Test
	public void startBrwser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/flights/?gclid=Cj0KCQjw98ujBhCgARIsAD7QeAin0mqLjj0C44kUtlDtzQrxMJtpJB8K9p-SrdLPyH1EtYobFhpZ6y0aAnFBEALw_wcB&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|ETA|Regular|V2|529647798181&s_kwcid=AL!1631!3!529647798181!e!!g!!make%20my&ef_id=Cj0KCQjw98ujBhCgARIsAD7QeAin0mqLjj0C44kUtlDtzQrxMJtpJB8K9p-SrdLPyH1EtYobFhpZ6y0aAnFBEALw_wcB:G:s");
		Assert.assertEquals(false, true);
		driver.quit();
	}

}
