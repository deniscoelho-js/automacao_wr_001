package automation.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected static WebDriver driver;
    private static final String URL_BASE = "https://www.google.com.br/?hl=pt-BR";
    private static final String PATH = "src/test/java/automation/resources/chromedriver";

    @BeforeClass
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver", PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}
