package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridPage {
    public void clickOnHybridReadMore() {
        this.hybridReadMore.click();
    }

    public WebElement getHybridTitle() {
        return hybridTitle;
    }

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/p")
    private  WebElement hybridTitle;

    public HybridPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private  WebElement hybridReadMore;
}
