package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualPage {
    public WebElement getVirtualTitle() {
        return virtualTitle;
    }

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/p")
    private  WebElement virtualTitle;

    public VirtualPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private  WebElement virtualReadMore;

    public void clickOnVirtualReadMore() {
        this.virtualReadMore.click();
    }
}
