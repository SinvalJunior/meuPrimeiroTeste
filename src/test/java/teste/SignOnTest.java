package teste;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignOnTest {
    @Test
    public void testOpenWindow(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");
                WebDriver navegador = new ChromeDriver();

                navegador.get("http://www.google.com");
                navegador.quit();
        assertEquals(1,2);
    }
}
