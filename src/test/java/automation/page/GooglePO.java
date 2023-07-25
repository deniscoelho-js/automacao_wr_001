package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "results-stats")
    public WebElement divResultadoPesquisa;

    protected GooglePO(WebDriver driver) {
        super(driver);
    }
}
