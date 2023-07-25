package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {
    /*Driver base que sera usado pelas pages*/
    protected WebDriver driver;

    /*
    *construtor base para criação da fabrica de elementos (PageFactory)
    */
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
