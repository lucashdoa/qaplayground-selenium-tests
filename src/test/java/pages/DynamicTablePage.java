package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import core.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class DynamicTablePage extends BaseTest {

    @FindBy(xpath = "//table//td//div[text()=\"Spider-Man\"]/ancestor::tr/td[3]/span")
    WebElement spiderManRealName;

    public DynamicTablePage() {
        PageFactory.initElements(this.driver, this);
    }

    public String getSpiderManRealName() {
        return spiderManRealName.getText();
    }
}
