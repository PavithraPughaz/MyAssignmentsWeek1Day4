package week1.day4;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launchchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");

	}

}
