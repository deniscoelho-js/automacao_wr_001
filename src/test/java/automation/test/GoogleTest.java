package automation.test;

import automation.page.GooglePO;
import org.junit.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class GoogleTest extends BaseTest {

    private static GooglePO googlePage;
    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePO(driver);
    }

    @Test
    public void devePesquisarNoGoogle() {

        googlePage.pesquisar("Batata frita");
        String resultado = googlePage.obterResultadoDaPesquisa();
        Assert.assertTrue(resultado, resultado.contains("Aproximadamente"));

        driver.close();
    }
}
