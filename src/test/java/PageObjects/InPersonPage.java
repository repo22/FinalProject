package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InPersonPage {
    public void clickOnInpersonReadMore() {
        this.inpersonReadMore.click();
    }

    public WebElement getInpersonTitle() {
        return inpersonTitle;
    }

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/p")
    private  WebElement inpersonTitle;

    public InPersonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private  WebElement inpersonReadMore;
}
