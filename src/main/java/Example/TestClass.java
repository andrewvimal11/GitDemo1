package Example;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestClass
{
    private WebDriver driver;
    @Test
    public  void Test() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a.mariafrancis\\IdeaProjects\\DemoMavenProject\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        String Title = driver.getTitle();
        System.out.println(Title);
        driver.quit();
    }
}
