package automation.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    private WebDriver driver;
    private final String URL_BASE = "https://www.google.com.br/?hl=pt-BR";
    private final String PATH = "src/test/java/automation/resources/chromedriver";

    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", PATH);
        driver = new ChromeDriver();
    }


    @Test
    public void pesquisa() {
        iniciar();
        driver.get(URL_BASE);
        driver.close();
        driver.quit();
    }
}
