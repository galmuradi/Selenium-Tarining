package RunTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser2 {
	
    @Test
    public void Test3() 
    {
       
            
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\galmu\\eclipse-workspace\\ATest\\Driver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("http://www.google.com/");
        }
    }
