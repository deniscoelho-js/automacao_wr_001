package automation.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleTest extends BaseTest {

    //16:28
    @BeforeClass
    public static void prepararTestes(){

    }

    @Test
    public void devePesquisarNoGoogle() {
        WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("Batata frita" + Keys.ENTER);

        String resultado = driver.findElement(By.id("result-stats")).getText();

        driver.close();
    }
}
